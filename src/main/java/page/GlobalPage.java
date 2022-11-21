package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class GlobalPage {
    private static final SelenideElement EDIT_POSTS_LINK = $(By.xpath("//aside[contains(@class,'column')]//a[contains(@href, 'mydata')]"));

    public EditPostsPage openEditPage(){
        EDIT_POSTS_LINK.click();
        return new EditPostsPage();
    }
}
