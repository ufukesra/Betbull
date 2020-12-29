@api
Feature: Api task test

  Scenario: Successful registration
    Given send a post request body with email and password then verify status code 201


  Scenario: Unsuccessful registration
    Given send a post request body with email then verify status code 400

   Scenario: Get user list
     Given send a get request to get all users then verify status code 200
