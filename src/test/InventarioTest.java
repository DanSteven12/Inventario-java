import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioTest {
    @Test
    void testCalcularSubTotal() {
        int resultado = Inventario.calcularSubtotal(50, 4);
        // Provocamos un fallo intencional para probar que GitHub Actions detecta el error
        assertEquals(999, resultado, "Error provocado: el resultado esperado no coincide");
    }
}
