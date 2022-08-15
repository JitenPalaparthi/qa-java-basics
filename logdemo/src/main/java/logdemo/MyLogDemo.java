package logdemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class MyLogDemo {
	public static Logger LOGGER = LogManager.getLogger();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LOGGER.warn("Demo Warning Logging message");
		LOGGER.info("Calling area method");
		LOGGER.info("Area:"+area(12.45f,15.67f));
		LOGGER.info("Finished calling area method");// null, args, args, args, args, args, args, args, args);
		
		try {
			System.out.println(1/0);
		}catch(Exception exp) {
			LOGGER.error(exp.getMessage());
		}
		
	}

	public static float area(float l,float b) {
		return l*b;
	}
	
}
