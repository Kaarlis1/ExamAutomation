package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.LandingScreen;

public class LandingSteps {

    private LandingScreen landingScreen = new LandingScreen();

    @Given("I open the application")
    public void iOpenTheApplication() {
        landingScreen.checkLandingScreen("OurGroceries", "RECIPES", "SHOPPING LIST");
    }

    @When("I add a new recipe through settings button with name “RecipeName” Then I see the new recipe added with name “RecipeName”")
    public void iAddANewRecipeThroughSettingsButtonWithNameRecipeNameThenISeeTheNewRecipeAddedWithNameRecipeName() {

        landingScreen.clicksOptions();

        landingScreen.setAddRecipeOption();
        //landingScreen.typeInShoppingName("Recipe name");

    }

    @When("I enter the recipe “RecipeName”")
    public void iEnterTheRecipeRecipeName() {

    }

    @And("I add a new ingredient “bread”")
    public void iAddANewIngredientBread() {

    }

    @Then("I see the new added ingredient “bread” And I delete the the recipe")
    public void iSeeTheNewAddedIngredientBreadAndIDeleteTheTheRecipe() {
    }
}
