package by.htp.task04.entity;

public class Account {

	private int number;
	private int ballance;
	private boolean status;

	public Account() {

		this.number = 0;
		this.ballance = 0;
		this.status = true;
	}

	public Account(int number, int ballance, boolean status) {

		this.number = number;
		this.ballance = ballance;
		this.status = status;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getBallance() {
		return ballance;
	}

	public void setBallance(int ballance) {
		this.ballance = ballance;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ballance;
		result = prime * result + number;
		result = prime * result + (status ? 1231 : 1237);
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
		Account other = (Account) obj;
		if (ballance != other.ballance)
			return false;
		if (number != other.number)
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", ballance=" + ballance + ", status=" + status + "]";
	}

}
