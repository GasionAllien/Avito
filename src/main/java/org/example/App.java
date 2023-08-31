package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.avito.ru/nikel/knigi_i_zhurnaly/domain-driven_design_distilled_vaughn_vernon_2639542363");

        WebElement span  = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div[2]/div[3]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/button/span"));

        span.click();
    }
}