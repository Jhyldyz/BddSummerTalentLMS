@Smoke
Feature: create new course
  Background: Login
    Given go to login
  @create_course
  Scenario: Create new course
    Given click add course button
    And enter coursename "qa automation engineer"
    And choose course category  "QA"
    And fill up description field  "qa course in bishkek"
    And click save and select button