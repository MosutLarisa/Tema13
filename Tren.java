import java.util.ArrayList;
import java.util.List;

public class Tren {
	
    private List<Vagon> listaVagoane;

    public Tren() {
        this.listaVagoane = new ArrayList<>();
    }

    public Tren(List<Vagon> listaVagoane) {
        this.listaVagoane = listaVagoane;
    }

    public boolean addVagon(Vagon v) {
        if (listaVagoane.size() < 15) {
            listaVagoane.add(v);
            return true;
        } 
        else {
            System.out.println("Numarul maxim de vagoane a fost atins.");
            return false;
        }
    }

    public int nrColete() {
        int suma = 0;
        for (Vagon vagon : listaVagoane) {
            suma += vagon.getCapacitateColete();
        }
        return suma;
    }

	 public boolean equals(Tren t) {
		 if (this.nrColete() == t.nrColete()) {
			 System.out.println("Trenurile sunt egale");
			 return true;
			 }
		 return false;
	 }

    public void tipuriDeVagoane() {
        for (Vagon vagon : listaVagoane) {
            System.out.println(vagon.getClass().getName());
        }
    }
}
