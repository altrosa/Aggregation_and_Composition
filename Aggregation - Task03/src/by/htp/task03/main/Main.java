package by.htp.task03.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.task03.entity.City;
import by.htp.task03.entity.Country;
import by.htp.task03.entity.District;
import by.htp.task03.entity.Region;
import by.htp.task03.logic.CountryLogic;
import by.htp.task03.view.ViewCountry;

public class Main {

	public static void main(String[] args) {

		Region region1 = new Region("Minsk", new City("Minsk"));

		region1.setDistricts(new District("Minsk", region1.getCapital()));
		region1.getDistricts(0).setCapital(region1.getCapital());

		region1.setDistricts(new District("Soligorsk", new City("Soligorsk")));
		region1.getDistricts(1).setCapital(region1.getDistricts(1).getCapital());

		region1.setDistricts(new District("Slutsk", new City("Slutsk")));
		region1.getDistricts(2).setCapital(region1.getDistricts(2).getCapital());

		region1.setDistricts(new District("Lagoisk", new City("Lagoisk")));
		region1.getDistricts(3).setCapital(region1.getCapital());

		List<Region> regions = new ArrayList<Region>();
		regions.add(region1);

		Country country = new Country("Belarus", "Minsk", 207595, regions);

		// Столица
		ViewCountry view = new ViewCountry();
		view.viewCapital(country);

		// Количество областей
		CountryLogic logic = new CountryLogic();
		view.viewNumberOfRegions(country, logic.countRegion(country));

		// Площадь
		view.viewArea(country);

		view.viewRegionCapital(country);
	}
}