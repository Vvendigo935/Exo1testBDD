
Feature: Command Ordering

    as a customer i want to make a command for someone

    Scenario: Creation of an empty Command
        Given Customer "Michel" who want to command for Someone
        When a command is make for Someone
        Then there is no product in the Command
        And the command come from Customer "Michel"

        Scenario: Adding 2 Products
            Given Customer "Bidule" who want to command
            When a command is made for the customer
            Then there is 2 products in the Command
            And the command comme from Customer "Bidule"
