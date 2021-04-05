package org.lessons.singleton;

/**
 * Project: DesignPatternsLessons
 * Description: This implementation will help you to start up your apps
 *      faster
 *
 * @author axteel on 04.04.2021 : 02:05
 * @version 1.0
 */
public class DatabaseSingletonLazy {
    private static DatabaseSingletonLazy instance = null;

    private DatabaseSingletonLazy() { }

    public static DatabaseSingletonLazy getInstance() {
        if (instance == null)
            instance = new DatabaseSingletonLazy();

        return instance;
    }
}
