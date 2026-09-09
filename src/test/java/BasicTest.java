import org.testng.annotations.Test;
import org.testng.Assert;

public class BasicTest {

		@Test
		public void firstTest()
		{
			Assert.fail("failed by Ankit");
		}

		public static void main(String[] args)
		{
			BasicTest b = new BasicTest();
			b.firstTest();
		}
		
		
	}

