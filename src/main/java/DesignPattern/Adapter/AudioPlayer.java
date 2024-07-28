package DesignPattern.Adapter;

public class AudioPlayer implements MediaPlayer{
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String filename, String filetype) {
        if(filetype.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file : " + filename);
        }
        else if(filetype.equalsIgnoreCase("vlc") || filetype.equalsIgnoreCase("Mp4")){
            mediaAdapter = new MediaAdapter(filetype);
            mediaAdapter.play(filename,filetype);
        }
        else {
            System.out.println(filetype + " Mediatype is not supported.");
        }
    }
}
