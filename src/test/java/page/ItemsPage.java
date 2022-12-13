package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemsPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"puma-skip-here\"]/div/section/nav[1]/div/div/div/div[1]/div[2]/div/div[2]/button")
    private WebElement categoryList;

    @FindBy(xpath = "//*[@id=\"puma-skip-here\"]/div/section/nav[1]/div/div/div/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/label[3]")
    private WebElement accessoryCategory;

    @FindBy(xpath = "//*[@id=\"product-list-items\"]/li[1]/div[1]/a/div[1]/img")
    private WebElement firstItem;

    protected AbstractPage openPage() {
        return null;
    }
    public ItemsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void setCategory() throws InterruptedException {
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        categoryList.click();
        accessoryCategory.click();
        driver.navigate().refresh();
    }

    public void chooseItem(){
        firstItem.click();
    }
}
