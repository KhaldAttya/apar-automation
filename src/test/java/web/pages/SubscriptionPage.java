package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import web.core.Country;
import web.core.Plan;

public class SubscriptionPage extends WebBasePage {
    public SubscriptionPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "country-btn")
    WebElement countryButton;
    @FindBy(id = "sa-contry-lable")
    WebElement saCountryLabel;
    @FindBy(id = "kw-contry-lable")
    WebElement kwCountryLabel;
    @FindBy(id = "bh-contry-lable")
    WebElement bhCountryLabel;
    @FindBy(id = "lite-selection")
    WebElement litePlan;
    @FindBy(id = "lite-selection")
    WebElement classicPlan;
    @FindBy(id = "premium-selection")
    WebElement premiumPlan;
    @FindBy(id = "currency-lite")
    WebElement litePrice;
    @FindBy(id = "currency-classic")
    WebElement classicPrice;
    @FindBy(id = "currency-premium")
    WebElement premiumPrice;

    public void changeCountry(Country country){
        countryButton.click();
        switch (country){
            case KSA -> {
            saCountryLabel.click();
            }
            case Kuwait -> {
                kwCountryLabel.click();
            }
            case Bahrain -> {
                bhCountryLabel.click();
            }
        }
    }

    public void verifyPlans(){
        waitForElement(litePlan);
        waitForElement(classicPlan);
        waitForElement(premiumPlan);
    }

    public void verifyPrice(String value, String currency, Plan plan){
        switch (plan){
            case LITE -> {
                Assert.assertEquals(litePrice.getText(), value + " " + currency + "/month");
            }
            case CLASSIC -> {
                Assert.assertEquals(classicPrice.getText(), value + " " + currency + "/month");
            }
            case PREMIUM -> {
                Assert.assertEquals(premiumPrice.getText(), value + " " + currency + "/month");
            }
        }
    }
}
