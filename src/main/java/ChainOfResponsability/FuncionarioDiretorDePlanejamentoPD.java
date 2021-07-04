
package ChainOfResponsability;


public class FuncionarioDiretorDePlanejamentoPD extends Funcionario {
    
    public FuncionarioDiretorDePlanejamentoPD(Funcionario superior) {
        listaRequisicoes.add(PousoAPlanejar.getPousoAPlanejar());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Diretor de Planejamento de Pousos e Decolagens";
    }
}
