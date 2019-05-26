#Author: Shyam Periyasamy
@KiwiSaverCalc @Story2
Feature: Kiwi saver retirment calc
  I want that the KiwiSaver Retirement Calculator users are able to calculate what their KiwiSaver projected balance would be at retirement

  @Ac1 @Employed
  Scenario: Projected Balance Check for Employed, age 30, Anual income 82000, KiwiMemContribution 4, PIRRate 17.5 and RiskProfile High
    Given I am in the Westpac New Zealand Limitied banking website
    When Navigated to KiwiSaver Retirment Calculator page
    Then Enter <inputValues> to KiwiSaverRetirmentCalc
      | Field Name                            | HelpId                      | Input Values |
      | Current age                           | CurrentAge                  |           30 |
      | Employment status                     | EmploymentStatus            | Employed     |
      | Salary or wages per year (before tax) | AnnualIncome                |        82000 |
      | KiwiSaver member contribution         | KiwiSaverMemberContribution |            4 |
      | Prescribed investor rate (PIR)        | PIRRate                     | 17.5%        |
      | Find My Rate                          | FindMyPIRRateQ1             | NA           |
      | Taxable Income                        | NA                          | NA           |
      | Current KiwiSaver balance             | KiwiSaverBalance            | NA           |
      | Voluntary contributions               | VoluntaryContributions      | NA           |
      | Voluntary contribution frequency      | NA                          | NA           |
      | Risk profile                          | RiskProfile                 | High         |
      | Savings goal at retirement            | SavingsGoal                 | NA           |
      | Estimated results                     | Results                     | NA           |
      | Result explanation                    | ResultsExplanation          | NA           |
      | Life expendancy                       | LifeExpectancy              | NA           |
      | Intended retirment age                | RetirementAge               | NA           |
      | Apply infletion                       | InflationOption             | NA           |
      | Income increase per year              | AnnualIncomeIncrease        | NA           |
    And Check the projected balance is displayed

  @Ac2 @Self-Employed
  Scenario: Projected Balance Check for Self-Employed, age 45, PIRRate 10.5, KiwiBalance 100000, Vol contribution 90, 
  frequency Forthnightly, RiskProfile Medium and Saving goal of 290000
    Given I am in the Westpac New Zealand Limitied banking website
    When Navigated to KiwiSaver Retirment Calculator page
    Then Enter <inputValues> to KiwiSaverRetirmentCalc
      | Field Name                            | HelpId                      | Input Values  |
      | Current age                           | CurrentAge                  |            45 |
      | Employment status                     | EmploymentStatus            | Self-employed |
      | Salary or wages per year (before tax) | AnnualIncome                | NA            |
      | KiwiSaver member contribution         | KiwiSaverMemberContribution | NA            |
      | Prescribed investor rate (PIR)        | PIRRate                     | 10.5%         |
      | Find My Rate                          | FindMyPIRRateQ1             | NA            |
      | Taxable Income                        | NA                          | NA            |
      | Current KiwiSaver balance             | KiwiSaverBalance            |        100000 |
      | Voluntary contributions               | VoluntaryContributions      |            90 |
      | Voluntary contribution frequency      | NA                          | Fortnightly   |
      | Risk profile                          | RiskProfile                 | Medium        |
      | Savings goal at retirement            | SavingsGoal                 |        290000 |
      | Estimated results                     | Results                     | NA            |
      | Result explanation                    | ResultsExplanation          | NA            |
      | Life expendancy                       | LifeExpectancy              | NA            |
      | Intended retirment age                | RetirementAge               | NA            |
      | Apply infletion                       | InflationOption             | NA            |
      | Income increase per year              | AnnualIncomeIncrease        | NA            |
    And Check the projected balance is displayed
    
      @Ac3 @Not-Employed
  Scenario: Projected Balance Check for Not Employed, age 55, PIRRate 10.5, KiwiBalance 140000, Vol contribution 10, 
  frequency Annually, RiskProfile Medium and Saving goal of 200000
    Given I am in the Westpac New Zealand Limitied banking website
    When Navigated to KiwiSaver Retirment Calculator page
    Then Enter <inputValues> to KiwiSaverRetirmentCalc
      | Field Name                            | HelpId                      | Input Values  |
      | Current age                           | CurrentAge                  |            55 |
      | Employment status                     | EmploymentStatus            | Not employed |
      | Salary or wages per year (before tax) | AnnualIncome                | NA            |
      | KiwiSaver member contribution         | KiwiSaverMemberContribution | NA            |
      | Prescribed investor rate (PIR)        | PIRRate                     | 10.5%         |
      | Find My Rate                          | FindMyPIRRateQ1             | NA            |
      | Taxable Income                        | NA                          | NA            |
      | Current KiwiSaver balance             | KiwiSaverBalance            |        140000 |
      | Voluntary contributions               | VoluntaryContributions      |            10 |
      | Voluntary contribution frequency      | NA                          | Annually   |
      | Risk profile                          | RiskProfile                 | Medium        |
      | Savings goal at retirement            | SavingsGoal                 |        200000 |
      | Estimated results                     | Results                     | NA            |
      | Result explanation                    | ResultsExplanation          | NA            |
      | Life expendancy                       | LifeExpectancy              | NA            |
      | Intended retirment age                | RetirementAge               | NA            |
      | Apply infletion                       | InflationOption             | NA            |
      | Income increase per year              | AnnualIncomeIncrease        | NA            |
    And Check the projected balance is displayed
