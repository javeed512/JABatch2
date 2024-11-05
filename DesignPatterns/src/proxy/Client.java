package proxy;

import java.io.IOException;

public class Client {

	public static void main(String[] args) throws IOException {

		
		
		
CommandExecutor proxyExecutor = new CommandExecutorProxy("javeed", "tiger");

		try {
			proxyExecutor.runCommand("mkdir");// ls,git,mkdir,dir,copy,cat
		} catch (Exception e) {

			System.err.println("Exception message: " + e.getMessage());

		}

	}

}
