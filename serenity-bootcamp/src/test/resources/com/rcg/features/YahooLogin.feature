
	Feature: Login to Yahoo
  
  
  Scenario: Login successfully to yahoo
    Given Open the yahoo website "<url>" on browser
   	When user clicks the signin button
   	And user enters the username "<uname>" and click next button
   	And user enter the password "<password>" and click signin button
   	Then user has logged in successfully

    Examples: 
      | url  									 | uname 										 | password			 |
      | https://sg.yahoo.com/	 | nikole.santiago@yahoo.com | redvelvet11   |
      

      
     