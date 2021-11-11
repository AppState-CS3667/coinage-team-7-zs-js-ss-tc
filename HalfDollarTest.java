import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class HalfDollarT extends Coin {
    public HalfDollarT() {
			super("USD", 0.50, "Half Dollar", "91.67% Cu 8.33% Ni");
    }
		public double getDemonination() {
      return 0;
    }
    public String getCountryCode() {
        return "";
    }
    public String getCommonName() {
        return "";
    }
    public String getSpecs() {
        return "";
    }
    public String toString() { 
			return "Empty HalfDollartest object"; 
		}
}

public class HalfDollarTest {

    @Test
    public void testConstructor() {

			try {
				mintFactory m = new mintFactory();
				Coin c = m.makeCoin("half dollar");
				assertNotNull(c);
			}
			catch (Exception e) {
				fail("Constructor threw exception: " + e.getMessage());
			}
    }

    @Test
    public void testDenomination() {

			mintFactory m = new mintFactory();
			Coin c = m.makeCoin("half dollar");


			double expectedResult = 0.5;
			double testOutput = 0;

			testOutput = c.getDemonination();

			assertTrue(expectedResult == testOutput,
				"Expected:'" + expectedResult 
				+ "' but got '" + testOutput + "'.");
			}	

    @Test
    public void testToString() {

			mintFactory m = new mintFactory();
			Coin c = m.makeCoin("half dollar");


			String expectedResult = "coin Information: USD, 0.5, Half Dollar, 91.67% Cu 8.33% Ni. \nSuccessfully smelted the Half Dollarcoin \nSuccessfully inspected the Half Dollarcoin \nSuccessfully smoothed the Half Dollarcoin \nSuccessfully buffed the Half Dollarcoin";
			String testOutput = null;

			PrintStream origOut = System.out;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintStream newOut = new PrintStream(baos);
			System.setOut(newOut);

			System.out.print(c.toString());

			System.out.flush();
			testOutput = baos.toString();
			System.setOut(origOut);

			assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
		}
}