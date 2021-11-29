package testNg;
import org.testng.annotations.Test;

public class Testcase1 extends Baseclass {

	@Test(priority=2, description="this test case is to test home loan function")
	public void HomeLoanTest() {
		
		System.out.println("Inside Home Loan");
}
	
	@Test(priority=1, description="this test case is to test home loan function")
	public void HomeLoanTest1() {
		
		System.out.println("Inside Home Loan 1");
}

	@Test(priority=0, groups= {"Sanity"}, enabled=true, description="this test case is to test car loan function")
	public void CarLoanTest() {
		
		System.out.println("Inside Car Loan");
}
	
}