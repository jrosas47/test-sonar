import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class Log4jExample{
  /* Get actual class name to be printed on */
  //static Logger log = Logger.getLogger(Log4jExample.class.getName());
  
  static Logger log = Logger.getLogger("WBIProcessLog");
  
  public static void main(String[] args)
                throws IOException,SQLException{
   
     log.debug("Hello this is an debug message");
     log.info("Hello this is an info message");
     log.warn("Hello this is an warn message");
     log.error("Hello this is an error message");
  }
}