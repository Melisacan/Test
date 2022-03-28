package pages;

import driver.BaseTest;
import methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductPage {
    Methods methods;
    WebDriver driver;
    Logger logger = LogManager.getLogger(ProductPage.class);


    public ProductPage(){
        methods=new Methods();
        driver= BaseTest.driver;
    }
    public void selectProduct(){
        methods.waitBySeconds(1);
        WebElement ara=methods.findElement(By.xpath("//*[@id=\"search-input\"]"));
        ara.sendKeys("Oyuncak");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(1);
    }
    public void scrollPage(){
        List<WebElement> items = driver.findElements(By.cssSelector(".product-list>.product-cr"));
        long listCount = items.stream().count();
        if (listCount >= 7) {
            String currentItemId = items.get(6).getAttribute("id");
            String navigationItemId = ".product-list>#" + currentItemId;
            methods.scrollWithAction(By.cssSelector(navigationItemId));
        } else if (listCount > 0 && listCount < 7) {
            String currentItemId = items.get(0).getAttribute("id");
            String navigationItemId = ".product-list>#" + currentItemId;
            methods.scrollWithAction(By.cssSelector(navigationItemId));
        }

    }
    public void addFavorite(){
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"product-580553\"]/div[2]/div[3]/a[4]/i"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"product-577327\"]/div[2]/div[3]/a[4]/i"));
        methods.waitBySeconds(7);
        methods.click(By.xpath("//*[@id=\"product-572810\"]/div[2]/div[3]/a[5]/i"));
        methods.waitBySeconds(7);
        methods.click(By.xpath("//*[@id=\"product-565088\"]/div[2]/div[3]/a[3]/i"));
        methods.waitBySeconds(7);
    }
    public void favoriteControl(){
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[1]/div[1]/ul/li/a/b"));
        methods.click(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/a[5]/span"));
        methods.waitBySeconds(1);
    }
    public void backToHomePage(){
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"header-bottom\"]/div/div[2]/a/img"));
        methods.waitBySeconds(1);
    }
    public void pointCatalog(){
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".lvl1catalog>a"));
        methods.waitBySeconds(1);
        WebElement scroolTurkKlasikleri= methods.findElement(By.xpath("//*[@id=\"landing-point\"]/div[4]/a[2]/img"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"landing-point\"]/div[4]/a[2]/img"));
        methods.waitBySeconds(1);
    }
    public void filter(){
        methods.waitBySeconds(2);
        Select drpFilter= new Select(methods.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[1]/select")));
        drpFilter.selectByVisibleText("Yüksek Oylama");
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/span"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//a[text()='Hobi']"));
        methods.waitBySeconds(1);
    }
    public void addToBasket(){
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"product-584966\"]/div[3]/div/a/img"));
        methods.waitBySeconds(1);
        methods.click(By.id("button-cart"));
        methods.waitBySeconds(1);
    }
    public void goToMyFavorites(){
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/a"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//a[text()='Favorilerim']"));
        methods.waitBySeconds(1);
    }
    public void thirdProductDelete(){
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"product-572810\"]/div[2]/div[3]/a[5]/i"));
        methods.waitBySeconds(1);
    }
    public void goToBasket(){
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"cart\"]/div[1]/div[2]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"js-cart\"]"));
        methods.waitBySeconds(1);
    }
    public void increaseProduct(){
        methods.waitBySeconds(1);
        WebElement numberProduct=methods.findElement(By.xpath("//*[@id=\"cart_module\"]/div[1]/table/tbody/tr/td[4]/form/input[1]"));
        numberProduct.sendKeys("2");
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"cart_module\"]/div[4]/div[1]/a"));
        methods.waitBySeconds(1);
    }
    public void newAddress(){
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"shipping-tabs\"]/a[2]"));
        WebElement name= methods.findElement(By.id("address-firstname-companyname"));
        name.sendKeys("Melis");
        WebElement surname=methods.findElement(By.id("address-lastname-title"));
        surname.sendKeys("Açan");
        Select drpCountry=new Select(methods.findElement(By.id("address-country-id")));
        drpCountry.selectByVisibleText("Türkiye");
        Select drpCity=new Select(methods.findElement(By.id("address-zone-id")));
        drpCity.selectByVisibleText("İzmir");
        Select drpTown=new Select(methods.findElement(By.name("county_id")));
        drpTown.selectByVisibleText("Gaziemir");
        WebElement neighborhood=methods.findElement(By.id("district"));
        neighborhood.sendKeys("Gazi Mahallesi");
        WebElement detailAddress=methods.findElement(By.id("address-address-text"));
        detailAddress.sendKeys("Gazi mahallesi Albay ibrahim karaoğlanoğlu caddesi");
        WebElement postCode=methods.findElement(By.id("address-postcode"));
        postCode.sendKeys("35035");
        WebElement landTelephone=methods.findElement(By.id("address-telephone"));
        landTelephone.sendKeys("05063502344");
        WebElement mobilePhone=methods.findElement(By.id("address-mobile-telephone"));
        mobilePhone.sendKeys("address-mobile-telephone");
        WebElement tcId=methods.findElement(By.id("address-tax-id"));
        tcId.sendKeys("12345678900");
        methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(1);
    }


    public void attributeTest(){
        String attribute= methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");

    }

}
