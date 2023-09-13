package com.interface2;

public class InterFace3 {

	abstract class DieselMachine {

		public DieselMachine() {
			System.out.println("DieselMachine-Constructor");
		}

		public void start() {
			System.out.println("Machine starting....");
		}

		public abstract void fillFuel();
	}

	public class Machine extends DieselMachine {

		public Machine() {
			System.out.println("Machine Constructor");
		}

		@Override
		public void fillFuel() {
			System.out.println("filling fuel tank....");
		}

		public static void main(String[] args) {
			Machine m = new Machine();
			m.fillFuel();
			m.start();
		}
	}

}
