package web.tests;

import org.testng.annotations.Test;
import web.core.Country;
import web.core.Plan;

public class SubscriptionTest extends WebTestBase {
    @Test()
    public void SubscriptionKSATest(){
        page.SubscriptionPage().changeCountry(Country.KSA);
        page.SubscriptionPage().verifyPlans();
        page.SubscriptionPage().verifyPrice("15", "SAR", Plan.LITE);
        page.SubscriptionPage().verifyPrice("25", "SAR", Plan.CLASSIC);
        page.SubscriptionPage().verifyPrice("60", "SAR", Plan.PREMIUM);
    }

    @Test()
    public void SubscriptionKWTest(){
        page.SubscriptionPage().changeCountry(Country.Kuwait);
        page.SubscriptionPage().verifyPlans();
        page.SubscriptionPage().verifyPrice("1.2", "KWD", Plan.LITE);
        page.SubscriptionPage().verifyPrice("2.5", "KWD", Plan.CLASSIC);
        page.SubscriptionPage().verifyPrice("4.8", "KWD", Plan.PREMIUM);
    }

    @Test()
    public void SubscriptionBHTest(){
        page.SubscriptionPage().changeCountry(Country.Bahrain);
        page.SubscriptionPage().verifyPlans();
        page.SubscriptionPage().verifyPrice("2", "BHD", Plan.LITE);
        page.SubscriptionPage().verifyPrice("3", "BHD", Plan.CLASSIC);
        page.SubscriptionPage().verifyPrice("6", "BHD", Plan.PREMIUM);
    }
}
