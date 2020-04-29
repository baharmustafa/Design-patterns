package commands;

import patterns.Trained;

public class GetUpCommand implements Exercise {

    private Trained trained;

    public GetUpCommand(Trained trained) {
        this.trained = trained;
    }

    @Override
    public void performExercise() {
        this.trained.performGetUp();
    }
}
