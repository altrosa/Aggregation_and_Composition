package by.htp.task02.view;

import java.util.List;

import by.htp.task02.entity.Auto;
import by.htp.task02.entity.Wheel;
import by.htp.task02.logic.AutoLogic;

public class View {

	public void viewAuto(Auto auto) {
		System.out.println("Model: " + auto.getModel());
	}

	public void viewWheelsSeasonType(List<Wheel> wheels) {

		for (int i = 0; i < wheels.size(); i++) {

			System.out.println("Wheels: " + wheels.get(i).getSeasonType());
		}

	}

	public void viewAmountOfFuel(Auto auto) {

		System.out.println("Amount of fuel: " + auto.getEngine().getAmountOfFuel());
	}

	public void tankVolumeError() {

		System.out.println("Fuel tank is full!");
	}

	public void fuelIsOver() {

		System.out.println("Fuel is over!");
	}

	public void autoDistance(AutoLogic logic, double distance) {

		System.out.println("With the remaining fuel you will drive: " + distance + " km");
	}

}
