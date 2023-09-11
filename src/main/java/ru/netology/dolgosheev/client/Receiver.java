package ru.netology.dolgosheev.client;

import ru.netology.dolgosheev.log.Log;

import java.io.BufferedReader;
import java.io.IOException;

public class Receiver extends Thread {

    private static final Log LOG = Log.getInstance();

    private final BufferedReader in;

    public Receiver(BufferedReader in) {
        this.in = in;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(in.readLine());
            }
        } catch (IOException e) {
            LOG.log("Class error " + Receiver.class.getName());
            e.printStackTrace();
        }
    }
}
