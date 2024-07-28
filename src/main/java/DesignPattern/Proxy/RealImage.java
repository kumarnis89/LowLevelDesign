package DesignPattern.Proxy;

public class RealImage implements Image{
    private String filename;

    public RealImage(String filename) {
        System.out.println("Image object created");
        this.filename = filename;
        loadFromDisk(filename);
    }

    private void loadFromDisk(String filename){
        System.out.println("loading " + filename + " from disk");
    }
    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
}
