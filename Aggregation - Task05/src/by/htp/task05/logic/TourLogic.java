package by.htp.task05.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.htp.task05.entity.FoodType;
import by.htp.task05.entity.Tour;
import by.htp.task05.entity.TourAgency;
import by.htp.task05.entity.Transport;

public class TourLogic {

	public List<Tour> sortList(TourAgency agency, Transport transport, FoodType food, int duration) {

		List<Tour> sortTour = new ArrayList<Tour>();
		List<Tour> tours = agency.getTours();

		for (Tour tour : tours) {
			if (tour.getTransport().equals(transport) && tour.getFoodtype().equals(food)
					&& tour.getDuration() == duration) {

				sortTour.add(tour);
			}
		}
		return sortTour;
	}

	public void sortDuration(TourAgency agency) {

		Collections.sort(agency.getTours(), new TourDurationLogic());
	}

}
