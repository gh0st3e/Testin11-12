package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MenShopPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"puma-skip-here\"]/div/section/nav[1]/div/div/div/div[1]/div[2]/div/div[1]/button")
    private WebElement shoesCat;

    @FindBy(xpath = "//*[@id=\"puma-skip-here\"]/div[1]/section/nav[1]/div/div/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div/div/label[1]/div[1]")
    private WebElement shoes;

    @FindBy(xpath = "//*[@id=\"puma-skip-here\"]/div[1]/section/nav[1]/div/div/div/div[1]/div[2]/div/div[3]/button")
    private WebElement priceCat;

    @FindBy(xpath = "//*[@id=\"(100..150)\"]")
    private WebElement price;

    @FindBy(xpath = "//*[@id=\"puma-skip-here\"]/div[1]/section/nav[1]/div/div/div/div[1]/div[2]/div/div[4]/button")
    private WebElement sizeCat;

    @FindBy(xpath = "//*[@id=\"puma-skip-here\"]/div[1]/section/nav[1]/div/div/div/div[1]/div[2]/div/div[4]/div/div/div[2]/div/div/button[3]")
    private WebElement size;

    protected AbstractPage openPage() {
        return null;
    }
    public MenShopPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void SetCategories() throws InterruptedException {
        Thread.sleep(10000);
        driver.navigate().refresh();
        shoesCat.click();
        shoes.click();
        driver.navigate().refresh();
        priceCat.click();
        price.click();
        driver.navigate().refresh();
        sizeCat.click();
        size.click();
        driver.navigate().refresh();
    }
}
