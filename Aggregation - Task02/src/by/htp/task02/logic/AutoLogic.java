package by.htp.task02.logic;

import java.util.List;

import by.htp.task02.entity.Auto;
import by.htp.task02.entity.Wheel;
import by.htp.task02.view.View;

public class AutoLogic {

	public List<Wheel> changeWheel(List<Wheel> wheels, Wheel reserve) {

		for (int i = 0; i < wheels.size(); i++) {
			if (wheels.get(i).isStatus() == false) {
				wheels.remove(i);
			}
		}
		return wheels;
	}

	public Auto refuelAuto(Auto auto, double fuel, View view) {

		double count = auto.getEngine().getAmountOfFuel();

		if ((count + fuel) > auto.getEngine().getTankVolume()) {

			view.tankVolumeError();

		} else if (count >= 0) {

			auto.getEngine().setAmountOfFuel(count + fuel);
		}

		return auto;
	}

	public double drive(Auto auto, View view) {

		double distance = 0;
		double count = auto.getEngine().getAmountOfFuel();
		if ((count == 0) | (count < auto.getEngine().getCunsuptionOfFuel())) {

			view.fuelIsOver();
		} else {

			distance = ((count / auto.getEngine().getCunsuptionOfFuel()) * 100);
		}

		return distance;
	}

}
