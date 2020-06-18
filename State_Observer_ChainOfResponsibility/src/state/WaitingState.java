package state;

import observer.Observable;

public class WaitingState implements State {

	private String stateName = "Waiting next station";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
	}
	
	public String getStateName() {
		return this.stateName;
	}

	@Override
	public void resetState(Observable observable) {
		
	}
}