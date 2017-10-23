package CommandPatternExercise;

import CommandPatternExercise.Command.TVRemoteCommand;
import CommandPatternExercise.Command.TurnOffTVCommand;
import CommandPatternExercise.Command.TurnOnTVCommand;
import CommandPatternExercise.Command.TurnTVVolumeUPCommand;

public class ClientTVUser {
    public static void main(String[] args)    {

        InvokerTVRemoteControl control = new InvokerTVRemoteControl();

        ReceiverTV TV = new ReceiverTV();

        TVRemoteCommand TVOn = new TurnOnTVCommand(TV);

        TVRemoteCommand TVOff = new TurnOffTVCommand(TV);

        TVRemoteCommand TVVolumeUp = new TurnTVVolumeUPCommand(TV);

        //switch on

        control.setCommand(TVOn);

        control.pressButton();

        //switch off

        control.setCommand(TVOff);

        control.pressButton();

    }
}
