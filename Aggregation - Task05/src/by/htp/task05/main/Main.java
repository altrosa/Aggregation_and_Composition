package by.htp.task05.main;

import by.htp.task05.entity.FoodType;
import by.htp.task05.entity.Tour;
import by.htp.task05.entity.TourAgency;
import by.htp.task05.entity.TourType;
import by.htp.task05.entity.Transport;
import by.htp.task05.logic.TourLogic;
import by.htp.task05.view.ViewTour;

public class Main {

	public static void main(String[] args) {

		Tour tour1 = new Tour("Amsterdam", 5, "22.10", Transport.AUTOBUS, TourType.EXСURSION, FoodType.BB);
		Tour tour2 = new Tour("Germany", 3, "15.10", Transport.TRAIN, TourType.GASTROTOUR, FoodType.UAI);
		Tour tour3 = new Tour("Chezh Republic", 7, "28.10", Transport.TRAIN, TourType.RECOVERY, FoodType.AI);
		Tour tour4 = new Tour("Poland", 1, "30.10", Transport.AUTOBUS, TourType.SHOP, FoodType.HB);

		TourAgency agency = new TourAgency("Your choice");

		agency.getTours().add(tour1);
		agency.getTours().add(tour2);
		agency.getTours().add(tour3);
		agency.getTours().add(tour4);

		ViewTour view = new ViewTour();

		TourLogic logic = new TourLogic();

		// Поиск тура.
		view.viewTour(logic.sortList(agency, Transport.AUTOBUS, FoodType.BB, 5));

		// Сортировка по длительности.
		logic.sortDuration(agency);
		view.viewTour(agency.getTours());

	}

}
