import org.testng.annotations.Test;
import org.testng.Assert;

public class BasicTest {

		@Test
		public void firstTest()
		{
			System.out.println("test by ankit");
			String environment = System.getenv("Environment");
			System.out.println("Running Test on " +  environment);
		}

		public static void main(String[] args)
		{
			BasicTest b = new BasicTest();
			b.firstTest();
		}
		
		
	}

