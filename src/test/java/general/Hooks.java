package general;

import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base{
    private Base base; // objeto interno local para a comunicação da Classe extendida

    // constutor para a classe base
    public Hooks(Base base) {
        this.base = base;
    }
    //before
    @Before
    public void setup(){
        // onde está o driver do browser
        System.setProperty("webdriver.chrome.driver","drivers/chrome/88/chromedriver.exe");
        //instanciar o driver do chrome
        base.driver = new ChromeDriver();
        // maximizar a tela
        base.driver.manage().window().maximize();
        // definir a espera implicita do selenium webdriver para 1 minuto
        base.driver.manage().timeouts().implicitlyWait( 60000, TimeUnit.MILLISECONDS);
    }
    // after
    @After
    public void tearDown(){
        base.driver.quit();// destruir o objeto do selenium
    }


}
