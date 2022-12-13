package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenShopPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"puma-skip-here\"]/div/section/nav[1]/div/div/div/div[1]/div[2]/div/div[4]/button")
    private WebElement categories;

    @FindBy(xpath = "//*[@id=\"puma-skip-here\"]/div/section/nav[1]/div/div/div/div[1]/div[2]/div/div[4]/div/div/div[2]/div/div/button[1]/span[1]")
    private WebElement color;
    protected AbstractPage openPage() {
        return null;
    }

    public WomenShopPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void setCategories() throws InterruptedException {
        Thread.sleep(10000);
        driver.navigate().refresh();
        categories.click();
        color.click();
        driver.navigate().refresh();
    }
}
