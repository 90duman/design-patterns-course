package org.lessons.builder;

/**
 * [Do not forget to leave useful description]
 * <p>
 *
 * @author axteel on 05.04.2021 : 16:56
 * @version 1.0
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("This is an example");
        builder.append(" of StringBuilder.class ");
        builder.append(4);
        builder.append(" Design Patterns Course :)");

        System.out.println(builder);
    }
}
