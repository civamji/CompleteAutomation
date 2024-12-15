import org.testng.annotations.Test;

public class DriverClass {

    //Flow of the project
    /*
    1. Calling driver class to make connection by passing browser name.
    2. Hitting a URL provided in parameter.(https://www.automationexercise.com/)
    3. Login method, provided username/password in parameter.
    4. Signup method incase user is not created.
    5. Clicking on product to add into cart.
    6. View cart
    7. Add comment and checkout.
    8. Enter Card detail/pay and confirm page. Download invoice.
    9. Logout

     */

   driverConnection connection= new driverConnection();

   @Test
        void login1()
        {
            SiteLogin siteLogin = new SiteLogin();
            siteLogin.LoginWithCred(connection.BrowserDriverSelect("Chrome"));
        }
    @Test
    void hitURL() {

    }
    }



