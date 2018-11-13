package com.company;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Random m = new Random();

        String[] lucianoCit = {"How is up?", "Boys", "A bit of silence", "Name and matricolation", "Sit down"};

        for (int i = 0; i < 10; i++) {
            System.out.println(lucianoCit[m.nextInt(lucianoCit.length)]);
            sleep(1500);
        }

    }
}
