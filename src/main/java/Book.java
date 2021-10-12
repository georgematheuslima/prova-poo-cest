public class Book {
    private String Author;
    private String Edition;
    private String Volume;

    public Book(String author, String edition, String volume) {
        Author = author;
        Edition = edition;
        Volume = volume;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getEdition() {
        return Edition;
    }

    public void setEdition(String edition) {
        Edition = edition;
    }

    public String getVolume() {
        return Volume;
    }

    public void setVolume(String volume) {
        Volume = volume;
    }
}
