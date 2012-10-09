
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
 
/**
 * source : www.javabeat.net
 */
public class Log4jXmlTest {
    private static Logger logger = Logger.getLogger(Log4jXmlTest.class);
    public static void main (String args[]){
        DOMConfigurator.configure("log4j.xml");
        logger.info("Test Log");
    }
 
}