Feature: Leaftaps functionality


Scenario: Create lead with mandatory functionality
Given Go to Lead button
And Click create lead
And Enter Company Name as 'Testleaf'
And Enter First Name as 'Rashmi'
And Enter Last Name as 'Bhatt'
When Click Create Lead button
Then Exit browser
