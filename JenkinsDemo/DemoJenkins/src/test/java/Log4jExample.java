import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {

	public static void main(String[] args) {
Logger logger =LogManager.getLogger(Log4jExample.class);

		

		System.out.println("Hello World.....");

		//used multiple predefined methods in logger class- Logger levels

		logger.error("This is a error");

		logger.warn("This is a warning");

		logger.fatal("This is a fatal");


	}

}
