
Feature: add user from users page functionality
   As a librarian, I should be able to add users from users page.
  @AddUsers
  Scenario: Adding users from user page verification
    Given  User login as an librarian and user is on the Library home page
    When User clicks on Users tab
    And User clicks on Add User tab
    And User fills out the form as followed from the table below:
    And User enters "<Full Name>" to Full name input box
    And User enters "<Password>" to Password input box
    And User enters "<Email>" to Email input box
    And User selects "<User Group>" from User group drop down
    And User selects "<Status>" from Status drop down
    And User enters "<Start Date>" to Start Date input box
    And User enters "<End Date>" to End Date input box
    And User enters "<Address>" to Address input box
    And User clicks on Save change button
    Then User verifies "<Full Name>" is in the list


@close
  Scenario: Closing the Add User pop up verification
      Given User login as an librarian to the Library home page
      When User clicks on Users link
      And User clicks on Add User button
      And User clicks on Close button tab
      Then Add User pop up should be closed

  @EditButton
  Scenario: edit user info functionality verification
    Given User login to the home page as a Librarian
    When User clicks on User option on home page
    And User clicks on Edit User button
    And User change the "<Full Name>" in Edit User Info pop up
    And User clicks on Save change
    Then User verify the changed name is in the list











