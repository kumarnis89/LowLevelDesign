package AlexaDevice_2;

import java.util.Arrays;

public abstract class AlexaDevice implements IDevice {
    private final IBattery battery;
    private final ChargeBehaviour chargeBehaviour;

    public AlexaDevice(IBattery battery, ChargeBehaviour chargeBehaviour){
        this.battery = battery;
        this.chargeBehaviour = chargeBehaviour;
    }

    public ChargeBehaviour getChargeBehaviour(){
        return this.chargeBehaviour;
    }

    public IBattery getBattery(){
        return this.battery;
    }

    public void setBatteryPercentage(int percentage){
        if(this.battery  instanceof InternalBattery ib){
            ib.setBatteryPercentage(percentage);
        }
    }

    public void setChargeStatus(boolean pluggedIn){
        if(this.chargeBehaviour instanceof ChargeableBehaviour cb){
            cb.setChargingStatus(pluggedIn);
        }
    }

    @Override
    public String getDeviceStatus(){
        return String.join(" ", Arrays.asList(battery.getBatteryStatus(), chargeBehaviour.getChargingStatus()));
    }
}
