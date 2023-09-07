package ru.netology.dolgosheev.log;

import java.time.LocalDateTime;

public class Log {
    public static Log instance = null;
    public static final String logPath = "./log.txt";

    private Log() {
    }

    public static Log getInstance() {
        if (instance == null) {
            instance = new Log();
        }
        return instance;
    }

    public void log(String level, String msg) {
        if (!freqs.containsKey(level)) {
            freqs.put(level, 0);
        }
        freqs.put(level, freqs.get(level) + 1);
        System.out.println("[" + level + "#" + freqs.get(level) + "] " + LocalDateTime.now() + " === " + msg);
    }
}
