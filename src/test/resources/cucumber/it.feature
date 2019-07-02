Feature: Life of IT Tester

In order to get good salary
As a IT guy
I want to keep my boss happy

Scenario Outline: I am a tester
    Given I am a "<Tester_Type>" tester
    When I go to work
    Then I "<Work_Output>" it
    And My boss "<Boss_Action>" me
    But The developer "<Developer_Reaction>" me

Examples:
|  Tester_Type  |  Work_Output |  Boss_Action  | Developer_Reaction |
|    good       |    complete  |  salutes      | hates                      |
|    bad        |    mess      |  fires          | likes              |
|    avg        |  satisfies   |  congratulates| respects           |

