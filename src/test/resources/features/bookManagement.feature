@records
Feature: Book Records

  # 5. As a librarian, I should be able to see book records on user page


  Scenario: Verify that the default record is 10
    Given the user login as a "librarian"
    And the user click on books module
   Then the user should see default book record is 10

    @wip
  Scenario: Show options for book records
    Given the user login as a "librarian"
    And the user click on books module
    When the user click on record number option
    Then the user should see following record options
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |

    
      


