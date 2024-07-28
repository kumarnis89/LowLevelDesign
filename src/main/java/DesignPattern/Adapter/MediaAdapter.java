package DesignPattern.Adapter;

public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new AdvancedMediaPlayer();
        }
        else if(audioType.equalsIgnoreCase("Mp4")){
            advancedMediaPlayer = new AdvancedMediaPlayer();
        }

    }
    @Override
    public void play(String filename, String filetype) {
        if(filetype.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(filename);
        }
        else if(filetype.equalsIgnoreCase("Mp4")){
            advancedMediaPlayer.playMp4(filename);
        }
    }
}
