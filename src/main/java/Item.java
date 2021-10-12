public class Item {

    private String Title;
    private String Publisher;
    private String YearPublished;
    private String Isbn;
    private String Price;

    public Item(String title, String publisher, String yearPublished, String isbn, String price) {
        Title = title;
        Publisher = publisher;
        YearPublished = yearPublished;
        Isbn = isbn;
        Price = price;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public String getYearPublished() {
        return YearPublished;
    }

    public void setYearPublished(String yearPublished) {
        YearPublished = yearPublished;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

}
