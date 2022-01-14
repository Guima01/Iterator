import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleTest {

    @Test
    void deveContarPacientesEmLeitos() {
        Hospital hospital = new Hospital(
                new Paciente("Ana", true),
                new Paciente("João", true),
                new Paciente("Carmem", false),
                new Paciente("Judit", true)
        );
        assertEquals(3, Controle.PacientesComLeito(hospital));
    }

    @Test
    void deveContarTotalPacientes() {
        Hospital hospital = new Hospital(
                new Paciente("Ana", true),
                new Paciente("João", true),
                new Paciente("Carmem", false),
                new Paciente("Judit", true)
        );
        assertEquals(4, Controle.TotalDePacientes(hospital));
    }

}