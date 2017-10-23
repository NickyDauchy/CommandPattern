package CommandPatternExercise;

import CommandPatternExercise.Command.TVRemoteCommand;

public class InvokerTVRemoteControl {
    private TVRemoteCommand command;
    public void setCommand(TVRemoteCommand command){

        this.command = command;

    }

    public void pressButton(){

        command.execute();

    }

}
