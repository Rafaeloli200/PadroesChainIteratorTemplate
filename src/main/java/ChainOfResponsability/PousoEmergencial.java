
package ChainOfResponsability;


public class PousoEmergencial implements TipoDeRequisicaoDePouso {
   
    private static PousoEmergencial pousoEmergencial = new PousoEmergencial();

    private PousoEmergencial() {};
    
    public static PousoEmergencial getPousoEmergencial() {
        return pousoEmergencial;
    }
    
}
