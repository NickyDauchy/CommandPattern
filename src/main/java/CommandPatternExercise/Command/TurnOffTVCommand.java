package CommandPatternExercise.Command;

import CommandPatternExercise.ReceiverTV;

public class TurnOffTVCommand implements TVRemoteCommand {
    ReceiverTV TV;
    //reference to the TV

    public TurnOffTVCommand(ReceiverTV TV) {
        this.TV = TV;
    }

    @Override
    public void execute() {
        TV.turnOff();
    }

}
