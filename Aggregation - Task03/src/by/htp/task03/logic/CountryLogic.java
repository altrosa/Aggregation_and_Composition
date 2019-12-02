package by.htp.task03.logic;

import by.htp.task03.entity.Country;

public class CountryLogic {

	public int countRegion(Country country) {

		int count = country.getRegions().size() + 1;

		return count;
	}

}
