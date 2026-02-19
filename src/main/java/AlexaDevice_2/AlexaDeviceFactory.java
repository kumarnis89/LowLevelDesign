package AlexaDevice_2;

public class AlexaDeviceFactory {
    public static AlexaDevice createAlexaDevice( DeviceType deviceType, int batteryPercentage, boolean isPlugged) throws InvalidDeviceException{
        if(deviceType==null) throw new InvalidDeviceException("Invalid Device request");
        IBattery battery;
        if(batteryPercentage>=0) battery = new InternalBattery(batteryPercentage);
        else battery = new NoBattery();

        ChargeBehaviour chargeBehaviour = new ChargeableBehaviour(isPlugged);

        switch(deviceType){
            case ECHO_DOT:
                return new OnlyAudioAlexaDevice(battery, chargeBehaviour);
            case ECHO_SHOW:
                return new AudioAndScreenAlexaDevice(battery, chargeBehaviour);
            case ECHO_SPOT:
                return new OnlyScreenAlexaDevice(battery, chargeBehaviour);
            default:
                throw new InvalidDeviceException("Invalid Device Requested");
        }
    }
}
