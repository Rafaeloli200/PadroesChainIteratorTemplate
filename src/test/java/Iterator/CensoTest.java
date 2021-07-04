package Iterator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CensoTest {

    @Test
    void deveContarPilotosAtivosEquipe() {
        Equipe equipe = new Equipe(
                new Piloto("Carlos", "Ativo"),
                new Piloto("Joao", "Desligado"),
                new Piloto("Ana", "Inativo"),
                new Piloto("Pedro", "Ativo")
        );
        assertEquals(2, Censo.contarPilotosAtivosEquipe(equipe));
    }

    @Test
    void deveContarPilotosInativosEquipe() {
        Equipe equipe = new Equipe(
                new Piloto("Carlos", "Ativo"),
                new Piloto("Joao", "Desligado"),
                new Piloto("Ana", "Inativo"),
                new Piloto("Pedro", "Ativo")
        );
        assertEquals(1, Censo.contarPilotosAtivosEquipe(equipe));
    }

    @Test
    void deveContarTotalPilotosEquipe() {
        Equipe equipe = new Equipe(
                new Piloto("Carlos", "Ativo"),
                new Piloto("Joao", "Desligado"),
                new Piloto("Ana", "Inativo"),
                new Piloto("Pedro", "Ativo")
        );
        assertEquals(4, Censo.contarTotalPilotosEquipe(equipe));
    }

}
