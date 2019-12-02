package by.htp.task04.logic;

import java.util.Comparator;

import by.htp.task04.entity.Account;

public class SortByNumber implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		if (o1.getNumber() > o2.getNumber()) {
			return 1;

		} else if (o1.getNumber() < o2.getNumber()) {
			return -1;

		} else {

			return 0;
		}
	}
}
