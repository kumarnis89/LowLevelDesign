package DesignPattern.Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("c:/profile.png");

        //image will be  loaded from disk
        proxyImage.display();

        //image is cached, will not be loaded from disk
        proxyImage.display();
    }
}
