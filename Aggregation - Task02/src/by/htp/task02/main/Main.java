package by.htp.task02.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.task02.entity.Auto;
import by.htp.task02.entity.Engine;
import by.htp.task02.entity.Wheel;
import by.htp.task02.logic.AutoLogic;
import by.htp.task02.view.View;

public class Main {

	/*
	 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
	 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку
	 * автомобиля.
	 */

	public static void main(String[] args) {

		Wheel wheel1 = new Wheel(15, 185, "Summer", true);
		Wheel wheel2 = new Wheel(15, 185, "Summer", true);
		Wheel wheel3 = new Wheel(15, 185, "Summer", true);
		Wheel wheel4 = new Wheel(15, 185, "Summer", true);
		Wheel reserveWheel = new Wheel(14, 120, "Multi", false);

		List<Wheel> wheels = new ArrayList<Wheel>();
		wheels.add(wheel1);
		wheels.add(wheel2);
		wheels.add(wheel3);
		wheels.add(wheel4);
		wheels.add(reserveWheel);

		Engine engine = new Engine("Bensin", 7.5, 150, 10);

		Auto auto = new Auto("BMW", engine, wheels);

		View view = new View();

		view.viewAuto(auto);
		AutoLogic logic = new AutoLogic();

		// Смена колеса.
		logic.changeWheel(wheels, reserveWheel);

		// Заправка.
		logic.refuelAuto(auto, 130, view);
		view.viewAmountOfFuel(auto);

		// Ехать.
		view.autoDistance(logic,logic.drive(auto, view));
	}

}
