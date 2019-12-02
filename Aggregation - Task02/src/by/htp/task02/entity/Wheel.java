package by.htp.task02.entity;

public class Wheel {

	private int diametr;
	private int width;
	private String seasonType;
	private boolean status;

	public Wheel() {

		this.diametr = 0;
		this.width = 0;
		this.seasonType = "Set seasonType";
		this.status = true;
	}

	public Wheel(int diametr, int width, String seasonType, boolean status) {

		this.diametr = diametr;
		this.width = width;
		this.seasonType = seasonType;
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getSeasonType() {
		return seasonType;
	}

	public void setSeasonType(String seasonType) {
		this.seasonType = seasonType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diametr;
		result = prime * result + ((seasonType == null) ? 0 : seasonType.hashCode());
		result = prime * result + (status ? 1231 : 1237);
		result = prime * result + width;
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
		Wheel other = (Wheel) obj;
		if (diametr != other.diametr)
			return false;
		if (seasonType == null) {
			if (other.seasonType != null)
				return false;
		} else if (!seasonType.equals(other.seasonType))
			return false;
		if (status != other.status)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wheel [diametr=" + diametr + ", width=" + width + ", seasonType=" + seasonType + ", status=" + status
				+ "]";
	}

}
