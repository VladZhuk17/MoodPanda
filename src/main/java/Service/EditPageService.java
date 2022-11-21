package Service;
import model.User;
import page.EditPostsPage;

public class EditPageService {

    EditPostsPage editPostsPage = new EditPostsPage();

    public EditPostsPage openEditPostPage(){
        User user = new User();
        LoginPageService loginPageService = new LoginPageService();
        return loginPageService.login(user).openEditPage();
    }

    public EditPostsPage createPost(String text, String rating){
        editPostsPage.setupRating(rating)
                .writeText(text)
                .clickAddPost();
        return new EditPostsPage();
    }

    public EditPostsPage changeRatingPost(String rating) {
        editPostsPage.setupRating(rating)
                .clickUpdateButton();
        return new EditPostsPage();
    }

   public EditPostsPage deletePost() {
        editPostsPage.clickDeleteButton();
        return new EditPostsPage();
    }
}
