package observer;
import java.util.ArrayList;
import java.util.List;

public class CWorker implements Observer {

	private String name;
	
	@Override
	public void update(Observable courier) {
		if(courier.getUpdate() == null) {
			System.out.println("No state");
			return;
		}
		
		
		if(courier.getUpdate().equals("Preparing shipment"))
		{
			System.out.println(this.getName() + " imate pratka ot " + 
							   courier.getName() + " ");
			courier.getState().resetState(courier);		
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
