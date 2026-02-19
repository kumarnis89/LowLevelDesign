package AlexaDevice_2;

public class NoBattery implements IBattery{

    @Override
    public String getBatteryStatus(){
        return "No Battery Available";
    }
}
