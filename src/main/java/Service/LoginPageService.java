package Service;

import model.User;
import page.GlobalPage;
import page.LoginPage;

public class LoginPageService {

    LoginPage loginPage = new LoginPage();

    public GlobalPage login(User user) {
        loginPage.openPage()
                .enterEmail(user.getUserName())
                .enterPassword(user.getUserPassword())
                .clickLoginButton();
        return new GlobalPage();
    }
}
