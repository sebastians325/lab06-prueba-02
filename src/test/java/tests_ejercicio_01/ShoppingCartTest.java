/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tests_ejercicio_01;

import ejercicio_01.ShoppingCart;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jacks
 */
public class ShoppingCartTest {
    
    public ShoppingCartTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
        @Test
    void addingTwoProducts_returnsCorrectTotalAndCount() {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(19.99);
        cart.addProduct(5.00);

        assertEquals(2, cart.getProductCount());
        assertEquals(24.99, cart.getTotal(), 0.001);
    }
    
        @Test
    void addingNegativePrice_throwsException() {
        ShoppingCart cart = new ShoppingCart();

        assertThrows(IllegalArgumentException.class, () -> {
            cart.addProduct(-10.0);
        });
    }

}
