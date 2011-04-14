package authentication;
/**
*	User authentication class
*	
*	@author mattp
*	@version 1.0 March 22, 2011
*	@author Peter
* 	- added method to get username at albert's request 
*/
public class Authentication
{
	/**
		Default Constructor 
	*/
	public Authentication()
	{
		isLoggedIn = false;
	}
	/**
		Log in to the system with a password
                @param username the username of the user
		@param password the passoword to log in to the system
                @param userType the type of user that is trying to log in
		@return boolean shows log in is successful or not
	*/
	public boolean login(String username, String password,String userType)
	{
		/*if(getAccount(username,userType))
		{
			if(account.getPassword().equals(password))
			{
				isLoggedIn = true;
				return true;
			}
		}*/
		return false;
	}
	/**
		Log out from the system
	*/
	public void logout()
	{
		isLoggedIn = false;
	}
	
	/**
		check if the user is logged in
		@return isLoggedIn the user's log in status
	*/
	public boolean isLoggedIn()
	{
		return isLoggedIn;
	}
	/**
		get user account by searching the username
                @param username the username of the user
                @param userType the type of user that is trying to log in
		@return boolean shows account was found or not
	*/
	private boolean getAccount(String username,String userType)
	{
		/*Search search = new Search(username);
		if(search.searchUsername(username))
		{
			account = search.getAccount();
			return true;
		}*/
		return false;
	}
	/**
	 * Returns the user name
	 * @return the user name that is currently logged in
	 * @throws IllegalStateException if no user is currently logged in
	 */
	public String getUsername() throws IllegalStateException
	{
	    if (account == null)
		throw new IllegalStateException("No user is currently logged in.");

	    return account.getFname();
	}

	
	private boolean isLoggedIn;
	private Account account;
	private Member member;
	private Employee employee;
}
