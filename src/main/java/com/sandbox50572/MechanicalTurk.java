package com.sandbox50572;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MechanicalTurk implements Runnable {

    String name;
    String url_get_page;
    String url2;
    public MechanicalTurk(String name, String url_get_page) {
      this.name = name;
      this.url_get_page = url_get_page;
      this.url2 = "https://www.mturk.com";
    }
    public void run() {

        //TODO ЗАПУСК Chrome
        System.setProperty("webdriver.chrome.driver","C:/idea/chromedriver.exe");
        ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        //разворачивание на весь экран
        driver.manage().window().maximize();
        //неявное ожидание действует всякий раз при поиске элемента
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Заходим на страницу google
        driver.get(url_get_page);

        //находим элемент поиск google
        WebElement googleSearch = driver.findElementById("lst-ib");
        //вводим поисковый запрос
        googleSearch.sendKeys("https://www.mturk.com");
        googleSearch.sendKeys(Keys.ENTER);


        /*
        //TODO Автооризация в аккаунте google
        //находим элемент воити
        WebElement autorization = driver.findElementById("gb_70");
        //жмем на кнопку
        autorization.click();
        //находим поле login
        WebElement loginField = driver.findElementById("identifierId");
        //вводим E-mail
        loginField.sendKeys("jumshudivanych@gmail.com");
        //жмем кнопку Далее
        WebElement cont = driver.findElementByClassName("CwaK9");
        cont.click();
        //находим поле пароль
        WebElement passField = driver.findElementByName("password");
        //вводим пароль
        passField.sendKeys("1234cani");
        //находим и жмем кнопку
        WebElement cont2 = driver.findElementByClassName("CwaK9");
        cont2.click();
        */

        //driver.navigate().to("https://www.mturk.com");
        //TODO Вход на MechanicalTurk
        //driver.get("https://www.mturk.com");
        /*
        //Авторизация
        WebElement loginF = driver.findElementById("index_email");
        loginF.sendKeys("89042840876");
        WebElement passF = driver.findElementById("index_pass");
        passF.sendKeys("1234cani");
        WebElement buttonCom = driver.findElementById("index_login_button");
        buttonCom.click();
        */
    }
}
