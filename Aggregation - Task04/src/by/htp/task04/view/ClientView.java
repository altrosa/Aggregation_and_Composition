package by.htp.task04.view;

import by.htp.task04.entity.Client;

public class ClientView {

	public void clientView(Client client) {

		System.out.println("Client name: " + client.getName() + " " + client.getSurname());
		for (int i = 0; i < client.getAccounts().size(); i++) {
			System.out.println("ID: " + client.getAccounts().get(i).getNumber());
			System.out.println("Ballance: " + client.getAccounts().get(i).getBallance());

		}
	}

	public void viewSum(String st, int ballance) {

		System.out.println(st + "ballance:  " + ballance);

	}

}
