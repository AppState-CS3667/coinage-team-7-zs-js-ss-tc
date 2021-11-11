import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class NickelT extends Coin {
    public NickelT() {
			super("USD", 0.05, "Nickel", "75% Cu 25% Ni");
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
			return "Empty Nickeltest object"; 
		}
}

public class NickelTest {

    @Test
    public void testConstructor() {

			try {
				mintFactory m = new mintFactory();
				Coin c = m.makeCoin("nickel");
				assertNotNull(c);
			}
			catch (Exception e) {
				fail("Constructor threw exception: " + e.getMessage());
			}
    }

    @Test
    public void testDenomination() {

			mintFactory m = new mintFactory();
			Coin c = m.makeCoin("nickel");


			double expectedResult = 0.05;
			double testOutput = 0;

			testOutput = c.getDemonination();

			assertTrue(expectedResult == testOutput,
				"Expected:'" + expectedResult 
				+ "' but got '" + testOutput + "'.");
			}	

    @Test
    public void testToString() {

			mintFactory m = new mintFactory();
			Coin c = m.makeCoin("nickel");


			String expectedResult = "coin Information: USD, 0.05, Nickel, 75% Cu 25% Ni. \nSuccessfully smelted the Nickelcoin \nSuccessfully inspected the Nickelcoin \nSuccessfully smoothed the Nickelcoin \nSuccessfully buffed the Nickelcoin";
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