package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.time.Duration;
import java.util.List;
import static com.codeborne.selenide.Selenide.*;

public class EditPostsPage {
  //  private static final String EDIT_PAGE_URL = "https://moodpanda.com/dashboard/mydata";
    private static final int WAIT_ELEMENT = 15;
    private static final List<SelenideElement> RATTING_SELECT = $$(By.xpath("//td//select"));
    private static final List<SelenideElement> DELETE_BUTTON = $$(By.xpath("//table//button[contains(text(), 'Delete')]"));
    private static final  List<SelenideElement> UPDATE_BUTTON = $$(By.xpath("//button[contains(@class, 'is-outdlined')]"));
    private static final  List<SelenideElement> ADD_BUTTON = $$(By.xpath("//td/div[@class='buttons']/*"));
    private static final  List<SelenideElement> FIELD_TEXT = $$(By.xpath("//td[@class='wrap']/textarea"));
    private static final SelenideElement SUCCESS_EDIT_MASSAGE = $(By.xpath("//*[contains(text(), 'Post updated')]"));
    private static final SelenideElement SUCCESS_DELETE_MASSAGE = $(By.xpath("//*[contains(text(), 'Post deleted')]"));
    private static final SelenideElement SUCCESS_ADD_MASSAGE = $(By.xpath("//*[contains(text(), 'Posted')]"));
    private static final int POSITION = 0;

    public EditPostsPage clickAddPost(){
        ADD_BUTTON.get(POSITION).click();
        return this;
    }

    public EditPostsPage writeText(String text){
        FIELD_TEXT.get(POSITION).sendKeys(text);
        return this;
    }

    public EditPostsPage setupRating (String rating){
    RATTING_SELECT.get(POSITION).selectOptionByValue(rating);
    return this;
    }

    public EditPostsPage clickUpdateButton(){
        UPDATE_BUTTON.get(POSITION).click();
        return this;
    }

    public EditPostsPage clickDeleteButton(){
        DELETE_BUTTON.get(POSITION).click();
        return this;
    }

    public boolean isSuccessEditMessageDisplayed(){
            return SUCCESS_EDIT_MASSAGE.shouldBe(Condition.visible, Duration.ofSeconds(WAIT_ELEMENT)).isDisplayed();
    }

    public boolean isSuccessAddMessageDisplayed(){
        return SUCCESS_ADD_MASSAGE.shouldBe(Condition.visible, Duration.ofSeconds(WAIT_ELEMENT)).isDisplayed();
    }

    public boolean isSuccessDeleteMessageDisplayed(){
        return SUCCESS_EDIT_MASSAGE.shouldBe(Condition.visible, Duration.ofSeconds(WAIT_ELEMENT)).isDisplayed();
    }

    public EditPostsPage clickDeletePostButton(){
        UPDATE_BUTTON.get(POSITION).click();
        return this;
    }
}
