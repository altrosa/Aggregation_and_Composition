package by.htp.task05.logic;

import java.util.Comparator;

import by.htp.task05.entity.Tour;

public class TourDurationLogic implements Comparator<Tour> {

	@Override
	public int compare(Tour o1, Tour o2) {

		return o1.getDuration() - o2.getDuration();

	}

}
