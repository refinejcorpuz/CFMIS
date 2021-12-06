package AldrinClockify;

import org.testng.annotations.Test;

public class Clockify extends ClockifyBaseTest{
	@Test(priority = 1)
	public void LoginRequestor() throws Exception {
		browserUsed();
		CredentialsLogin();
		ClickLogin();
	}
	
	/*
	 * public void createTask () throws Exception{
	 * 
	 * TicketNum(); AddTask(); Addtag(); SetTempTime();
	 * 
	 * }
	 */
	@Test(priority = 2)
	public void duplicateTicket() throws Exception{
		Duplicate();
		Duplicate();
		Duplicate();
		
		
	}
	
	/*
	 * @Test(priority = 3) public void InputTicketsNumber() throws Exception{
	 * 
	 * ClickMainticket(); EnterTicketNums(); }
	 */
	/*
	 * @Test (priority = 4) public void SetTime() throws Exception{
	 * 
	 * Time();
	 * 
	 * 
	 * 
	 * }
	 */
	
}
