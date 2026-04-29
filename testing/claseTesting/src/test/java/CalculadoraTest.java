import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    void sumarDosNumeros(){
        assertEquals(4, Calculadora.sumar(2,2));
    }

    @Test
    void restarDosNumeros(){
        assertEquals(0, Calculadora.restar(2,2));
    }

    @Test
    void positivoONegativo(){
        int resultado = Calculadora.sumar(3,5);
        assertTrue(resultado > 0);
    }




}
