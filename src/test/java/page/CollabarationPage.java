package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollabarationPage extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"product-list-items\"]/li[1]/div[1]/a/div[1]")
    private WebElement Item;
    protected AbstractPage openPage() {
        return null;
    }
    public CollabarationPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void chooseItem() throws InterruptedException {
        Thread.sleep(10000);
        driver.navigate().refresh();
        Item.click();
    }
}
