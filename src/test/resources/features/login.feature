@login
Feature: Login

  #"1. As a user, I should be able to login to the library app.

  @smoke
  Scenario Outline: Verify both students and librarians can login
    Given the user login as a "<userType>"
    Then the user is on "<page>" page
    Examples:
      | userType  | page      |
      | student   | books     |
      | librarian | dashboard |


  Scenario Outline: Verify all students can login
    Given the user is on login page
    When the user login with "<username>" "<password>"
    Then the user see user name "<studentName>"
    Examples:
      | username          | password | studentName     |
      | student14@library | pr1fWWNB | Test Student 14 |
      | student15@library | zFU7bzIq | Test Student 15 |
      | student16@library | sptHsOZx | Test Student 16 |


  Scenario Outline: Verify all librarians can login
    Given the user is on login page
    When the user login with "<username>" "<password>"
    Then the user see user name "<librarianName>"
    Examples:
      | username            | password | librarianName     |
      | librarian12@library | GBjogjFV | Test Librarian 12 |

  @smoke
  Scenario Outline: Verify user cannot login with invalid credentials
    Given the user is on login page
    When the user login with "<username>" "<password>"
    Then the user should see error message
    Examples:
      | username            | password |
      | student14@library   | 123      |
      | abc                 | pr1fWWNB |
      | librarian12@library |          |
      |                     | GBjogjFV |