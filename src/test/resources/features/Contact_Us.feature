Feature: Testing App Witwiser Contact Us Page

  Scenario:User login process(1)
    Given I access the testing-app.witwiser concat us page
    When I enter a unique user name
    And I enter a unique user password
    And I click on the login button
    And The user clicks the sessions menu
    And The user click the session assignee
    And The user fills in the session templates required field
    And The user fills in date required fields
    And When user assignment type group name is selected
    And User selects group name
    Then The user completes the session assignment process


  Scenario: To Successfully Complete The Test Process In The Created Test Session(2)
    Given Click on user home button
    When Clicks the start test button from the exams area
    And Click the start test again button on the page that comes up
    And The first question is answered and proceeds
    And The second question is answered and proceeds
    And The third question is answered and proceeds
    And The fourth question is answered and proceeds
    Then Click the finish test button



