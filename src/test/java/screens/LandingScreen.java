package screens;

import testUI.elements.UIElement;

import static testUI.Utils.By.*;
import static testUI.elements.TestUI.E;

public class LandingScreen {

    private final UIElement LandingScreen = E(byAccesibilityId("More options"));
    private final UIElement addRecipe =
            E(byAndroidUIAutomator("textContains(\"Add recipe\")"));

    public void clicksOptions() {
        LandingScreen.click();
    }


    public void setAddRecipeOption() {
        addRecipe.click();
    }

    public LandingScreen checkLandingScreen(String... args) {
        for (String arg : args) {
            UIElement element =
                    E(byAndroidUIAutomator("textContains(\"" + arg + "\")"));
            element.waitFor(5).untilIsVisible();
        }

        return this;
    }
}
