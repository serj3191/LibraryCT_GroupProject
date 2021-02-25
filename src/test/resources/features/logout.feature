@logout
Feature: logout

  @smoke
  Scenario: Verify students can logout

    Given the user login as a "student"
    When the user is on "books" page
    And the student clicks the dropdown button
    And the student clicks the logout button
    Then the user sees the loginPage
  @smoke
  Scenario: Verify librarians can logout

    Given the user login as a "librarian"
    When the user is on "dashboard" page
    And the librarian clicks the dropdown button
    And the librarian clicks the logout button
    Then the user sees the loginPage