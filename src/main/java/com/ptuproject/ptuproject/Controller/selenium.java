package com.ptuproject.ptuproject.Controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class selenium {

    private WebDriver driver;

    public void process() {
        System.setProperty("java.awt.headless", "false");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://www.google.co.kr/");

    }

}