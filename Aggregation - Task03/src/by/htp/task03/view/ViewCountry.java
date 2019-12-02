package by.htp.task03.view;

import by.htp.task03.entity.Country;
import by.htp.task03.entity.Region;

public class ViewCountry {

	public void viewCapital(Country country) {

		System.out.println(country.getCapital());
	}

	public void viewNumberOfRegions(Country country, int count) {

		System.out.println("In " + country.getName() + " " + count + " region");
	}

	public void viewArea(Country country) {

		System.out.println("Area: " + country.getSquare());
	}

	public void viewRegionCapital(Country country) {

		for (Region i : country.getRegions()) {
			System.out.println(i.getCapital().getName().toString());
		}

	}
}
