package DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Subject{

    private final List<Observer> observerList;
    private String latestNews;

    public NewsPublisher() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer ob : observerList){
            ob.update(latestNews);
        }
    }

    public void updateNews(String news){
        this.latestNews = news;
        notifyAllObservers();
    }
}
