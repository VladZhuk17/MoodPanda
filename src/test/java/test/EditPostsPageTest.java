package test;

import Service.EditPageService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditPostsPageTest extends BaseTest {

    private static final int POSITION = 1;
    EditPageService editPageService = new EditPageService();

   @Test(priority = 1, description = "Create post")
    public void verifyCreatePostPageTest() {
       editPageService.openEditPostPage();
       Assert.assertTrue(editPageService.createPost("asdasdasd","5")
               .clickAddPost().isSuccessAddMessageDisplayed(),"Post hasn't created");
    }

        @Test(priority = 2, description = "Edit post")
        public void verifyEditPostsPageTest () {
            String rating = "1";
            editPageService.openEditPostPage();
            Assert.assertTrue(editPageService.changeRatingPost(rating).isSuccessEditMessageDisplayed(), "Edit hasn't changed");
        }

        @Test(priority = 3, description = "Delete post")
        public void verifyDeletePostTest () {
            editPageService.openEditPostPage();
            Assert.assertTrue(editPageService.deletePost().isSuccessDeleteMessageDisplayed(), "Post hasn't delete");
        }
    }
