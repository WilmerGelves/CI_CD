import com.pruebas.CalculadoraSimple;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraSimpleTest {

    @Test
    void testSuma() {
        assertEquals("8.0", CalculadoraSimple.calcular(5, 3, '+'));
    }

    @Test
    void testResta() {
        assertEquals("6.0", CalculadoraSimple.calcular(10, 4, '-'));
    }

    @Test
    void testMultiplicacion() {
        assertEquals("12.0", CalculadoraSimple.calcular(3, 4, '*'));
    }

    @Test
    void testDivision() {
        assertEquals("4.0", CalculadoraSimple.calcular(8, 2, '/'));
    }

    @Test
    void testDivisionPorCero() {
        assertEquals("Error: División/0", CalculadoraSimple.calcular(5, 0, '/'));
    }

    @Test
    void testOperadorInvalido() {
        assertEquals("Error: Operador inválido", CalculadoraSimple.calcular(5, 3, '%'));
    }
}