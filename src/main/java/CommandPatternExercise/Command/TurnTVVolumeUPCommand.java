package CommandPatternExercise.Command;

import CommandPatternExercise.Command.TVRemoteCommand;
import CommandPatternExercise.ReceiverTV;

public class TurnTVVolumeUPCommand implements TVRemoteCommand {
    ReceiverTV TV;
    public TurnTVVolumeUPCommand(ReceiverTV TV) {
    }
    @Override
    public void execute() {
        TV.volumeUp();
    }
}
