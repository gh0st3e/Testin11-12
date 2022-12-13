package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {
    private static final String HOMEPAGE_URL = "https://us.puma.com/us/en";

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/nav/div/ul/li[4]/div/div[1]/a/span")
    private WebElement Men;

    //_______________________________________________________________________________

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/nav/div/div[1]/form/div/label/input")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/nav/div/div/form/div/label/div/button/svg/use")
    private WebElement searchBtn;

    //_______________________________________________________________________________

    @FindBy(xpath = "//*[@id=\"__next\"]/div/footer/nav/div[2]/ul/li[1]/img")
    private WebElement forMove2;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/footer/nav/div[1]/div[3]/div[1]/button/span[1]")
    private WebElement changeLan;

    @FindBy(xpath = "//*[@id=\"location-results-listbox\"]/li[2]/ul/li[2]/a")
    private WebElement chooseLan;

    //_______________________________________________________________________________

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/nav/div/ul/li[3]/div/div[1]/a/span")
    private WebElement Women;

    //_______________________________________________________________________________

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/nav/div/ul/li[6]/div/div[1]/a/span")
    private WebElement Collabarations;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/nav/div/ul/li[6]/div/div[2]/div/ul[2]/li[8]/a")
    private WebElement Minecraft;

    //_______________________________________________________________________________

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/nav/div/ul/li[7]/div/div[1]/a/span")
    private WebElement Sport;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public MainPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public MenShopPage openMenShopPage(){
        Men.click();
        return new MenShopPage(driver);
    }

    public ItemsPage setText(String name){
        searchField.click();
        searchField.sendKeys(name);
        searchField.sendKeys(Keys.ENTER);
        return new ItemsPage(driver);
    }

    public void ChangeLan() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(changeLan);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        changeLan.click();
        Thread.sleep(10000);
        chooseLan.click();
    }

    public WomenShopPage openWomenShopPage(){
        Women.click();
        return new WomenShopPage(driver);
    }

    public CollabarationPage openCollabarationPage(){
        Actions action = new Actions(driver);
        action.moveToElement(Collabarations);
        action.perform();
        try {
            Thread.sleep(
                    10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Minecraft.click();
        driver.navigate().refresh();
        return new CollabarationPage(driver);
    }

    public SportPage openSportPage(){
        Sport.click();
        return new SportPage(driver);
    }
}
