import org.testng.annotations.Test;
import org.testng.Assert;

public class BasicTest {

		@Test(groups = "smoke")
		public void firstTest()
		{
			System.out.println("smoke test");
			String environment = System.getenv("Environment");
			System.out.println("Running Test on " +  environment);
		}

		@Test(groups = "Regression")
		public void secondTest()
		{
			System.out.println("regression test");

		}

		public static void main(String[] args)
		{
			BasicTest b = new BasicTest();
			b.firstTest();
		}
		
		
	}

