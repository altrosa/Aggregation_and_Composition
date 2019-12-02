package by.htp.task02.entity;

public class Engine {

	private String type;
	private double cunsuptionOfFuel;
	private int tankVolume;
	private double amountOfFuel;

	public Engine() {

		this.cunsuptionOfFuel = 0;
		this.tankVolume = 0;
		this.amountOfFuel = 0;
		this.type = "Set type";

	}

	public Engine(String type, double cunsuptionOfFuel, int tankVolume, double amountOfFuel) {

		this.type = type;
		this.cunsuptionOfFuel = cunsuptionOfFuel;
		this.tankVolume = tankVolume;
		this.amountOfFuel = amountOfFuel;

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCunsuptionOfFuel() {
		return cunsuptionOfFuel;
	}

	public void setCunsuptionOfFuel(int cunsuptionOfFuel) {
		this.cunsuptionOfFuel = cunsuptionOfFuel;
	}

	public int getTankVolume() {
		return tankVolume;
	}

	public void setTankVolume(int tankVolume) {
		this.tankVolume = tankVolume;
	}

	public double getAmountOfFuel() {
		return amountOfFuel;
	}

	public void setAmountOfFuel(double amountOfFuel) {
		this.amountOfFuel = amountOfFuel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amountOfFuel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cunsuptionOfFuel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + tankVolume;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Engine other = (Engine) obj;
		if (Double.doubleToLongBits(amountOfFuel) != Double.doubleToLongBits(other.amountOfFuel))
			return false;
		if (Double.doubleToLongBits(cunsuptionOfFuel) != Double.doubleToLongBits(other.cunsuptionOfFuel))
			return false;
		if (tankVolume != other.tankVolume)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", cunsuptionOfFuel=" + cunsuptionOfFuel + ", tankVolume=" + tankVolume
				+ ", amountOfFuel=" + amountOfFuel + "]";
	}

}
