package proxy;

public class CommandExecutorProxy implements CommandExecutor { 
			// proxy class implements same interface as done by business service class

	private boolean isAdmin;
	private CommandExecutor commandExecutor;

	public CommandExecutorProxy(String user, String pwd) {

		if (user.equals("javeed") && pwd.equals("tiger")) {
			isAdmin = true;
			commandExecutor = new CommandExecutorImp();

		}

	}

	@Override
	public void runCommand(String cmd) throws Exception { // implementing method with proxy logic but not business logic

		if(isAdmin) {
			
			
			commandExecutor.runCommand(cmd);
			
		}
		else {
			
			
			throw new Exception("Sorry ! only admin can run commands");
			
		}
		
		
	}

}
