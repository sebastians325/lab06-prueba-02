package ejercicio_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    // ✔️ Happy path: agregar producto y verificar total y cantidad
    @Test
    void testAddProductAndTotal() {
        cart.addProduct(10.0);
        cart.addProduct(15.5);

        assertEquals(2, cart.getProductCount(), "Debe haber 2 productos");
        assertEquals(25.5, cart.getTotal(), 0.001, "El total debe ser 25.5");
    }

    // ✔️ Happy path: eliminar producto
    @Test
    void testRemoveProduct() {
        cart.addProduct(20.0);
        cart.addProduct(30.0);

        cart.removeProduct(20.0);

        assertEquals(1, cart.getProductCount(), "Debe haber 1 producto");
        assertEquals(30.0, cart.getTotal(), 0.001, "El total debe ser 30.0");
    }

    // ❌ Unhappy path: precio negativo
    @Test
    void testAddNegativePriceThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cart.addProduct(-5.0);
        });

        assertEquals("Price must be positive", exception.getMessage());
    }

    // ❌ Unhappy path: remover producto que no existe (no lanza excepción, pero no debe afectar)
    @Test
    void testRemoveNonExistingProduct() {
        cart.addProduct(10.0);
        cart.removeProduct(50.0);  // no existe

        assertEquals(1, cart.getProductCount(), "No debe eliminar ningún producto");
        assertEquals(10.0, cart.getTotal(), 0.001);
    }

    // ✔️ Happy path: carrito vacío
    @Test
    void testEmptyCart() {
        assertEquals(0, cart.getProductCount(), "Carrito debe estar vacío");
        assertEquals(0.0, cart.getTotal(), 0.001, "Total debe ser 0.0");
    }
}