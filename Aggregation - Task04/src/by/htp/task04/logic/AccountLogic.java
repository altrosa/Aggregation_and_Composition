package by.htp.task04.logic;

import by.htp.task04.entity.Account;

public class AccountLogic {

	public void setAccountStatus(Account account, int number) {

		if (account.getNumber() == number) {
			if (account.isStatus()) {
				
				account.setStatus(true);
			} else {
				
				account.setStatus(false);
			}

		}

	}

}
