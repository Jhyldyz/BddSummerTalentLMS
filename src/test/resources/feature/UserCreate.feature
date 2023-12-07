Feature: User create

  Background: Login
    Given go to login page and login

  @params
  Scenario: Create new user
    Given click add user button
    And enter firstname "Aibike"
    And enter lastname "Imanbaeva"
    And enter email "123@123.com"
    And enter bio 12345

  @params @ui
  Scenario: Create new user
    Given click add user button
    And enter firstname "Aida"
    And enter lastname "Sadyrkulova"
    And enter email "aida@123.com"
    And enter bio 67632

  @params @ui
  Scenario: Create new user
    Given click add user button
    And enter firstname "Adil"
    And enter lastname "Emilbekov"
    And enter email "adil@123.com"
    And enter bio 45321531
