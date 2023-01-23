package stepDef_2;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.time.Duration;

public class Steps_2 {
    private WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("web-driver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("Click on user home button")
    public void Click_on_user_home_button(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/a/div/img")).click();

    }

    @When("Clicks the start test button from the exams area")
    public  void Clicks_the_start_test_button_from_the_exams_area(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/div[3]/div[2]/div/div[3]/a/span")).click();
    }

    @And("Click the start test again button on the page that comes up")
    public  void Click_the_start_test_again_button_on_the_page_that_comes_up(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[1]/button")).click();
    }
    @And("The first question is answered and proceeds")
    public  void The_first_question_is_answered_and_proceeds(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/div/div[2]/label/div/p")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[2]/div/img[2]")).click();
    }
    @And("The second question is answered and proceeds")
    public  void The_second_question_is_answered_and_proceeds(){
        driver.findElement(By.xpath("//*[@id=\"1ed9afea-0ccf-2f79-ddf0-0fa05cc09c74\"]/div/div[1]")).sendKeys("doğancan");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[2]/div/img[2]")).click();

    }

    @And("The third question is answered and proceeds")
    public void The_third_question_is_answered_and_proceeds(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/div/div[2]/label/div/p")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[2]/div/img[2]")).click();
    }


    @And("The fourth question is answered and proceeds")
    public  void The_fourth_question_is_answered_and_proceeds(){

        //DragAndDrop Kullanımı//

        WebElement From1=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[1]/div/span[1]/div"));
        WebElement To1=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/span[2]/span"));

        WebElement From2=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[1]/div/span[2]/div"));
        WebElement To2=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/span[4]/span"));

        WebElement From3=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[1]/div/span[3]/div"));
        WebElement To3=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/span[6]/span"));

        WebElement From4=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[1]/div/span[4]/div"));
        WebElement To4=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/span[8]/span"));

        Actions act=new Actions(driver);

        act.dragAndDropBy(From1,150,20).build().perform();
        act.dragAndDropBy(From2,150,20).build().perform();
        act.dragAndDropBy(From3,150,20).build().perform();
        act.dragAndDropBy(From4,150,20).build().perform();

    }

    @Then("Click the finish test button")
    public  void Click_the_finish_test_button(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div/button")).click();
    }

}