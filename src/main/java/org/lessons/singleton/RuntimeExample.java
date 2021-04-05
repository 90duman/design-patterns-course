package org.lessons.singleton;

/**
 * Project: DesignPatternsLessons
 * Description: ...
 *
 * @author axteel on 04.04.2021 : 01:42
 * @version 1.0
 */
public class RuntimeExample {

    public static void main(String[] args) {
        Runtime sRuntime = Runtime.getRuntime();
        sRuntime.gc();

        System.out.println(sRuntime);

        Runtime anotherRuntime = Runtime.getRuntime();

        System.out.println(anotherRuntime);

        if(sRuntime == anotherRuntime) {
            System.out.println("The same instance");
        }
    }
}
