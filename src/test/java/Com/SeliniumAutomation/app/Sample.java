package Com.SeliniumAutomation.app;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.testng.Assert;

@RunWith(Enclosed.class)
public class Sample {

        @Owner("Divakarthilak")
        @Severity(SeverityLevel.CRITICAL)
        @Description("Verify that user is able to login successfully")
        @Test
        public void verifyLogin() {
            System.out.println("Login test started...");

            // Example: Normally you would launch browser + login steps here
            boolean loginStatus = true;  // Dummy value for demo

            Assert.assertTrue(loginStatus, "Login should be successful");

            System.out.println("Login test completed.");
        }
    }



