package by.htp.task05.entity;

public class Tour {

	private String country;
	private int duration;
	private String date;
	private Transport transport;
	private TourType tourtype;
	private FoodType foodtype;

	public Tour(String country, int duration, String date, Transport transport, TourType tourtype, FoodType foodtype) {

		this.country = country;
		this.duration = duration;
		this.date = date;
		this.transport = transport;
		this.tourtype = tourtype;
		this.foodtype = foodtype;

	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public TourType getTourtype() {
		return tourtype;
	}

	public void setTourtype(TourType tourtype) {
		this.tourtype = tourtype;
	}

	public FoodType getFoodtype() {
		return foodtype;
	}

	public void setFoodtype(FoodType foodtype) {
		this.foodtype = foodtype;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + duration;
		result = prime * result + ((foodtype == null) ? 0 : foodtype.hashCode());
		result = prime * result + ((tourtype == null) ? 0 : tourtype.hashCode());
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
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
		Tour other = (Tour) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (duration != other.duration)
			return false;
		if (foodtype != other.foodtype)
			return false;
		if (tourtype != other.tourtype)
			return false;
		if (transport != other.transport)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tour [country=" + country + ", duration=" + duration + ", date=" + date + ", transport=" + transport
				+ ", tourtype=" + tourtype + ", foodtype=" + foodtype + "]";
	}

}
