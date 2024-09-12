Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"

    Given api url
    When user sends request
    Then user name should be fetched from response

    Given user open demo guru99 login page with "https://demo.guru99.com/test/login.html"