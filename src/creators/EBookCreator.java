package creators;
import dtos.EBookDTO;
import interfaces.ProductCreator;
import interfaces.ProductInterface;

public class EBookCreator implements ProductCreator {

    @Override
    public ProductInterface createProduct() {
        return new EBookDTO();
    }
}
