package Test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCampoTreinamento {
    @Test
    public void CampoTreinamento(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///Users/dionismoreira/Desktop/campo-treinamento/componentes.html");
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Dionis");
        Assert.assertEquals("Dionis", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
        //driver.quit();
    }
    @Test
    public void DeveInteregirComTextArea(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///Users/dionismoreira/Desktop/campo-treinamento/componentes.html");
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("aqui é é umt este muito grande");
        driver.quit();
    }
    @Test
    public void InteragirComRadioButton() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///Users/dionismoreira/Desktop/campo-treinamento/componentes.html");
        driver.findElement(By.id("elementosForm:sexo:0")).click(); //Clicando no botão
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected()); // Validando se o botão foi clicado
        driver.quit();
    }
    @Test
    public void InteragirComComboBox(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///Users/dionismoreira/Desktop/campo-treinamento/componentes.html");
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
        driver.quit();

    }
}

