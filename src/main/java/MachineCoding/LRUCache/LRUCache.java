package MachineCoding.LRUCache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class LRUCache<K, V> {
    private int count;
    private final int capacity;
    private final Node<K,V> head,tail;
    private final Map<K,Node<K,V>> lruMap;
    private final ReentrantLock lock;

    public LRUCache(int capacity){
        this.capacity = capacity;
        this.lock = new ReentrantLock();
        this.count = 0;
        this.head = new Node<>(null,null);
        this.tail = new Node<>(null,null);
        this.head.next = this.tail;
        this.tail.prev = this.head;
        lruMap = new HashMap<>();
    }

    private static class Node<K,V>{
        private final K key;
        private V value;
        Node<K,V> next,prev;

        public Node(K key, V value){
            this.key = key;
            this.value = value;
            this.next = this.prev = null;
        }
    }

    public V get(K key){
        lock.lock();
        try{
            Node<K,V> node = lruMap.getOrDefault(key,null);
            if(node==null) return null;
            detachNode(node);
            moveNodeToFront(node);
            return node.value;
        } finally {
            lock.unlock();
        }
    }

    private void moveNodeToFront(Node<K,V> node) {
        node.next = this.head.next;
        this.head.next.prev = node;
        node.prev = this.head;
        this.head.next = node;
    }

    private void detachNode(Node<K,V> node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void put(K key, V  value){
        lock.lock();
        try{
            Node<K,V> node = lruMap.getOrDefault(key, null);
            if(node==null){
                this.count++;
                node = new Node<>(key,value);
                lruMap.put(key,node);
            }
            else{
                node.value = value;
                detachNode(node);
            }

            //add the node to the next of head
            moveNodeToFront(node);

            if(this.count>this.capacity){
                Node<K,V> lastnode = this.tail.prev;
                System.out.println("evicting key:" + lastnode.key);
                lastnode.prev.next = this.tail;
                this.tail.prev = lastnode.prev;
                this.lruMap.remove(lastnode.key);
                lastnode.next = lastnode.prev = null;  // removes the reference to stop memory leakage
                this.count--;
            }
        } finally {
            lock.unlock();
        }
    }
}