package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SportPage extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"puma-skip-here\"]/div[1]/section/nav[1]/div/div/div/div[1]/div[2]/div/div[1]/button")
    private WebElement teamCat;

    @FindBy(xpath = "//*[@id=\"Porsche Legacy\"]")
    private WebElement team;

    @FindBy(xpath = "//*[@id=\"product-list-sort-select\"]")
    private WebElement sortCat;

    @FindBy(xpath = "//*[@id=\"product-list-sort-select\"]/option[4]")
    private WebElement sort;

    protected AbstractPage openPage() {
        return null;
    }
    public SportPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void setSort() throws InterruptedException {
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        teamCat.click();
        team.click();
        driver.navigate().refresh();
        Thread.sleep(5000);
        sortCat.click();
        sort.click();
        Thread.sleep(5000);
        driver.navigate().refresh();
    }
}
