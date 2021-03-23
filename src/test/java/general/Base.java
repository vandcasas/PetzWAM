package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver; // objeto do selenium WebDriver,vulgo bola
    //ao usar PageFactory mudar de public para protected

    //criar um construtor e inicializar os elementos do pageFacory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
