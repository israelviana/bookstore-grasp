package controllers;
import interfaces.ProductInterface;

public class StockController {
    public void addProductToStock(ProductInterface product, int quantity) {
        // Lógica para adicionar livro ao estoque
    }

    public void removeProductFromStock(ProductInterface product, int quantity) {
        // Lógica para remover livro do estoque
    }

    public int checkAvailability(ProductInterface product) {
        // Lógica para verificar a disponibilidade de um livro
        return 0; // Retornar a quantidade disponível
    }
}
