package DesignPattern.Composite;

public class Samsung implements Item{
    @Override
    public double cost() {
        return 1200.0;
    }

    @Override
    public String description() {
        return "Samsung Galaxy 22 ultra pro";
    }
}
