package patterns;

import commands.GetUpCommand;
import commands.LieDownCommand;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trained trained = new Trained();

        // commands
        LieDownCommand lieDownCommand = new LieDownCommand(trained);
        GetUpCommand getUpCommand = new GetUpCommand(trained);
        // invoker of commands
        Trainer trainer = new Trainer();

        // observers of trainee
        Viewer Viewer1 = new Viewer("Maria");
        Viewer Viewer2 = new Viewer("Sasho");
        Viewer Viewer3 = new Viewer("Aleks");

        trained.addObserver(Viewer1);
        trained.addObserver(Viewer2);
        trained.addObserver(Viewer3);

        trainer.setGetUpCommand(getUpCommand);
        trainer.setLieDownCommand(lieDownCommand);

        trainer.executeGetUpCommand();
        trainer.executeLieDownCommand();

	}

}
