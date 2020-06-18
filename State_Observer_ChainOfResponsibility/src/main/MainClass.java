package main;

import chain.CityCourier;
import chain.CountryCourier;
import chain.InternationalCourier;
import observer.CWorker;
import state.WaitingState;

public class MainClass {

	public static void main(String[] args) {
		
		CWorker worker = new CWorker();
		
		Courier plovdivCourier = new CityCourier();
		Courier bulgariaCourier = new CountryCourier();
		Courier internationalCourier = new InternationalCourier();
		
		WaitingState waitingState = new WaitingState();
		
		worker.setName("[CW]");
		plovdivCourier.setName("[Plovdiv]");
		bulgariaCourier.setName("[BG]");
		internationalCourier.setName("[I]");

		plovdivCourier.setNextCourier(bulgariaCourier);
		bulgariaCourier.setNextCourier(internationalCourier);
		
		System.out.println("-------- Initiazlization --------\n");
		waitingState.applyState(plovdivCourier);
		waitingState.applyState(bulgariaCourier);
		waitingState.applyState(internationalCourier);
		System.out.println("\n---------------------------------\n");

		
		plovdivCourier.subscribe(worker);
		bulgariaCourier.subscribe(worker);
		internationalCourier.subscribe(worker);
		
		System.out.println("order - num 1");
		internationalCourier.acceptShipment(1);
		System.out.println("\n order - num 2");
		bulgariaCourier.acceptShipment(2);
		System.out.println("\n order - num 3");
		plovdivCourier.acceptShipment(3);
				
	}

}