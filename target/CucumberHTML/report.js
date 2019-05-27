$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("kiwiSaverRetirmentCalcPageFieldInfoIconCheck.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Shyam Periyasamy"
    }
  ],
  "line": 3,
  "name": "Kiwi saver retirment calc",
  "description": "I want that while using the KiwiSaver Retirement Calculator all fields in the calculator have got the information icon present",
  "id": "kiwi-saver-retirment-calc",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@KiwiSaverCalc"
    },
    {
      "line": 2,
      "name": "@Story1"
    }
  ]
});
formatter.before({
  "duration": 3522721563,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Information Icon presece check for all fields in Kiwi saver retirment calc page",
  "description": "",
  "id": "kiwi-saver-retirment-calc;information-icon-presece-check-for-all-fields-in-kiwi-saver-retirment-calc-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@IconPresentValidation"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "# To bring visibily of all the information icon we need to fill and select few fields"
    },
    {
      "line": 9,
      "value": "# the purpose of the test is only validing the presence of information icon not estimated results"
    }
  ],
  "line": 10,
  "name": "I am in the Westpac New Zealand Limitied banking website",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Navigated to KiwiSaver Retirment Calculator page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Vlaidate the \u003chelpIds\u003e present with information icon",
  "rows": [
    {
      "cells": [
        "Field Name",
        "HelpId",
        "Input Values"
      ],
      "line": 13
    },
    {
      "cells": [
        "Current age",
        "CurrentAge",
        "64"
      ],
      "line": 14
    },
    {
      "cells": [
        "Employment status",
        "EmploymentStatus",
        "Employed"
      ],
      "line": 15
    },
    {
      "cells": [
        "Salary or wages per year (before tax)",
        "AnnualIncome",
        "52000"
      ],
      "line": 16
    },
    {
      "cells": [
        "KiwiSaver member contribution",
        "KiwiSaverMemberContribution",
        "6"
      ],
      "line": 17
    },
    {
      "cells": [
        "Prescribed investor rate (PIR)",
        "PIRRate",
        "10.5%"
      ],
      "line": 18
    },
    {
      "cells": [
        "Find My Rate",
        "FindMyPIRRateQ1",
        ""
      ],
      "line": 19
    },
    {
      "cells": [
        "Taxable Income",
        "NA",
        "$48,001 or more"
      ],
      "line": 20
    },
    {
      "cells": [
        "Current KiwiSaver balance",
        "KiwiSaverBalance",
        "1000"
      ],
      "line": 21
    },
    {
      "cells": [
        "Voluntary contributions",
        "VoluntaryContributions",
        "100"
      ],
      "line": 22
    },
    {
      "cells": [
        "Voluntary contribution frequency",
        "NA",
        "Monthly"
      ],
      "line": 23
    },
    {
      "cells": [
        "Risk profile",
        "RiskProfile",
        "Medium"
      ],
      "line": 24
    },
    {
      "cells": [
        "Savings goal at retirement",
        "SavingsGoal",
        "30000"
      ],
      "line": 25
    },
    {
      "cells": [
        "Estimated results",
        "Results",
        "NA"
      ],
      "line": 26
    },
    {
      "cells": [
        "Result explanation",
        "ResultsExplanation",
        "NA"
      ],
      "line": 27
    },
    {
      "cells": [
        "Life expendancy",
        "LifeExpectancy",
        "NA"
      ],
      "line": 28
    },
    {
      "cells": [
        "Intended retirment age",
        "RetirementAge",
        "NA"
      ],
      "line": 29
    },
    {
      "cells": [
        "Apply infletion",
        "InflationOption",
        "NA"
      ],
      "line": 30
    },
    {
      "cells": [
        "Income increase per year",
        "AnnualIncomeIncrease",
        "NA"
      ],
      "line": 31
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "KiwiSaverCalcSteps.i_am_in_the_Westpac_New_Zealand_Limitied_banking_website()"
});
formatter.result({
  "duration": 3691179306,
  "status": "passed"
});
formatter.match({
  "location": "KiwiSaverCalcSteps.navigated_to_KiwiSaver_Retirment_Calculator_page()"
});
formatter.result({
  "duration": 4845264715,
  "status": "passed"
});
formatter.match({
  "location": "KiwiSaverCalcSteps.vlaidate_the_fileds_present_with_information_icon(DataTable)"
});
formatter.result({
  "duration": 16793580805,
  "status": "passed"
});
formatter.after({
  "duration": 743969783,
  "status": "passed"
});
formatter.before({
  "duration": 2160265750,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Expected help text displayed for clicked help button",
  "description": "",
  "id": "kiwi-saver-retirment-calc;expected-help-text-displayed-for-clicked-help-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@HelpTextValidation"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "I am in the Westpac New Zealand Limitied banking website",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "Navigated to KiwiSaver Retirment Calculator page",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "Vlaidate the \u003chelpIds\u003e displays the expected help text",
  "rows": [
    {
      "cells": [
        "Field Name",
        "HelpId",
        "ExpectedHelpText"
      ],
      "line": 38
    },
    {
      "cells": [
        "Current age",
        "CurrentAge",
        "This calculator has an age limit of 64 years old as you need to be under the age of 65 to join KiwiSaver."
      ],
      "line": 39
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "KiwiSaverCalcSteps.i_am_in_the_Westpac_New_Zealand_Limitied_banking_website()"
});
formatter.result({
  "duration": 3589979188,
  "status": "passed"
});
formatter.match({
  "location": "KiwiSaverCalcSteps.navigated_to_KiwiSaver_Retirment_Calculator_page()"
});
formatter.result({
  "duration": 4297931616,
  "status": "passed"
});
formatter.match({
  "location": "KiwiSaverCalcSteps.vlaidate_the_helpIds_displays_the_expected_help_text(DataTable)"
});
formatter.result({
  "duration": 6253419257,
  "status": "passed"
});
formatter.after({
  "duration": 801231170,
  "status": "passed"
});
formatter.uri("kiwiSaverRetirmentCalcPageInvestmentPlan.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Shyam Periyasamy"
    }
  ],
  "line": 3,
  "name": "Kiwi saver retirment calc",
  "description": "I want that the KiwiSaver Retirement Calculator users are able to calculate what their KiwiSaver projected balance would be at retirement",
  "id": "kiwi-saver-retirment-calc",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@KiwiSaverCalc"
    },
    {
      "line": 2,
      "name": "@Story2"
    }
  ]
});
formatter.before({
  "duration": 2174218529,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Projected Balance Check for Employed, age 30, Anual income 82000, KiwiMemContribution 4, PIRRate 17.5 and RiskProfile High",
  "description": "",
  "id": "kiwi-saver-retirment-calc;projected-balance-check-for-employed,-age-30,-anual-income-82000,-kiwimemcontribution-4,-pirrate-17.5-and-riskprofile-high",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Ac1"
    },
    {
      "line": 6,
      "name": "@Employed"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am in the Westpac New Zealand Limitied banking website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Navigated to KiwiSaver Retirment Calculator page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Enter \u003cinputValues\u003e to KiwiSaverRetirmentCalc",
  "rows": [
    {
      "cells": [
        "Field Name",
        "HelpId",
        "Input Values"
      ],
      "line": 11
    },
    {
      "cells": [
        "Current age",
        "CurrentAge",
        "30"
      ],
      "line": 12
    },
    {
      "cells": [
        "Employment status",
        "EmploymentStatus",
        "Employed"
      ],
      "line": 13
    },
    {
      "cells": [
        "Salary or wages per year (before tax)",
        "AnnualIncome",
        "82000"
      ],
      "line": 14
    },
    {
      "cells": [
        "KiwiSaver member contribution",
        "KiwiSaverMemberContribution",
        "4"
      ],
      "line": 15
    },
    {
      "cells": [
        "Prescribed investor rate (PIR)",
        "PIRRate",
        "17.5%"
      ],
      "line": 16
    },
    {
      "cells": [
        "Find My Rate",
        "FindMyPIRRateQ1",
        "NA"
      ],
      "line": 17
    },
    {
      "cells": [
        "Taxable Income",
        "NA",
        "NA"
      ],
      "line": 18
    },
    {
      "cells": [
        "Current KiwiSaver balance",
        "KiwiSaverBalance",
        "NA"
      ],
      "line": 19
    },
    {
      "cells": [
        "Voluntary contributions",
        "VoluntaryContributions",
        "NA"
      ],
      "line": 20
    },
    {
      "cells": [
        "Voluntary contribution frequency",
        "NA",
        "NA"
      ],
      "line": 21
    },
    {
      "cells": [
        "Risk profile",
        "RiskProfile",
        "High"
      ],
      "line": 22
    },
    {
      "cells": [
        "Savings goal at retirement",
        "SavingsGoal",
        "NA"
      ],
      "line": 23
    },
    {
      "cells": [
        "Estimated results",
        "Results",
        "NA"
      ],
      "line": 24
    },
    {
      "cells": [
        "Result explanation",
        "ResultsExplanation",
        "NA"
      ],
      "line": 25
    },
    {
      "cells": [
        "Life expendancy",
        "LifeExpectancy",
        "NA"
      ],
      "line": 26
    },
    {
      "cells": [
        "Intended retirment age",
        "RetirementAge",
        "NA"
      ],
      "line": 27
    },
    {
      "cells": [
        "Apply infletion",
        "InflationOption",
        "NA"
      ],
      "line": 28
    },
    {
      "cells": [
        "Income increase per year",
        "AnnualIncomeIncrease",
        "NA"
      ],
      "line": 29
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Check the projected balance is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "KiwiSaverCalcSteps.i_am_in_the_Westpac_New_Zealand_Limitied_banking_website()"
});
formatter.result({
  "duration": 3334803488,
  "status": "passed"
});
formatter.match({
  "location": "KiwiSaverCalcSteps.navigated_to_KiwiSaver_Retirment_Calculator_page()"
});
formatter.result({
  "duration": 4664322240,
  "status": "passed"
});
formatter.match({
  "location": "KiwiSaverCalcSteps.enter_inputValues_to_KiwiSaverRetirmentCalc(DataTable)"
});
formatter.result({
  "duration": 7325664138,
  "status": "passed"
});
formatter.match({
  "location": "KiwiSaverCalcSteps.check_the_projected_balance_is_displayed()"
});
formatter.result({
  "duration": 199325472,
  "status": "passed"
});
formatter.after({
  "duration": 721009999,
  "status": "passed"
});
formatter.before({
  "duration": 2176197787,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Projected Balance Check for Self-Employed, age 45, PIRRate 10.5, KiwiBalance 100000, Vol contribution 90,",
  "description": "frequency Forthnightly, RiskProfile Medium and Saving goal of 290000",
  "id": "kiwi-saver-retirment-calc;projected-balance-check-for-self-employed,-age-45,-pirrate-10.5,-kiwibalance-100000,-vol-contribution-90,",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@Ac2"
    },
    {
      "line": 32,
      "name": "@Self-Employed"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "I am in the Westpac New Zealand Limitied banking website",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "Navigated to KiwiSaver Retirment Calculator page",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "Enter \u003cinputValues\u003e to KiwiSaverRetirmentCalc",
  "rows": [
    {
      "cells": [
        "Field Name",
        "HelpId",
        "Input Values"
      ],
      "line": 38
    },
    {
      "cells": [
        "Current age",
        "CurrentAge",
        "45"
      ],
      "line": 39
    },
    {
      "cells": [
        "Employment status",
        "EmploymentStatus",
        "Self-employed"
      ],
      "line": 40
    },
    {
      "cells": [
        "Salary or wages per year (before tax)",
        "AnnualIncome",
        "NA"
      ],
      "line": 41
    },
    {
      "cells": [
        "KiwiSaver member contribution",
        "KiwiSaverMemberContribution",
        "NA"
      ],
      "line": 42
    },
    {
      "cells": [
        "Prescribed investor rate (PIR)",
        "PIRRate",
        "10.5%"
      ],
      "line": 43
    },
    {
      "cells": [
        "Find My Rate",
        "FindMyPIRRateQ1",
        "NA"
      ],
      "line": 44
    },
    {
      "cells": [
        "Taxable Income",
        "NA",
        "NA"
      ],
      "line": 45
    },
    {
      "cells": [
        "Current KiwiSaver balance",
        "KiwiSaverBalance",
        "100000"
      ],
      "line": 46
    },
    {
      "cells": [
        "Voluntary contributions",
        "VoluntaryContributions",
        "90"
      ],
      "line": 47
    },
    {
      "cells": [
        "Voluntary contribution frequency",
        "NA",
        "Fortnightly"
      ],
      "line": 48
    },
    {
      "cells": [
        "Risk profile",
        "RiskProfile",
        "Medium"
      ],
      "line": 49
    },
    {
      "cells": [
        "Savings goal at retirement",
        "SavingsGoal",
        "290000"
      ],
      "line": 50
    },
    {
      "cells": [
        "Estimated results",
        "Results",
        "NA"
      ],
      "line": 51
    },
    {
      "cells": [
        "Result explanation",
        "ResultsExplanation",
        "NA"
      ],
      "line": 52
    },
    {
      "cells": [
        "Life expendancy",
        "LifeExpectancy",
        "NA"
      ],
      "line": 53
    },
    {
      "cells": [
        "Intended retirment age",
        "RetirementAge",
        "NA"
      ],
      "line": 54
    },
    {
      "cells": [
        "Apply infletion",
        "InflationOption",
        "NA"
      ],
      "line": 55
    },
    {
      "cells": [
        "Income increase per year",
        "AnnualIncomeIncrease",
        "NA"
      ],
      "line": 56
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "Check the projected balance is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "KiwiSaverCalcSteps.i_am_in_the_Westpac_New_Zealand_Limitied_banking_website()"
});
formatter.result({
  "duration": 3448954114,
  "status": "passed"
});
formatter.match({
  "location": "KiwiSaverCalcSteps.navigated_to_KiwiSaver_Retirment_Calculator_page()"
});
formatter.result({
  "duration": 4587020573,
  "status": "passed"
});
formatter.match({
  "location": "KiwiSaverCalcSteps.enter_inputValues_to_KiwiSaverRetirmentCalc(DataTable)"
});
formatter.result({
  "duration": 7778858842,
  "status": "passed"
});
formatter.match({
  "location": "KiwiSaverCalcSteps.check_the_projected_balance_is_displayed()"
});
formatter.result({
  "duration": 206471738,
  "status": "passed"
});
formatter.after({
  "duration": 707357861,
  "status": "passed"
});
formatter.before({
  "duration": 2123638420,
  "status": "passed"
});
formatter.scenario({
  "line": 60,
  "name": "Projected Balance Check for Not Employed, age 55, PIRRate 10.5, KiwiBalance 140000, Vol contribution 10,",
  "description": "frequency Annually, RiskProfile Medium and Saving goal of 200000",
  "id": "kiwi-saver-retirment-calc;projected-balance-check-for-not-employed,-age-55,-pirrate-10.5,-kiwibalance-140000,-vol-contribution-10,",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 59,
      "name": "@Ac3"
    },
    {
      "line": 59,
      "name": "@Not-Employed"
    }
  ]
});
formatter.step({
  "line": 62,
  "name": "I am in the Westpac New Zealand Limitied banking website",
  "keyword": "Given "
});
formatter.step({
  "line": 63,
  "name": "Navigated to KiwiSaver Retirment Calculator page",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "Enter \u003cinputValues\u003e to KiwiSaverRetirmentCalc",
  "rows": [
    {
      "cells": [
        "Field Name",
        "HelpId",
        "Input Values"
      ],
      "line": 65
    },
    {
      "cells": [
        "Current age",
        "CurrentAge",
        "55"
      ],
      "line": 66
    },
    {
      "cells": [
        "Employment status",
        "EmploymentStatus",
        "Not employed"
      ],
      "line": 67
    },
    {
      "cells": [
        "Salary or wages per year (before tax)",
        "AnnualIncome",
        "NA"
      ],
      "line": 68
    },
    {
      "cells": [
        "KiwiSaver member contribution",
        "KiwiSaverMemberContribution",
        "NA"
      ],
      "line": 69
    },
    {
      "cells": [
        "Prescribed investor rate (PIR)",
        "PIRRate",
        "10.5%"
      ],
      "line": 70
    },
    {
      "cells": [
        "Find My Rate",
        "FindMyPIRRateQ1",
        "NA"
      ],
      "line": 71
    },
    {
      "cells": [
        "Taxable Income",
        "NA",
        "NA"
      ],
      "line": 72
    },
    {
      "cells": [
        "Current KiwiSaver balance",
        "KiwiSaverBalance",
        "140000"
      ],
      "line": 73
    },
    {
      "cells": [
        "Voluntary contributions",
        "VoluntaryContributions",
        "10"
      ],
      "line": 74
    },
    {
      "cells": [
        "Voluntary contribution frequency",
        "NA",
        "Annually"
      ],
      "line": 75
    },
    {
      "cells": [
        "Risk profile",
        "RiskProfile",
        "Medium"
      ],
      "line": 76
    },
    {
      "cells": [
        "Savings goal at retirement",
        "SavingsGoal",
        "200000"
      ],
      "line": 77
    },
    {
      "cells": [
        "Estimated results",
        "Results",
        "NA"
      ],
      "line": 78
    },
    {
      "cells": [
        "Result explanation",
        "ResultsExplanation",
        "NA"
      ],
      "line": 79
    },
    {
      "cells": [
        "Life expendancy",
        "LifeExpectancy",
        "NA"
      ],
      "line": 80
    },
    {
      "cells": [
        "Intended retirment age",
        "RetirementAge",
        "NA"
      ],
      "line": 81
    },
    {
      "cells": [
        "Apply infletion",
        "InflationOption",
        "NA"
      ],
      "line": 82
    },
    {
      "cells": [
        "Income increase per year",
        "AnnualIncomeIncrease",
        "NA"
      ],
      "line": 83
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "Check the projected balance is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "KiwiSaverCalcSteps.i_am_in_the_Westpac_New_Zealand_Limitied_banking_website()"
});
formatter.result({
  "duration": 3315867010,
  "status": "passed"
});
formatter.match({
  "location": "KiwiSaverCalcSteps.navigated_to_KiwiSaver_Retirment_Calculator_page()"
});
formatter.result({
  "duration": 4136890361,
  "status": "passed"
});
formatter.match({
  "location": "KiwiSaverCalcSteps.enter_inputValues_to_KiwiSaverRetirmentCalc(DataTable)"
});
formatter.result({
  "duration": 7872048299,
  "status": "passed"
});
formatter.match({
  "location": "KiwiSaverCalcSteps.check_the_projected_balance_is_displayed()"
});
formatter.result({
  "duration": 197401523,
  "status": "passed"
});
formatter.after({
  "duration": 693302761,
  "status": "passed"
});
});