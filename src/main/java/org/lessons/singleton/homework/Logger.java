package org.lessons.singleton.homework;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * В этом задании нужно реализовать простую систему логирования
 * Пусть логи записываются в русурс какой-нибудь log.txt
 * <p>
 *
 * @author axteel on 05.04.2021 : 22:14
 * @version 1.0
 */
public class Logger {

    private static Logger logger = null;

    private final String logFile = "log.txt";
    private PrintWriter writer;

    public Logger() {
        try {
            FileWriter fileWriter = new FileWriter(logFile);
            writer = new PrintWriter(fileWriter, true);
        } catch (IOException e) {}
    }

    public static synchronized Logger getInstance(){
        if(logger == null)
            logger = new Logger();
        return logger;
    }

    public void log1 (String s1, double amount) {
        writer.println("Test1 (" + s1 + "): " + s1 + "$");
    }

    public void log2 (String s2, double amount) {
        writer.println("Test2 (" + s2 + "): " + s2 + "$");
    }

    public void log3 (String s3, String toAccount, double amount) {
        writer.println("Test13 (" + s3 + "->" + s3 + "): " + amount + "$");
    }

}
