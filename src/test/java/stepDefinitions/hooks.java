package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	@Before("@NetBanking")
	public void netBankingSetup()
	{
		System.out.println("**************");
		System.out.println("Set Up entries in NetBanking Database");
	}
	
	@After
	public void tearDown()
	{
		System.err.println("Clear the entries");
	}
	
	@Before("@Mortgauge")
	public void morgaugeSetup()
	{
		System.out.println("Set Up entries in Morgauge Database");
	}
	
}
//Before ->Background->Scenario ->After 