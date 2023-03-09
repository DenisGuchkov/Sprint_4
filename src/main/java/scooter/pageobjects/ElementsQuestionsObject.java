package scooter.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsQuestionsObject {
    private final WebDriver driver;
    // Сколько это стоит? И как оплатить?


    public ElementsQuestionsObject(WebDriver driver) {
        this.driver = driver;
    }

    public void setElementButton(String clickQuestion) {
        driver.findElement(By.xpath("//*[contains(text(),'" + clickQuestion + "')]")).click();
    }

    public void setTextElement(String answerQuestion) {
        driver.findElement(By.xpath(".//*[starts-with(text(),'" + answerQuestion + "')]")).getText();
    }

    public void elementsQuestionsObject(String elementButton, String textElement) {
        setElementButton(elementButton);
        setTextElement(textElement);
    }
}
