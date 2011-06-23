Scenario: I can login

Given I am on the login page
When I enter admin for user
And I enter OpenMRS1 for password
And click submit
Then I am logged in

Scenario: I cant login

Given I am on the login page
When I enter admin for user
And I enter xxxxxx for password
And click submit
Then I am not logged in
