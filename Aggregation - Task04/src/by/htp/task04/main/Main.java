package by.htp.task04.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.htp.task04.entity.Account;
import by.htp.task04.entity.Client;
import by.htp.task04.logic.ClientLogic;
import by.htp.task04.logic.SortByBallance;
import by.htp.task04.logic.SortByNumber;
import by.htp.task04.view.ClientView;

public class Main {

	public static void main(String[] args) {

		Account account1 = new Account(468, 1567, true);
		Account account2 = new Account(114, -57, true);
		Account account3 = new Account(795, -140, true);
		Account account4 = new Account(97, 259, false);
		Account account5 = new Account(5, 1431, true);

		List<Account> accounts = new ArrayList<Account>();
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		accounts.add(account4);
		accounts.add(account5);

		Client client = new Client("Viachaslau", "Luchko", accounts);

		ClientView view = new ClientView();

		// Сортировка по баллансу.
		Collections.sort(client.getAccounts(), new SortByBallance());
		// view.clientView(client);

		// Сортировка по номеру счета.
		Collections.sort(client.getAccounts(), new SortByNumber());
		view.clientView(client);

		ClientLogic clientlogic = new ClientLogic();

		// Сумма всех счетов.
		view.viewSum("Summary ", clientlogic.sumBallance(client));

		// Сумма положительных счетов.
		view.viewSum("Positive ", clientlogic.sumPositiveBallance(client));

		// Сумма отрицательных счетов.
		view.viewSum("Negative ", clientlogic.sumNegativeBallance(client));
	}

}
