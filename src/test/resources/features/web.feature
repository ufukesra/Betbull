@web
  Feature: Web Sign in task test

    @signin1
    Scenario: Sign in with no credentials
      Given navigate landing page
      When go to Sign in
      Then click submit button with no credentials
      And verify no credentials error message

    @signin2
    Scenario:Sign in with only email
      Given navigate landing page
      When go to Sign in
      Then enter only email and click sign in button
      And verify only email error message

    @signin3
    Scenario: Sign in with only password
      Given navigate landing page
      When go to Sign in
      Then enter only password then click sign in button
      And verify only password error message
    @signin4
    Scenario: Sign in with invalid credentials
      Given navigate landing page
      When go to Sign in
      Then enter invalid credentials then click sign in button
      And verify invalid credentials error message
