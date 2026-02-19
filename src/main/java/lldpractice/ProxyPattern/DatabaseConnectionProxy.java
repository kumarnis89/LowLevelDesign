package lldpractice.ProxyPattern;

public class DatabaseConnectionProxy {
    private String videoUrl;

    public DatabaseConnectionProxy(String videoUrl){
        this.videoUrl = videoUrl;
    }

    public String getVideo(){
        DatabaseConnection dc = new DatabaseConnection(videoUrl);
        return dc.getVideo();
    }

}
