package chainofresponsibility;

public class ChainPatternDemo {
	
	
	
	private static AbstractLogger getChainOfLoggers(){

	      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
	      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
	      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

	      errorLogger.setNextLogger(fileLogger);
	      fileLogger.setNextLogger(consoleLogger);

	      return errorLogger;	
	   }
	
	
	

	public static void main(String[] args) {

		
			AbstractLogger loggerChain = getChainOfLoggers();
			
			loggerChain.logMessage(AbstractLogger.INFO, "This is normal information");
			
			
			loggerChain.logMessage(AbstractLogger.ERROR,"This is error message info");


			loggerChain.logMessage(AbstractLogger.DEBUG,"This is debugging info");
			
	}

}
