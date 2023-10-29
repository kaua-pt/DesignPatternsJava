import java.util.ArrayList;
import java.util.List;

public class BookShop implements MyClonable {
    private String shopName;
    private List<Book> books = new ArrayList<Book>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop [shopName=" + shopName + ", books=" + books + "]";
    }

    @Override
    public MyClonable cloneObj() {
        return new BookShop();
    }

}
