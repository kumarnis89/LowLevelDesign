package AlexaDevice_2;

public class InternalBattery implements IBattery{
    private int batteryPercentage;

    public InternalBattery(int percentage){
        this.batteryPercentage = percentage;
    }

    public void setBatteryPercentage(int batteryPercentage){
        this.batteryPercentage = batteryPercentage;
    }

    public int getBatteryPercentage(){
        return this.batteryPercentage;
    }

    @Override
    public String getBatteryStatus(){
        return "Battery %age : " + this.batteryPercentage;
    }
}
