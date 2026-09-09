import org.testng.annotations.Test;

public class BasicTest {

		@Test
		public void firstTest()
		{
			System.out.println("Login Test - CI Execution");
		}

		public static void main(String[] args)
		{
			BasicTest b = new BasicTest();
			b.firstTest();
		}
		
		
	}

