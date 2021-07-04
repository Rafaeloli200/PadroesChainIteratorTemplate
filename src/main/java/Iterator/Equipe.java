
package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Equipe implements Iterable<Piloto>{

    private List<Piloto> pilotos = new ArrayList<Piloto>();

    public Equipe(Piloto... pilotos) {
        this.pilotos = Arrays.asList(pilotos);
    }

    @Override
    public Iterator<Piloto> iterator() {
        return pilotos.iterator();
    }

}

