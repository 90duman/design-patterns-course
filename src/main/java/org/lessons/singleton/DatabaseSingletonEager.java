package org.lessons.singleton;

/**
 * Project: DesignPatternsLessons
 * Description: Not the best Singleton
 *
 * @author axteel on 04.04.2021 : 01:47
 * @version 1.0
 */
public class DatabaseSingletonEager {
    private static DatabaseSingletonEager instance = new DatabaseSingletonEager();

    private DatabaseSingletonEager() { }

    public static DatabaseSingletonEager getInstance() {
        return instance;
    }
}
