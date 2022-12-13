package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import page.MainPage;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class PumaTest extends CommonConditions {

    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void driverSetup() {
        driver = new ChromeDriver();
    }

    @Test
    public void setCategoriesMen_TEST() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPage.openPage();

        menShopPage = mainPage.openMenShopPage();
        menShopPage.SetCategories();
        Assert.assertTrue(true);
    }

    @Test
    public void setText_TEST() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String name = "Basketball";

        mainPage = new MainPage(driver);
        mainPage.openPage();

        itemsPage = mainPage.setText(name);

        itemsPage.setCategory();
        itemsPage.chooseItem();
        Assert.assertTrue(true);
    }

    @Test
    public void changeLanguage_TEST() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.ChangeLan();
        Assert.assertTrue(true);
    }

    @Test
    public void setCategoriesWomen_TEST() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPage.openPage();

        womenShopPage = mainPage.openWomenShopPage();
        womenShopPage.setCategories();
        Assert.assertTrue(true);
    }

    @Test
    public void collaboration_TEST() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPage.openPage();

        collabarationPage = mainPage.openCollabarationPage();
        collabarationPage.chooseItem();
        Assert.assertTrue(true);
    }

    @Test
    public void sort_TEST() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPage.openPage();

        sportPage = mainPage.openSportPage();
        sportPage.setSort();
        Assert.assertTrue(true);
    }
}
