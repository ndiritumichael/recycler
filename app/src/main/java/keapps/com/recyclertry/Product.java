package keapps.com.recyclertry;

public class Product {
    private int id;
    private String shortdesc,title;
    private double rating;
    private double price;
    private int image;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(int i1, String s1, String s, double v, int i, double price) {

        this.price = price;
    }

    public Product(int id, String shortdesc, String title, double rating, int image) {
        this.id = id;
        this.shortdesc = shortdesc;
        this.title = title;
        this.rating = rating;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public void setShortdesc(String shortdesc) {
        this.shortdesc = shortdesc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
