import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Command;
import org.junit.Assert;

import java.util.List;

public class CommandSteps {

    private Command command;


    @Given("Customer {string} who want to command for Someone")
    public void customerWhoWantToCommandForSomeone(String name){
        command = new Command();
        command.setFrom(name);
    }

    @When("a command is make for Someone")
    public void aCommandIsMakeForSomeone(){
        command.setTo("Tata");
    }

    @Then("there is no product in the Command")
    public void thereIsNoProductInTheCommand(){
        Assert.assertTrue(command.getProducts().isEmpty());
    }

    @And("the command come from Customer {string}")
    public void theCommandComeFromCustomer(String name){
        Assert.assertEquals(name,command.getFrom());
    }
    /* ____________________________________________________ */


    @Given("Customer {string} who want to command")
    public void customerWhoWantToCommand(String name){
        command = new Command();
        command.setFrom(name);
    }

    @When("a command is made for the customer")
    public void aCommandIsMadeForTheCustomer(String name){
        command.setTo(name);

    }

    @Then("there is 2 products in the Command")
    public void thereIs2ProductsInTheCommand(){
        command.setProducts(List.of("Schtömel", "Vapoteuse"));
        Assert.assertEquals(2,command.getProducts().size());
    }

    @And("the command comme from Customer {string}")
    public void theCommandCommeFromCustomer(String name){
        Assert.assertEquals(name,command.getFrom());
    }


}
