import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeTest extends BaseTest {

    //    @Test
//    public void testStoreName() throws InterruptedException {
//        System.out.println("Page Title is "+ driver.getTitle());
//        String websiteName = driver.findElement(By.xpath("//h1/a[@href='https://askomdch.com/']")).getText();
//
//        Assert.assertEquals(websiteName, "AskOmDch");
//
//    }
    @Test
    public void testStoreName() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "AskOmDch – Become a Selenium automation expert!", "Title does not match!");

    }
}
