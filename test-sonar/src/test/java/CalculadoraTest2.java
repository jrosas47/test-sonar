import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Properties;

import org.apache.log4j.Logger;


import junit.framework.TestCase;

public class CalculadoraTest2 extends TestCase {
	  /* Get actual class name to be printed on */
	static Logger log = Logger.getLogger( "WBIProcessLog");
	
	public void testSuma() {

		Properties pr = new Properties();
		
		try {

			pr.load(this.getClass().getResourceAsStream("/config.properties"));

		} catch (Exception ex) {
		}

		log.info(pr.toString());
		log.info("ddd->"+null);

		Calculadora cal = new Calculadora();
		log.info(String.valueOf(cal.suma(new Long(10), new Long(5))));

		try {
			// Create file
			FileWriter fstream = new FileWriter("out.txt");
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(pr.toString());
			// Close the output stream
			out.close();
		} catch (Exception e) {// Catch exception if any
			log.info( "Error: " + e.getMessage());
		}

	}

}
