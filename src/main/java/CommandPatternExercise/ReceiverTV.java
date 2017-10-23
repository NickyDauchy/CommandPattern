package CommandPatternExercise;

public class ReceiverTV {
    private Boolean on ;
    private int volume =0;



    public void turnOn() {
        // Turning On TV
        on = true;
    }

    public void turnOff() {
        // Turning Off TV
        on = false;
    }

    public void volumeUp(){
        volume++;
    }

    public void volumeDown(){
        volume--;
    }

}
