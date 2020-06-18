package main;

import chain.CityCourier;
import chain.CountryCourier;
import chain.InternationalCourier;
import observer.CWorker;
import state.WaitingState;

public class MainClass {

	public static void main(String[] args) {
		
		CWorker worker = new CWorker();
		
		Courier kardjaliCourier = new CityCourier();
		Courier bulgariaCourier = new CountryCourier();
		Courier internationalCourier = new InternationalCourier();
		
		WaitingState waitingState = new WaitingState();
		
		worker.setName("[CW]");
		kardjaliCourier.setName("[Kardjali]");
		bulgariaCourier.setName("[BG]");
		internationalCourier.setName("[I]");

		kardjaliCourier.setNextCourier(bulgariaCourier);
		bulgariaCourier.setNextCourier(internationalCourier);
		
		System.out.println("-------- Initiazlization --------\n");
		waitingState.applyState(kardjaliCourier);
		waitingState.applyState(bulgariaCourier);
		waitingState.applyState(internationalCourier);
		System.out.println("\n---------------------------------\n");

		
		kardjaliCourier.subscribe(worker);
		bulgariaCourier.subscribe(worker);
		internationalCourier.subscribe(worker);
		
		System.out.println("order - num 1");
		internationalCourier.acceptShipment(1);
		System.out.println("\n order - num 1.2");
		bulgariaCourier.acceptShipment(2);
		System.out.println("\n order - num 1.3");
		kardjaliCourier.acceptShipment(3);
				
	}

}