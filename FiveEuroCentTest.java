import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class FiveEuroCentT extends Coin {
    public FiveEuroCentT() {
			super("EUR", 0.05, "Five Euro Cent", "Unknown");
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
			return "Empty FiveEuroCenttest object"; 
		}
}

public class FiveEuroCentTest {

    @Test
    public void testConstructor() {

			try {
				EFactory e = new EFactory();
				Coin c = e.makeCoin("five cent euro");
				assertNotNull(c);
			}
			catch (Exception e) {
				fail("Constructor threw exception: " + e.getMessage());
			}
    }

    @Test
    public void testDenomination() {

			EFactory e = new EFactory();
			Coin c = e.makeCoin("five cent euro");


			double expectedResult = 0.05;
			double testOutput = 0;

			testOutput = c.getDemonination();

			assertTrue(expectedResult == testOutput,
				"Expected:'" + expectedResult 
				+ "' but got '" + testOutput + "'.");
			}	

    @Test
    public void testToString() {

			EFactory e = new EFactory();
			Coin c = e.makeCoin("five cent euro");


			String expectedResult = "coin Information: EUR, 0.05, Five Euro Cent, Unknown. " +
			                         "\nSuccessfully smelted the Five Euro Centcoin " +
															 "\nSuccessfully inspected the Five Euro Centcoin " +
															 "\nSuccessfully smoothed the Five Euro Centcoin \nSuccessfully buffed the Five Euro Centcoin";
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