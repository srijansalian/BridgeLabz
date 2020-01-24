package com.bridgelabz.DesignPattern.behavioral.mediator;

public class Chat {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImp();

		User user1 = new UserImp(mediator, "Srijan");
		User user2 = new UserImp(mediator, "Brijesh");
		User user3 = new UserImp(mediator, "Nayana");
		User user4 = new UserImp(mediator, "Deepak");

		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);

		user1.send("Hello.....!!!!!");

	}

}
