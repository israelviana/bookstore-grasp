package creators;
import dtos.BookDTO;
import interfaces.ProductCreator;
import interfaces.ProductInterface;

public class BookCreator implements ProductCreator {

    @Override
    public ProductInterface createProduct() {
        return new BookDTO();
    }
}

