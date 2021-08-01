Feature: User Industries

  As a Registered User
  I want to specify log in condition
  @TIS11-1
  Scenario: Login page
    Given User is on home page
    And   User clicks on the log in link
    Then  User should navigate to relative page
    And  User should navigate to login page as should see "Welcome, Please Sign In!" message