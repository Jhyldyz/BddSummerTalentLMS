Feature: create Categories

  Background: user login
    Given go to login
    Given click add categories button

  @create_categories
  @params
  Scenario: create new categories
    And enter categories name "Cucumber"
    And choose parent categories
    When click add new categories button
    Then user should successfully add categories

  @params1
  Scenario: create new categories with invalid name
    And enter categories invalid name "123q24r34r4wrsfgsegtdgstdfgstdfgdsfgvs123q24r34r4wrsfgsegtdgstdfgstdfgdsfgvs123q24r34r4wrsfgsegtdgstdfgstdfgdsfgvs123q24r34r4wrsfgsegtdgstdfgstdfgdsfgvs123q24r34r4wrsfgsegtdgstdfgstdfgdsfgvs123q24r34r4wrsfgsegtdgstdfgstdfgdsfgvs123q24r34r4wrsfgsegtdgstdfgstdfgdsfgvs123q24r34r4wrsfgsegtdgstdfgstdfgdsfgvs"
    And choose parent categories
    When click add new categories button
    Then the user get a message

  @Table

  Scenario Outline: create new categories with table
    Given create new categories up with following categoriesPojo
    And enter categories name <"name">
    And  choose parent categories <"parent">
    And  choose categories price <"price">
    Examples:
      | "name" | "parent"  | "price" |
      | "BDD"  | "Samples" | "200"   |
      | "'':"  | "Samples" | "100"   |
      |        |           |         |