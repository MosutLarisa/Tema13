public class Main {

    public static void main(String[] args) {
        Tren t1 = new Tren();
        Tren t2 = new Tren();
        Tren t3 = new Tren();

        Vagon v1 = new CalatoriA();
        Vagon v2 = new CalatoriB();
        Vagon v3 = new Marfa();
        Vagon v4 = new Marfa();

        t1.addVagon(v1);
        t1.addVagon(v2);

        t2.addVagon(v3);

        t3.addVagon(v4);
        t3.addVagon(v2);

        System.out.println(t1.nrColete());

        System.out.println(t1.equals(t2));
        
        t2.tipuriDeVagoane();
        t3.tipuriDeVagoane();
    }
}
