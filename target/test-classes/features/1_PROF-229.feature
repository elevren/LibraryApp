Feature: 

	Background:
		#@PROF-229
		Given the librarian logged in the application
		

	#{color:#00875a}*User Story :* {color}
	#
	#As a librarian I should be able to edit users
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#_1-Librarian can edit new user_
	#_2-Edit user information should have following parameters : Full Name, Password, Email, User Group, Status, Start Date, End Date, Address_
	#_3-User Group should have 2 user types as Librarian and Students_
	#_4-Status should have ACTIVE and INACTIVE_
	#_5-Librarian can use user group dropdown for selecting user type._
	#_6-Librarian can use show records dropdown for getting number of entries depends the dropdown options._
	#_7-Librarian can find user by using search box with user's all informations_
	#_8-Librarian can use Status dropdown for selecting status._
	@PROF-243
	Scenario Outline: User Group Dropdown (c)
		Given the librarian clicked on Users on top the page
		Then the librarian navigates to "User Management" page
		When the librarian clicks on "<option>" in the drop-down menu called User Group
		Then the column called Group in the table should show only "<relatedOptions>"
		
		Examples:
		
		  | option    | relatedOptions |
		  | Librarian | Librarian      |
		  | Students  | Students       |