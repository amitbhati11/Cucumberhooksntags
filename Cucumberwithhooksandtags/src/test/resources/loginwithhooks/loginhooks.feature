Feature: use hooks for reuse execute common code

  #tags
  @smokeTest
  Scenario Outline: verify login page with valid credintals
    Given open login page
    When test with valid <username> and <password>
    And enter login button
    Then navigated to home page

    Examples: 
      | username   | password   |
      | 9821416708 | 9458661230 |

  @smokeTest @sanityTest
  Scenario Outline: verify login page with invalid credintals
    Given open login page
    When test with invalid <username> and <password>
    And enter login button
    Then navigated to home page

    Examples: 
      | username | password   |
      | sumit    | 9458661230 |

  @sanityTest
  Scenario Outline: verify login page with valid credintals
    Given open login page
    When test with valid <username> and <password>
    And enter login button
    Then navigated to home page

    Examples: 
      | username   | password   |
      | 9821416708 | 9458661230 |

  @regressionTest
  Scenario Outline: verify login page with invalid credintals
    Given open login page
    When test with invalid <username> and <password>
    And enter login button
    Then navigated to home page

    Examples: 
      | username | password |
      | amit     |   123456 |

  @saladTest
  Scenario Outline: verify login page with valid credintals
    Given open login page
    When test with valid <username> and <password>
    And enter login button
    Then navigated to home page

    Examples: 
      | username   | password   |
      | 9821416708 | 9458661230 |
