/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tests_ejercicio_01;

import ejercicio_01.MathUtils;
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
public class MathUtilsTest {
    
    public MathUtilsTest() {
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
    void gcdOf18And24_returns6() {
        MathUtils math = new MathUtils();
        int result = math.gcd(18, 24);
        assertEquals(6, result);
    }
    
      @Test
    void gcdWithNegativeNumber_throwsException() {
        MathUtils math = new MathUtils();

        assertThrows(IllegalArgumentException.class, () -> {
            math.gcd(-5, 10);
        });
    }
    
        @Test
    void primeNumber97_returnsTrue() {
        MathUtils math = new MathUtils();
        assertTrue(math.isPrime(97));
    }
    
     @Test
    void nonPrimeNumber100_returnsFalse() {
        MathUtils math = new MathUtils();
        assertFalse(math.isPrime(100));
    }
}
