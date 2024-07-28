package DesignPattern.Adapter;

public class AdvancedMediaPlayer{
    public void playVlc(String filename){
        System.out.println("Playing vlc file" + filename);
    }

    public void playMp4(String filename){
        System.out.println("Playing Mp4 file" + filename);
    }
}
