
package ChainOfResponsability;


public class PousoPlanejado implements TipoDeRequisicaoDePouso {
   
    private static PousoPlanejado pousoPlanejado = new PousoPlanejado();

    private PousoPlanejado() {};
    
    public static PousoPlanejado getPousoPlanejado() {
        return pousoPlanejado;
    }
    
}
