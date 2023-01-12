Feature: Login to Yahoo
  
  
  	Scenario: Login successfully to yahoo
    Given open the yahoo website on browser
   	When user clicks the signin button
   	And user enters username "<uname>" and click next button
   	And user enters password "<password>" and click signin button
   	Then user has logged in successfully 

   Examples:
   |url											| uname 										| password		| 
   |https://sg.yahoo.com/		|nikole.santiago@yahoo.com  | redvelvet11 |
      