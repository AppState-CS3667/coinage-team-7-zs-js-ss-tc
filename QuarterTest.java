import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class QuarterT extends Coin {
    public QuarterT() {
			super("USD", 0.25, "Quarter", "91.67% Cu 8.33% Ni");
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
			return "Empty Quartertest object"; 
		}
}

public class QuarterTest {

    @Test
    public void testConstructor() {

			try {
				mintFactory m = new mintFactory();
				Coin c = m.makeCoin("quarter");
				assertNotNull(c);
			}
			catch (Exception e) {
				fail("Constructor threw exception: " + e.getMessage());
			}
    }

    @Test
    public void testDenomination() {

			mintFactory m = new mintFactory();
			Coin c = m.makeCoin("quarter");


			double expectedResult = 0.25;
			double testOutput = 0;

			testOutput = c.getDemonination();

			assertTrue(expectedResult == testOutput,
				"Expected:'" + expectedResult 
				+ "' but got '" + testOutput + "'.");
			}	

    @Test
    public void testToString() {

			mintFactory m = new mintFactory();
			Coin c = m.makeCoin("quarter");


			String expectedResult = "coin Information: USD, 0.25, Quarter, 91.67% Cu 8.33% Ni. \nSuccessfully smelted the Quartercoin \nSuccessfully inspected the Quartercoin \nSuccessfully smoothed the Quartercoin \nSuccessfully buffed the Quartercoin";
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