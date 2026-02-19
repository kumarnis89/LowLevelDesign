package AlexaDevice_2;

public class OnlyAudioAlexaDevice extends AlexaDevice implements IAudio{

    public OnlyAudioAlexaDevice(IBattery battery, ChargeBehaviour chargeBehaviour){
        super(battery, chargeBehaviour);
    }

    @Override
    public void playAudio(){
        System.out.println("Playing Audio");
    }

}
