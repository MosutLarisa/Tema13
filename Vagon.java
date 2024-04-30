
public abstract class Vagon {
	
    private int capacitatePasageri;
    private int capacitateColete;

    public Vagon(int capacitatePasageri, int capacitateColete) {
        this.capacitatePasageri = capacitatePasageri;
        this.capacitateColete = capacitateColete;
    }

    public int getCapacitatePasageri() {
        return capacitatePasageri;
    }

    public int getCapacitateColete() {
        return capacitateColete;
    }

    public void deschideUsi() {
        System.out.println("Usile s-au deschis.");
    }

    public void inchideUsi() {
        System.out.println("Usile s-au inchis.");
    }

    public void blocheazaGeamuri() {
        System.out.println("Geamurile s-au blocat.");
    }
}
