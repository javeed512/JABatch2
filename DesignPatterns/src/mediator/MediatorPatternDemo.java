package mediator;

public class MediatorPatternDemo {

	public static void main(String[] args) {

		User user1 = new User("tom");

		user1.sendMessage("hello friends am tom");

		User user2 = new User("jerry");

		user2.sendMessage("hi folks am jerry");

	}

}
