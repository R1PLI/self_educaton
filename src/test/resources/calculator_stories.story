Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Add two valid numbers
Given a calculator
When I add <number1> and <number2>
Then the outcome should <result>

Examples:
 |number1|number2|result|
 |  10   |  10   |  20  |
 |  20   |  20   |  40  |
 |  -2   |  -2   |  -4  |
 |  5    |  5    |  10  |
 |  8    |  8    |  16  |
 |  0    |  -5   |  -5  |
 |  25   |  25   |  50  |
