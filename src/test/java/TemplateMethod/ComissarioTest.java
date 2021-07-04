package TemplateMethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComissarioTest {

    void deveRetonarComissario() {
        Comissario tripulante = new Comissario();
        tripulante.setNome("Paulo");
        assertEquals("Comissario", tripulante.verificaFuncao());
    }
}
