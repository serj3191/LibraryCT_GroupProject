Feature: Book Search

  @wip2
  #7. As a student, I should be able to search books with different categories.
  Scenario: User should be able to search books /filter  by categories in Book Categories dropdown


    Given user is login as student
    And user clicks on Books link
    When User clicks Book Categories  Dropdown
    Then User should see below info in Book Categories dropdown
      | ALL                     |
      | Action and Adventure    |
      | Anthology               |
      | Classic                 |
      | Comic and Graphic Novel |
      | Crime and Detective     |
      | Drama                   |
      | Fable                   |
      | Fairy Tale              |
      | Fan-Fiction             |
      | Fantasy                 |
      | Historical Fiction      |
      | Horror                  |
      | Science Fiction         |
      | Biography/Autobiography |
      | Humor                   |
      | Romance                 |
      | Short Story             |
      | Essay                   |
      | Memoir                  |
      | Poetry                  |
    When User selects  a book from book category options
    Then User should see books from that category