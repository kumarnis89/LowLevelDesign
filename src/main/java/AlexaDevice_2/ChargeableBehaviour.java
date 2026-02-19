package AlexaDevice_2;

public class ChargeableBehaviour implements ChargeBehaviour{
    private boolean isCharging;

    public ChargeableBehaviour(boolean isCharging){
        this.isCharging = isCharging;
    }

    public void setChargingStatus(boolean chargingStatus){
        this.isCharging = chargingStatus;
    }

    @Override
    public String getChargingStatus(){
        return this.isCharging? "Charging" : "Not Charging";
    }
}
