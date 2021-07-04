
package ChainOfResponsability;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


 class RequisicaoDePousoTest {
     
    FuncionarioAgenteAeroportuario agenteAeroportuario;
    FuncionarioGerenteDeTrafego gerenteDeTrafego;
    FuncionarioDiretorDePlanejamentoPD diretorDePlanejamentoPD;

    @BeforeEach
    void setUp() {
        diretorDePlanejamentoPD = new FuncionarioDiretorDePlanejamentoPD(null);
        gerenteDeTrafego = new FuncionarioGerenteDeTrafego(diretorDePlanejamentoPD);
        agenteAeroportuario = new FuncionarioAgenteAeroportuario(gerenteDeTrafego);
    }

    @Test
    void deveRetornarAgenteParaPousoPlanejado() {
        assertEquals("Agente Aeroportuario", agenteAeroportuario.responderRequisicao(new RequisicaoDePouso(PousoPlanejado.getPousoPlanejado())));
    }

     @Test
    void deveRetornarGerenteParaPousoEmergencial() {
        assertEquals("Gerente de Trafego", agenteAeroportuario.responderRequisicao(new RequisicaoDePouso(PousoEmergencial.getPousoEmergencial())));
    }

     @Test
    void deveRetornarDiretorParaPousoAPlanejar() {
        assertEquals("Diretor de Planejamento de Pousos e Decolagens", agenteAeroportuario.responderRequisicao(new RequisicaoDePouso(PousoAPlanejar.getPousoAPlanejar())));
    }

}
