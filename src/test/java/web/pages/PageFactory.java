package web.pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    private final WebDriver driver;
    public PageFactory(WebDriver driver){
        this.driver=driver;
    }
    public SubscriptionPage SubscriptionPage(){
        return new SubscriptionPage(driver);
    }
}
