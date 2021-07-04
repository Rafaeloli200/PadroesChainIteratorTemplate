
package ChainOfResponsability;


public class FuncionarioGerenteDeTrafego extends Funcionario {
    
    public FuncionarioGerenteDeTrafego(Funcionario superior) {
        listaRequisicoes.add(PousoEmergencial.getPousoEmergencial());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Gerente de Trafego";
    }
}
