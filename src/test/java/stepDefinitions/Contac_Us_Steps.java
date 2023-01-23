package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class Contac_Us_Steps {
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

    @Given("I access the testing-app.witwiser concat us page")
    public void İ_access_the_testing_app_witwiser_concat_us_page(){
        driver.get("https://testing-app.witwiser.io/login");
    }

    @When("I enter a unique user name")
    public  void İ_enter_a_unique_user_name (){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("witwises-admin");
    }

    @And("I enter a unique user password")
    public  void İ_click_on_the_login_password(){
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("lLYVRayAHimpt9bJ");

    }
    @And("I click on the login button")
    public  void İ_click_on_the_login_button(){
        driver.findElement(By.className("src-scenes-dashboard-components-LoginCard-LoginCard__buttonText")).click();

    }
    @And("The user clicks the sessions menu")
    public  void The_user_clicks_the_sessions_menu(){
        driver.findElement(By.className("item src-common-components-Navbar-NavbarItem-NavbarItem__item  ")).click();

    }

    @And("The user click the session assignee")
    public void The_user_click_the_session_assignee(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/button")).click();
    }

    @And("The user fills in the session templates required field")
    public  void The_user_fills_in_the_session_templates_required_field(){
        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/form/div[2]/div/div/div/div[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/form/div[2]/div/div/div/div[2]/div[3]/div/div/div")).click();

    }

    @And("The user fills in date required fields")
    public void The_user_fills_in_date_required_fields(){
        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/form/div[3]/div[1]/div/div/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[2]")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[1]")).click();

        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/form/div[3]/div[2]/div/div/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/form/div[3]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[3]")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/form/div[3]/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[145]")).click();
    }

    @And("When user assignment type group name is selected")
    public  void When_user_assignment_type_group_name_is_selected(){
        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/form/div[4]/div/div/i")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/form/div[4]/div/div/div[2]/div[1]/span")).click();

    }

    @And("User selects group name")
    public void User_selects_group_name(){
        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/form/div[5]/div/div/div/div[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/form/div[5]/div/div/div/div[2]/div[1]/p")).click();
    }

    @Then("The user completes the session assignment process")
    public  void The_user_completes_the_session_assignment_process(){
        driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button[2]")).click();
    }

}