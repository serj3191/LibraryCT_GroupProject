@names
  Feature: As a students, I should be able to see tables with default info

    Scenario Outline: Table columns names

      Given the user is on login page
      When the user login with "<username>" "<password>"
    Then the user should see the following column names:
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |

      Examples:
        | username          | password |
        | student14@library | pr1fWWNB |
        | student15@library | zFU7bzIq |
        | student16@library | sptHsOZx |