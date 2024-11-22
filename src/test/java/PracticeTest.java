import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class PracticeTest extends BaseTest {

    @Test
    public void testStoreName() throws InterruptedException {
        System.out.println("Page Title is "+ driver.getTitle());
        String websiteName = driver.findElement(By.xpath("//h1/a[@href='https://askomdch.com/']")).getText();

        Assert.assertEquals(websiteName, "AskOmDch");

    }
}
