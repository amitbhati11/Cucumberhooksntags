Feature: use hooks for reuse execute common code

  Scenario Outline: verify login page with valid credintals
    Given open login page
    When test with valid <username> and <password>
    And enter login button
    Then navigated to home page

    Examples: 
      | username   | password   |
      | 9821416708 | 9458661230 |

  Scenario Outline: verify login page with invalid credintals
    Given open login page
    When test with invalid <username> and <password>
    And enter login button
    Then navigated to home page

    Examples: 
      | username | password |
      | amit     |   123456 |
