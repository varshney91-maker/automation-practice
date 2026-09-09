import org.testng.annotations.Test;
import org.testng.Assert;

public class BasicTest {

		@Test
		public void firstTest()
		{
			System.out.println("test by ankit");
		}

		public static void main(String[] args)
		{
			BasicTest b = new BasicTest();
			b.firstTest();
		}
		
		
	}

