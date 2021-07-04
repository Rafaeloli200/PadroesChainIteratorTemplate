
package Iterator;

import java.util.Iterator;

public class Censo {

    public static Integer contarPilotosAtivosEquipe(Equipe equipe) {
        int quantidade = 0;
        for (Piloto piloto : equipe) {
            if ("ativo".equals(piloto.getEstado())) {
                quantidade++;
            }
        }
        return quantidade;
    }
  
    public static Integer contarPilotosInativosEquipe(Equipe equipe) {
        int quantidade = 0;
        for (Piloto piloto : equipe) {
            if ("inativo".equals(piloto.getEstado())) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalPilotosEquipe(Equipe equipe) {
        int quantidade = 0;
        for (Iterator a = equipe.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}