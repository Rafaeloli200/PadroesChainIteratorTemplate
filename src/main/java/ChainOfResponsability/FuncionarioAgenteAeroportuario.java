
package ChainOfResponsability;


public class FuncionarioAgenteAeroportuario extends Funcionario {
    
    public FuncionarioAgenteAeroportuario(Funcionario superior) {
        listaRequisicoes.add(PousoPlanejado.getPousoPlanejado());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Agente Aeroportuario";
    }
}
