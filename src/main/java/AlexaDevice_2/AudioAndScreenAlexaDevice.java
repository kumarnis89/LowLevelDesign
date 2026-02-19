package AlexaDevice_2;

public class AudioAndScreenAlexaDevice extends AlexaDevice implements IAudio, IScreen{

    public AudioAndScreenAlexaDevice(IBattery battery, ChargeBehaviour chargeBehaviour){
        super(battery, chargeBehaviour);
    }

    @Override
    public void playAudio(){
        System.out.println("Playing Audio");
    }

    @Override
    public void displayView(){
        System.out.println("Displaying View on Screen");
    }

}
