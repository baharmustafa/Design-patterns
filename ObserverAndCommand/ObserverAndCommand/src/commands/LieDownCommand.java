package commands;

import patterns.Trained;

public class LieDownCommand implements Exercise {

    private Trained trained;

    public LieDownCommand(Trained trained) {
        this.trained = trained;
    }

    @Override
    public void performExercise() {
        this.trained.performLieDown();
    }
}