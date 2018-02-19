package com.sandbox50572;

import java.io.IOException;

/**
 * Selenium ChromeDriver
 * Access to Mechanical Turk
 */
public class App 
{
    public static void main( String[] args )
    {
        //создание объекта coordinator
        Runnable coordinator1 = new Coordinator();
        //создание потока
        Thread threadCoordinator = new Thread(coordinator1);
        //стартуем поток coordinator
        threadCoordinator.start();
      /*
        //TODO Один из приеров запуска bat фаилов
        ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/C", "pathToYourFile.bat");
        try {
            Process process = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
      */
      TimeControl timeControl = new TimeControl();
      timeControl.printDate();
        System.out.println( "Метод main завершен." );

    }
}
