Feature: Login

  Scenario: Successful login with Valid Credentials

    Given User Launch Firefox browser
    When User opens URL "https://admin-demo.nopcommerce.com/admin/"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then PageURL should be "Dashboard/nopCommerce administration"
    When User click on Log out Link
    Then Page Title should be"Your store.Login"
    And close browser
