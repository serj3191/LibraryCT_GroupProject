@modules
Feature: modules

  Scenario: Students should have access to 2 modules
    Given the user login as a "student"
    Then the student should see following modules
      | Books           |
      | Borrowing Books |

  Scenario: Librarian should have access to 3 modules
    Given the user login as a "librarian"
    Then the librarian should see following modules
      | Dashboard |
      | Users     |
      | Books     |
