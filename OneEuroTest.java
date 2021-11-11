import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class OneEuroT extends Coin {
    public OneEuroT() {
			super("EUR", 1, "One Euro", "Unknown");
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

public class OneEuroTest {

    @Test
    public void testConstructor() {

			try {
				EFactory e = new EFactory();
				Coin c = e.makeCoin("one euro");
				assertNotNull(c);
			}
			catch (Exception e) {
				fail("Constructor threw exception: " + e.getMessage());
			}
    }

    @Test
    public void testDenomination() {

			EFactory e = new EFactory();
			Coin c = e.makeCoin("one euro");


			double expectedResult = 1;
			double testOutput = 0;

			testOutput = c.getDemonination();

			assertTrue(expectedResult == testOutput,
				"Expected:'" + expectedResult 
				+ "' but got '" + testOutput + "'.");
			}	

    @Test
    public void testToString() {

			EFactory e = new EFactory();
			Coin c = e.makeCoin("one euro");


			String expectedResult = "coin Information: EUR, 1.0, One Euro, Unknown. " +
			                         "\nSuccessfully smelted the One Eurocoin " +
															 "\nSuccessfully inspected the One Eurocoin " +
															 "\nSuccessfully smoothed the One Eurocoin \nSuccessfully buffed the One Eurocoin";
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