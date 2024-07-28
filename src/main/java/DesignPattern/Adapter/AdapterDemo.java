package DesignPattern.Adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("song.mp3","mp3");
        audioPlayer.play("song.vlc","vlc");
        audioPlayer.play("song.Mp4","Mp4");
        audioPlayer.play("song.avi","avi");
    }
}
