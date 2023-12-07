@Smoke
Feature: Data Table Example
  Background: user login
    Given go to login
  Scenario: New user functionality
    Given click add user button
    And create new user up with following data
      | John    | Doe     | john@gmail.com |
      | Nick    | Jonas   | nick@gmail.com |
      | Mickael | Jackson | mike@gmail.com |
  @Table
  Scenario: new user func
    Given click add user button
    And create new user up with following data pojo
      | firstname | lastname | email             |
      | John      | Doe      | john123@gmail.com |
      | Mike      | Tayson   | mike123@gmail.com |
