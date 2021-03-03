@wip
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
	#_5-Librarian can use user group dropdown for selecting user type._
	#_6-Librarian can use show records dropdown for getting number of entries depends the dropdown options._
	#_7-Librarian can find user by using search box with user's all informations_
	#_8-Librarian can use Status dropdown for selecting status._
	@PROF-248
	Scenario: User Management Page Smoke Test
		Given the librarian clicked on Users on top the page
		Then the librarian navigates to "User Management" page