package ChainOfResponsability;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaRequisicoes = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }    
    
    public abstract String getDescricaoCargo();
    
     public String responderRequisicao(RequisicaoDePouso requsicaoDePouso) {
        if (listaRequisicoes.contains(requsicaoDePouso.getTipoDeRequisicaoDePouso())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.responderRequisicao(requsicaoDePouso);
            }
            else 
            {
                return "Sem resposta";
            }
        }        
    }
}
