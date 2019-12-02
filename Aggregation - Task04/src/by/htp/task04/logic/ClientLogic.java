package by.htp.task04.logic;

import by.htp.task04.entity.Client;

public class ClientLogic {

	public int sumBallance(Client client) {

		int count = 0;

		for (int i = 0; i < client.getAccounts().size(); i++) {

			count = count + client.getAccounts().get(i).getBallance();
		}
		return count;
	}

	public int sumPositiveBallance(Client client) {

		int count = 0;

		for (int i = 0; i < client.getAccounts().size(); i++) {

			if (client.getAccounts().get(i).getBallance() > 0) {

				count = count + client.getAccounts().get(i).getBallance();
			}

		}
		return count;
	}

	public int sumNegativeBallance(Client client) {

		int count = 0;

		for (int i = 0; i < client.getAccounts().size(); i++) {

			if (client.getAccounts().get(i).getBallance() < 0) {

				count = count + client.getAccounts().get(i).getBallance();
			}

		}
		return count;
	}

}
