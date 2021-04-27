import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste {
    @Test
    public void scripttest(){
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        navegador.get("https://www.facebook.com/");
        navegador.get("https://www.facebook.com/");

    }
}
