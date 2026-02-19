package lldpractice.ProxyPattern;

public class DatabaseConnection {
    private String videoUrl;
    public DatabaseConnection(String videoUrl){
        this.videoUrl = videoUrl;
    }

    public String getVideo(){
        return "This is the video with : " + videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
