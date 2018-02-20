package com.sandbox50572;

import java.util.Date;

public class TimeControl implements Runnable {

   public TimeControl() {

   }

    public void run() {
        while (true) {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Date date = new Date();
            System.out.println(date.toString());
        }
    }
}
