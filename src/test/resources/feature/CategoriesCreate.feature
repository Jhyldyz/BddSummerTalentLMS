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

  @Table1

  Scenario Outline: create new categories with table
    And user should enter categoriesName <"categoriesName">
    And  user should enter parentCategories
    And  user should enter price <"price">
    And  user clicks the addCategories button
    Examples:
      | "categoriesName"                                                                   | "price" |
      | "1"                                                                                | "120"   |
      | "QA"                                                                               | "23"    |
      | ";^&&*&"                                                                           | "a"     |
      | "sfsfgrdfgvrdfvfdvrsfvzsfvdfvdfvdfvdfvdfvdfvrvbfgbgxsfsfgrdfgvrdfvfdvrsfvzsfvdfvdfvdfvdfvdfvdfvrvbfgbgxdbdgxbgdxbxbgbgxdsxzvzsvzfvsfsfgrdfgvrdfvfdvrsfvzsfvdfvdfvdfvdfvdfvdfvrvbfgbgxdbdgxbgdxbxbgbgxdsxzvzsvzfvdbdgxbgdxbxbgbgxdsxzvzsvzfvzv" | "1"     |