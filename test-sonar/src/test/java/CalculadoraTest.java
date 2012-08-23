import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Properties;

import org.apache.log4j.Logger;


import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {
	  /* Get actual class name to be printed on */
	  //static Logger log = Logger.getLogger(  CalculadoraTest.class.getName());
	private static final String className = CalculadoraTest.class.getName();
	public void testSuma() {
		final String methodName = "testSuma";
		// System.getProperties()

		Properties pr = new Properties();
		
		try {

			pr.load(this.getClass().getResourceAsStream("/config.properties"));

		} catch (Exception ex) {
		}

		LogManager.getInstance().info(className,methodName, pr.toString());
		LogManager.getInstance().info(className,methodName, "ffff->"+null);

		Calculadora cal = new Calculadora();
		LogManager.getInstance().info(className,methodName,String.valueOf(cal.suma(new Long(10), new Long(5))));

		try {
			// Create file
			FileWriter fstream = new FileWriter("out.txt");
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(pr.toString());
			// Close the output stream
			out.close();
		} catch (Exception e) {// Catch exception if any
			LogManager.getInstance().info(className,methodName, "Error: " + e.getMessage());
		}
		
		
		assertTrue(false);
		
	}

}
