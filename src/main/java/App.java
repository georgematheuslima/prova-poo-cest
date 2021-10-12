import com.sun.jdi.PathSearchingVirtualMachine;

public class App {
    public static void main(String[] args) {
        Item item = new Item("teste item", "prova", "2021", "n entendi essa parte", "200");

        Book book = new Book("testando", "final", "2º");


        System.out.println(item.getTitle());
        System.out.println(item.getPublisher());
        System.out.println(item.getYearPublished());
        System.out.println(item.getIsbn());
        System.out.println(item.getPrice());
        System.out.println(book.getAuthor());
        System.out.println(book.getEdition());
        System.out.println(book.getVolume());
    }
}