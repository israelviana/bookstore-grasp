package creators;
import dtos.AudioBookDTO;
import interfaces.ProductCreator;
import interfaces.ProductInterface;

public class AudioBookCreator implements ProductCreator {
    @Override
    public ProductInterface createProduct() {
        return new AudioBookDTO();
    }
}
