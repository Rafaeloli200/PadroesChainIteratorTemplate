
package ChainOfResponsability;


public class PousoAPlanejar implements TipoDeRequisicaoDePouso {
   
    private static PousoAPlanejar pousoAPlanejar = new PousoAPlanejar();

    private PousoAPlanejar() {};
    
    public static PousoAPlanejar getPousoAPlanejar() {
        return pousoAPlanejar;
    }
    
}

