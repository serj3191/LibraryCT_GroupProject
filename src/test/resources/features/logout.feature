@logout
Feature: logout

  #"1. As a user, I should be able to logout of library app.

  @wip
  Scenario Outline: Verify both students and librarians can login
    Given the user login as a "<userType>"
    When the user is on "<page>" page
    And the user clicks the dropdown button
    And the user clicks the logout button
    Then the user sees the loginPage
    Examples:
      | userType  | page      |
      | student   | books     |
      | librarian | dashboard |



