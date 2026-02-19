package AlexaDevice_2;

public class OnlyScreenAlexaDevice extends AlexaDevice implements IScreen{

    public OnlyScreenAlexaDevice(IBattery battery, ChargeBehaviour chargeBehaviour){
        super(battery, chargeBehaviour);
    }

    @Override
    public void displayView(){
        System.out.println("Displaying view on screen");
    }
}
