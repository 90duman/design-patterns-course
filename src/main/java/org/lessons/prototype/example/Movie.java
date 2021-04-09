package org.lessons.prototype.example;

/**
 * [Do not forget to leave useful description]
 * <p>
 *
 * @author axteel on 09.04.2021 : 18:18
 * @version 1.0
 */
public class Movie extends Item {
    private String runtime;

    public Movie(String title, String price, String url, String runtime) {
        super(title, price, url);
        this.runtime = runtime;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
}
