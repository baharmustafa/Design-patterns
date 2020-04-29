package patterns;

import commands.GetUpCommand;
import commands.LieDownCommand;

public class Trainer {
	GetUpCommand getUpCommand;
    LieDownCommand lieDownCommand;

    public void setGetUpCommand(GetUpCommand getUpCommand) {
        this.getUpCommand = getUpCommand;
    }

    public void setLieDownCommand(LieDownCommand lieDownCommand) {
        this.lieDownCommand = lieDownCommand;
    }

    public void executeGetUpCommand() {
        System.out.println("Trainer invokes Get_Up command!\n");
        getUpCommand.performExercise();
    }

    public void executeLieDownCommand() {
        System.out.println("Trainer invokes Lie_Down command!\n");
        lieDownCommand.performExercise();
    }

}
