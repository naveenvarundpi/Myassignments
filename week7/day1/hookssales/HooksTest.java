package hookssales;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksTest {

	@Before
	public void beforefeature()
	{
		System.out.println("execution has been started");
	}
	@After
	public void afterfeature()
	{
		System.out.println("execution has been completed");

	}

}
