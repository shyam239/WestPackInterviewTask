package utils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class LoggerUtil {
    private static Logger logger = LogManager.getLogger(LoggerUtil.class.getName());
    //private static Logger Log = Logger.getLogger(logger.class.getName());
    public void performSomeTask(){
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
    }
    
    public void startTestCase(String sTestCaseName){

    	logger.info("----------------------------------------------------------------------------------------");

    	logger.info("--------------------                 "+sTestCaseName+ "     ");

    	logger.info("----------------------------------------------------------------------------------------");


    	}

    	//This is to print log for the ending of the test case

    public static void endTestCase(String sTestCaseName){

    	logger.info("====================================End=Of=Test===========================================");

    	}

    	// Need to create these methods, so that they can be called  

    public static void info(String message) {

    		logger.info(message);

    		}

    public static void warn(String message) {

       logger.warn(message);

    	}

    public static void error(String message) {

       logger.error(message);

    	}

    public static void fatal(String message) {

       logger.fatal(message);

    	}

    public static void debug(String message) {

       logger.debug(message);

    	}

}

