package main;
import java.util.ArrayList;
import java.util.List;

import observer.Observable;
import observer.Observer;
import state.Context;
import state.State;

public abstract class Courier implements Context, Observable{
	
	public static int City = 1;
	public static int Country = 2;
	public static int International = 3;
	protected State state;
	
	protected List<Observer> observers = new ArrayList<Observer>();
	
	protected int num;
	
	protected String name;
	
	protected Courier nextCourier;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public void setNextCourier(Courier nextLogger) {
		this.nextCourier = nextLogger;
	}
	
	public void acceptShipment(int num) {
		
		
		if(this.num >= num) {
			this.handleOrder();
		}
		
		else if(this.nextCourier != null) {
			System.out.println(this.name + " could not handle it.");
			
			this.nextCourier.acceptShipment(num);
		}
		
	}
	
	abstract protected void handleOrder();
	
}