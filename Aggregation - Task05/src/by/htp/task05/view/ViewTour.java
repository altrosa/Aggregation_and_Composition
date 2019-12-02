package by.htp.task05.view;

import java.util.List;

import by.htp.task05.entity.Tour;

public class ViewTour {

	public void viewTour(List<Tour> tours) {

		for (Tour tour : tours) {

			System.out.println("Tours:");
			System.out.print(tour.getCountry());
			System.out.print(", Date: " + tour.getDate());
			System.out.print(", " + tour.getDuration() + " days");
			System.out.print(", " + tour.getTourtype());
			System.out.print(", Transport: " + tour.getTransport());
			System.out.print(", Food: " + tour.getFoodtype());

		}
	}
}