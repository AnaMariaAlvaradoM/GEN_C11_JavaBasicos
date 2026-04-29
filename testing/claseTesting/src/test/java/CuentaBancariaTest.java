import org.example.CuentaBancaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CuentaBancariaTest {

    @Test
    void saldoAumentaAlDepositar(){
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        cuenta.depositar(500);
        assertEquals(1500, cuenta.getSaldo());
    }
}
