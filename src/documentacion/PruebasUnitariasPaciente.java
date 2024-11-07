package documentacion;

import controlPaciente.ControlPaciente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruebasUnitariasPaciente {

    @Test
    void testCrearPaciente() {
        ControlPaciente control = new ControlPaciente();
        control.crearPaciente("Juan", "Perez", "12345678");
        // Lógica de prueba para verificar el registro en la base de datos
        // ...
    }
}
