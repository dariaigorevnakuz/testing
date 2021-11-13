Feature:
  Withdrawal of money from the account

  Scenario: Successful withdrawal of money from the account
    Given there are 1000 rubles on the user's account
    When the user withdraws 100 rubles
    Then there are 900 rubles on the user's account