package org.lessons.prototype.demo;

/**
 * [Do not forget to leave useful description]
 * <p>
 *
 * @author axteel on 09.04.2021 : 17:58
 * @version 1.0
 */
public interface Cloneable<T> extends java.lang.Cloneable {
    T clone(CloneType type);
}
