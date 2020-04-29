package patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import Exercise.ExerciseEnum;

public class Trained extends Observable {
	private ExerciseEnum exerciseType;
    private List<Viewer> Viewers = new ArrayList<Viewer>();

    public void performLieDown() {
        System.out.println("Trained performing lie down");
        setExerciseEnum(ExerciseEnum.Lie_Down);
        setChanged();
        notifyObservers(ExerciseEnum.Lie_Down);
    }

    public void performGetUp() {
        System.out.println("Trained performing get up");
        setExerciseEnum(ExerciseEnum.Get_Up);
        setChanged();
        notifyObservers(ExerciseEnum.Get_Up);
    }

    public ExerciseEnum getExerciseType() {
        return exerciseType;
    }

    public void setExerciseEnum(ExerciseEnum exerciseType) {
        this.exerciseType = exerciseType;
    }
}
