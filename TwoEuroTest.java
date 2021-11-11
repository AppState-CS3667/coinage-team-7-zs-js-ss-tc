import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class TwoEuroT extends Coin {
    public TwoEuroT() {
			super("EUR", 2, "Two Euro", "Unknown");
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
			return "Empty OneEurotest object"; 
		}
}

public class TwoEuroTest {

    @Test
    public void testConstructor() {

			try {
				EFactory e = new EFactory();
				Coin c = e.makeCoin("two euro");
				assertNotNull(c);
			}
			catch (Exception e) {
				fail("Constructor threw exception: " + e.getMessage());
			}
    }

    @Test
    public void testDenomination() {

			EFactory e = new EFactory();
			Coin c = e.makeCoin("two euro");


			double expectedResult = 2;
			double testOutput = 0;

			testOutput = c.getDemonination();

			assertTrue(expectedResult == testOutput,
				"Expected:'" + expectedResult 
				+ "' but got '" + testOutput + "'.");
			}	

    @Test
    public void testToString() {

			EFactory e = new EFactory();
			Coin c = e.makeCoin("two euro");


			String expectedResult = "coin Information: EUR, 2.0, Two Euro, Unknown. " +
			                         "\nSuccessfully smelted the Two Eurocoin " +
															 "\nSuccessfully inspected the Two Eurocoin " +
															 "\nSuccessfully smoothed the Two Eurocoin \nSuccessfully buffed the Two Eurocoin";
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