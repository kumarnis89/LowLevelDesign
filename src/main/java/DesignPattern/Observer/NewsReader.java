package DesignPattern.Observer;

public class NewsReader implements Observer{
    private String news;

    public NewsReader(String news) {
        this.news = news;
    }

    @Override
    public void update(String news) {
        System.out.println("Currently posted news : " + news);
    }
}
