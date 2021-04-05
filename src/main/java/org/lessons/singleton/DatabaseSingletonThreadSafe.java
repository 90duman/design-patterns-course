package org.lessons.singleton;

/**
 * Project: DesignPatternsLessons
 * Description: Lazily loaded and thread safe singleton
 *
 * @author axteel on 04.04.2021 : 02:09
 * @version 1.0
 */
public class DatabaseSingletonThreadSafe {
    private static volatile DatabaseSingletonThreadSafe instance = null;

    private DatabaseSingletonThreadSafe() {
        if (instance != null)
            throw new RuntimeException("Instance already exists :" + instance);
    }

    public DatabaseSingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (DatabaseSingletonThreadSafe.class) {
                if (instance == null)
                    instance = new DatabaseSingletonThreadSafe();
            }
        }
        return instance;
    }
}
