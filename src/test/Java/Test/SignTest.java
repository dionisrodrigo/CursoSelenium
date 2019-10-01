package Test;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignTest {
    @Test
    public void testFazerLogin(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hom.portalconectasaude.com.br/Account/Login?ReturnUrl=%2F");
    //    System.out.println(driver.getTitle());
       // Assert.assertEquals("Benner Conecta", driver.getTitle());
        driver.quit();
    }
}
