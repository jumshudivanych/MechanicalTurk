package com.sandbox50572;

public class Coordinator implements Runnable {

    //конструктор
    public Coordinator() {

    }
    public void run() {

        //создание объекта
        Runnable mechanicalTurk = new com.sandbox50572.MechanicalTurk("mechanicalTurk", "https://www.google.ru");
        //создание дочернего потока
        Thread threadNext = new Thread(mechanicalTurk);
        //стартуем новыи поток
        threadNext.start();
    }
}
