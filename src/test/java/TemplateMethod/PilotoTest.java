package TemplateMethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PilotoTest {

    void deveRetonarPiloto() {
        Piloto tripulante = new Piloto();
        tripulante.setNome("Iara");
        assertEquals("Piloto", tripulante.verificaFuncao());
    }
}
