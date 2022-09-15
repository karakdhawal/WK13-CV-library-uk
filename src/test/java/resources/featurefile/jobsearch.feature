Feature: Job Search Test

  Scenario Outline: Verify job search result using different data set
    Given I am on home page.
    When I enter job title "<jobTitle>"
    And I enter Location "<location>"
    And I select distance "<distance>"
    And I click on more search options link
    And I enter Salary Min "<salaryMin>"
    And I enter Salary Max "<salaryMax>"
    And I select Salary Type "<salaryType>"
    And I select Job Type "<jobType>"
    And I click on Find Jobs Button
    Then I verify the result "<result>"

    Examples:
      | jobTitle | location | distance | salaryMin | salaryMax | salaryType | jobType | result |
      |Tester |Harrow | up to 5 miles |30000 |50000 |Per annum | Permanent | Permanent Tester jobs in Harrow on the Hill|
      |Manager | Leicester |up to 15 miles | 31000 | 49000 | Per month | Part Time | Part Time Manager jobs in Leicester |
      |Manual Tester | Leicester |up to 10 miles | 35000 | 45000 | Per annum | Permanent | Permanent Manual Tester jobs in Leicester |
      |Manual Tester | Birmingham |up to 25 miles | 33000 | 55000 | Per annum | Contract | Contract Manual Tester jobs in Birmingham |
      |Accountant | Wembley |up to 25 miles | 33000 | 65000 | Per annum | Permanent | Permanent Accountant jobs in Wembley |
      |Pharmacist | London |up to 25 miles | 53000 | 85000 | Per annum | Permanent | Permanent Pharmacist jobs in London |
    |Automation Tester | London | up to 250 miles | 45000 | 120000 | Per annum | Permanent | Permanent Automation Tester jobs in London |