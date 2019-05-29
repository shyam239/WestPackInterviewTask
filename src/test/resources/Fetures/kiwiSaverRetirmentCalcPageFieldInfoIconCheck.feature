#Author: Shyam Periyasamy
@KiwiSaverCalc @Story1
Feature: Kiwi saver retirment calc
  I want that while using the KiwiSaver Retirement Calculator all fields in the calculator have got the information icon present

  @IconPresentValidation 
  Scenario: Information Icon presece check for all fields in Kiwi saver retirment calc page
    # To bring visibily of all the information icon we need to fill and select few fields
    # the purpose of the test is only validing the presence of information icon not estimated results
    Given I am in the Westpac New Zealand Limitied banking website
    When Navigated to KiwiSaver Retirment Calculator page
    Then Vlaidate the <helpIds> present with information icon
      | Field Name                            | HelpId                      | Input Values    |
      | Current age                           | CurrentAge                  |              64 |
      | Employment status                     | EmploymentStatus            | Employed        |
      | Salary or wages per year (before tax) | AnnualIncome                |           52000 |
      | KiwiSaver member contribution         | KiwiSaverMemberContribution |               6 |
      | Prescribed investor rate (PIR)        | PIRRate                     | 10.5%           |
      | Find My Rate                          | FindMyPIRRateQ1             |                 |
      | Taxable Income                        | NA                          | $48,001 or more |
      | Current KiwiSaver balance             | KiwiSaverBalance            |            1000 |
      | Voluntary contributions               | VoluntaryContributions      |             100 |
      | Voluntary contribution frequency      | NA                          | Monthly         |
      | Risk profile                          | RiskProfile                 | Medium          |
      | Savings goal at retirement            | SavingsGoal                 |           30000 |
      | Estimated results                     | Results                     | NA              |
      | Result explanation                    | ResultsExplanation          | NA              |
      | Life expendancy                       | LifeExpectancy              | NA              |
      | Intended retirment age                | RetirementAge               | NA              |
      | Apply infletion                       | InflationOption             | NA              |
      | Income increase per year              | AnnualIncomeIncrease        | NA              |

  @HelpTextValidation
  Scenario: Expected help text displayed for clicked help button
    Given I am in the Westpac New Zealand Limitied banking website
    When Navigated to KiwiSaver Retirment Calculator page
    Then Vlaidate the <helpIds> displays the expected help text
      | Field Name  | HelpId     | ExpectedHelpText                                                                                          |
      | Current age | CurrentAge | This calculator has an age limit of 64 years old as you need to be under the age of 65 to join KiwiSaver. |
