package DesignPattern.Facade;

public class FacadeDemo {
    private DVDPlayer dvdPlayer;
    private Amplifier amplifier;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;

    public FacadeDemo(DVDPlayer dvd, Amplifier amp, Projector proj, TheaterLights lights, Screen screen) {
        this.dvdPlayer = dvd;
        this.amplifier = amp;
        this.projector = proj;
        this.lights = lights;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down movie theater...");
        dvdPlayer.stop();
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        screen.up();
        lights.dim(100);
    }
}
