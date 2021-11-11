import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class DollarT extends Coin {
    public DollarT() {
			super("USD", 1.00, "Dollar", "88.5% Cu 6% Zi 3.5% Mn 2% Ni");
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
			return "Empty Dollartest object"; 
		}
}

public class DollarTest {

    @Test
    public void testConstructor() {

			try {
				mintFactory m = new mintFactory();
				Coin c = m.makeCoin("dollar");
				assertNotNull(c);
			}
			catch (Exception e) {
				fail("Constructor threw exception: " + e.getMessage());
			}
    }

    @Test
    public void testDenomination() {

			mintFactory m = new mintFactory();
			Coin c = m.makeCoin("dollar");


			double expectedResult = 1.0;
			double testOutput = 0;

			testOutput = c.getDemonination();

			assertTrue(expectedResult == testOutput,
				"Expected:'" + expectedResult 
				+ "' but got '" + testOutput + "'.");
			}	

    @Test
    public void testToString() {

			mintFactory m = new mintFactory();
			Coin c = m.makeCoin("dollar");


			String expectedResult = "coin Information: USD, 1.0, Dollar, 88.5% Cu 6% Zi 3.5% Mn 2% Ni. \nSuccessfully smelted the Dollarcoin \nSuccessfully inspected the Dollarcoin \nSuccessfully smoothed the Dollarcoin \nSuccessfully buffed the Dollarcoin";
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