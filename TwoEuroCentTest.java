import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class TwoEuroCentT extends Coin {
    public TwoEuroCentT() {
			super("EUR", 0.02, "Two Euro Cent", "Unknown");
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
			return "Empty TwoEuroCenttest object"; 
		}
}

public class TwoEuroCentTest {

    @Test
    public void testConstructor() {

			try {
				EFactory e = new EFactory();
				Coin c = e.makeCoin("two cent euro");
				assertNotNull(c);
			}
			catch (Exception e) {
				fail("Constructor threw exception: " + e.getMessage());
			}
    }

    @Test
    public void testDenomination() {

			EFactory e = new EFactory();
			Coin c = e.makeCoin("two cent euro");


			double expectedResult = 0.02;
			double testOutput = 0;

			testOutput = c.getDemonination();

			assertTrue(expectedResult == testOutput,
				"Expected:'" + expectedResult 
				+ "' but got '" + testOutput + "'.");
			}	

    @Test
    public void testToString() {

			EFactory e = new EFactory();
			Coin c = e.makeCoin("two cent euro");


			String expectedResult = "coin Information: EUR, 0.02, Two Euro Cent, Unknown. " +
			                         "\nSuccessfully smelted the Two Euro Centcoin " +
															 "\nSuccessfully inspected the Two Euro Centcoin " +
															 "\nSuccessfully smoothed the Two Euro Centcoin \nSuccessfully buffed the Two Euro Centcoin";
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