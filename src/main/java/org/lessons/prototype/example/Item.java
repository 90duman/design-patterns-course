package org.lessons.prototype.example;


/**
 * [Do not forget to leave useful description]
 * <p>
 *
 * @author axteel on 09.04.2021 : 18:12
 * @version 1.0
 */
public abstract class Item implements Cloneable{
    private String title;
    private String price;
    private String url;

    public Item(Item item) {
        this.title = item.getTitle();
        this.price = item.getPrice();
        this.url = item.getUrl();
    }

    public Item(String title, String price, String url) {
        this.title = title;
        this.price = price;
        this.url = url;
    }

    @Override
    public Item clone() {
        try {
            return (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
