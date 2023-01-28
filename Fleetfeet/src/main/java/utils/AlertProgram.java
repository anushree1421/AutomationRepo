package utils;

import org.openqa.selenium.Alert;
import testbase.WebBaseTest;

import javax.swing.*;

public class AlertProgram extends WebBaseTest{
    public static void acceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}

