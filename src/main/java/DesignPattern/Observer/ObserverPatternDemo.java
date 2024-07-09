package DesignPattern.Observer;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();

        NewsReader reader1 = new NewsReader("Hello reader 1");
        NewsReader reader2 = new NewsReader("Hello reader 2");

        newsPublisher.registerObserver(reader1);
        newsPublisher.registerObserver(reader2);

        newsPublisher.updateNews("Latest news broadcasted");

        newsPublisher.unregisterObserver(reader2);

        newsPublisher.updateNews("Latest news after reader unregistered");
    }
}
