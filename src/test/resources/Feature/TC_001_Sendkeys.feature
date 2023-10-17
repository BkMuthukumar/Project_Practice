Feature: Practice Sendkeys selinium code
#First workout
  @tag1
  Scenario Outline: learn send keys operation
    Given User in on automation code practice page
    When User "<name>","<email>" , "<address>" and "<phone number>"
    Then validate tool tip of all input box

    Examples: 
      | name        | email             | address   | phone number |
      | Muthu kumar | 1704bmk@gmail.com | Dhiyam pg |   1234567892 |
