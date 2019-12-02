package by.htp.task03.entity;

import java.util.ArrayList;
import java.util.List;

public class District {

	private String name;
	private City capital;
	private List<City> cities;

	public District(String name, City capital) {

		this.name = name;
		this.capital = capital;
		this.cities = new ArrayList<City>();
	}

	public District(String name, City capital, List<City> cities) {

		this.name = name;
		this.capital = capital;
		this.cities = cities;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public City getCities(int i) {
		return cities.get(i);
	}

	public void setCities(City city) {
		this.cities.add(city);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District [name=" + name + ", capital=" + capital + ", cities=" + cities + "]";
	}

}
