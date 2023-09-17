import controllers.StockController;
import creators.BookCreator;
import interfaces.ProductCreator;
import interfaces.ProductInterface;

public class Main {
    public static void main(String[] args) {
        ProductCreator bookCreator = new BookCreator();

        ProductInterface book = bookCreator.createProduct();
        book.showProduct();

        StockController controller = new StockController();

        controller.addProductToStock(book, 1);
    }
}