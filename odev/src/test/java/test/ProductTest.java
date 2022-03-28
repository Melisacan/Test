package test;

import driver.BaseTest;
import org.junit.Test;
import pages.LoginPage;
import pages.ProductPage;


public class ProductTest extends BaseTest {
    @Test
    public void productTest(){
        LoginPage loginPage= new LoginPage();
        ProductPage productPage=new ProductPage();
        loginPage.login();
        loginPage.userName();
        loginPage.password();
        loginPage.signIn();
        productPage.selectProduct();
        productPage.scrollPage();
        productPage.addFavorite();
        productPage.favoriteControl();
        productPage.backToHomePage();
        productPage.pointCatalog();
        productPage.filter();
        productPage.addToBasket();
        productPage.goToMyFavorites();
        productPage.thirdProductDelete();
        productPage.goToBasket();
        productPage.increaseProduct();
        productPage.newAddress();
        productPage.attributeTest();
    }
}
