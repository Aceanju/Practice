Feature: As a User I should login

  @login @smoke @regression
  Scenario:User should be able to login with valid username and password

    Given Im on Homepage "http://next.co.uk"
    When I click on My Account link
    And  I enter valid username"GeorgeLynn@example.com"
    And  I enter valid password"Lynn123@"
    And  I click Sign In button
    Then I should login successfully with success message as"Login Successful"
    And  I should be redirected to My Account page

  @login
  Scenario:User should not be able to login with invalid username and password

    Given Im on Homepage "http://next.co.uk"
    When I click on My Account link
    And  I enter invalid username"GeorgeLynnnn@example.com"
    And  I enter invalid password"Lynnn124"
    And  I click Sign In button
    Then I should not login successfully with warning message as"Login Unsuccessful"is displayed

  @login
  Scenario:User should not be able to login with blank username and password

    Given Im on Homepage "http://next.co.uk"
    When  I click on My Account link
    And   I enter no username" "
    And   I enter blank password" "
    And   I click Sign In button
    Then  I should not login successfully with warning message as"Enter username and password"
