package DesignPattern.Facade;


class FacadeDemoTest {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();

        FacadeDemo homeTheater = new FacadeDemo(dvdPlayer, amplifier, projector, lights, screen);
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}