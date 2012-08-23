import org.apache.log4j.Logger;


public class LogManager {
	private static final Logger log = Logger.getLogger("WBIProcessLog");
	private LogManager logManager;
	
	private static LogManager INSTANCE = null;

    private LogManager() {}
 
    private synchronized static void createInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new LogManager();
        }
    }
 
    public static LogManager getInstance() {
        createInstance();
        return INSTANCE;
    }
	
	public void info(String className, String methodName,String message){
		log.info(new StringBuffer(className).append(" ").append(methodName).append(" ").append(message));
	}
	
}
