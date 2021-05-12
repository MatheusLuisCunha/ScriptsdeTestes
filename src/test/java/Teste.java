import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.ScreenShooter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Teste {

    @BeforeClass
        public static void setup(){
        Configuration.browser="chrome";
        Configuration.timeout=6000;// 6 sec
        Configuration.startMaximized=true;// Maximizar Navegador
        Configuration.headless=true;// Sem Abrir o navegador
    }

    @Test
    public void Argentina() {
        TestePrincipalPages teste = new TestePrincipalPages();
        teste.argentina();
    }

    @Test
    public void Brasil() {
        TestePrincipalPages teste = new TestePrincipalPages();
        teste.brasil();
    }

    @Test
    public void Chile() {
        TestePrincipalPages teste = new TestePrincipalPages();
        teste.chile();
    }

    @Test
    public void Alemanha() {
        TestePrincipalPages teste = new TestePrincipalPages();
        teste.alemanha();

    }

    @Test
    public void Espanha() {
        TestePrincipalPages teste = new TestePrincipalPages();
        teste.espanha();

    }

    @Test
    public void Italia() {
        TestePrincipalPages teste = new TestePrincipalPages();
        teste.italia();
    }

    @Test
    public void Mexico() {
        TestePrincipalPages teste = new TestePrincipalPages();
        teste.mexico();

    }

    @Test
    public void Portugal() {
        TestePrincipalPages teste = new TestePrincipalPages();
        teste.portugal();

    }

    @Test
    public void United_Kingdom() {
        TestePrincipalPages teste = new TestePrincipalPages();
        teste.united_kingdom();

    }

    @Test
    public void Estados_Unidos() {
        TestePrincipalPages teste = new TestePrincipalPages();
        teste.estados_unidos();

    }

    @AfterClass
    public static void posCondicao(){
        closeWebDriver();
    }

   @Rule
    public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests().succeededTests();



}

