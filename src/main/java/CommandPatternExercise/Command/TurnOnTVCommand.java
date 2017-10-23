package CommandPatternExercise.Command;

import CommandPatternExercise.ReceiverTV;

public class TurnOnTVCommand implements TVRemoteCommand {
    ReceiverTV TV;
    //reference to the TV

    public TurnOnTVCommand(ReceiverTV TV) {
        this.TV = TV;
    }

    @Override
    public void execute() {
        TV.turnOn();
    }

}

