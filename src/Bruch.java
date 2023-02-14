public class Bruch {
    private int zaehler, nenner;

    public Bruch(int numOne, int numTwo) {
        zaehler = numOne;
        nenner = numTwo;
    }

    public String toString() {
        return zaehler + " / " + nenner;
    }
    // Konstruktor?

    // Methode zum Addieren
    public Bruch add(Bruch bruch) {
        this.zaehler = (this.zaehler * bruch.nenner) + (this.nenner * bruch.zaehler);
        this.nenner = this.nenner * bruch.nenner;
        int teiler = ggt(this.zaehler, this.nenner);
        this.zaehler = this.zaehler/teiler;
        this.nenner = this.nenner/teiler;

        return this;

    }

    // Methode zum Subtrahieren
    public Bruch subtrahieren(Bruch bruch) {
        this.zaehler = (this.zaehler * bruch.nenner) - (this.nenner * bruch.zaehler);
        this.nenner = this.nenner * bruch.nenner;
        int teiler = ggt(this.zaehler, this.nenner);
        this.zaehler = this.zaehler/teiler;
        this.nenner = this.nenner/teiler;


        return this;

    }

    // Methode zum Multiplizieren
    public Bruch multiplizieren(Bruch bruch) {
        this.zaehler *= bruch.zaehler;
        this.nenner *= bruch.nenner;

        int teiler = ggt(this.zaehler, this.nenner);
        this.zaehler = this.zaehler/teiler;
        this.nenner = this.nenner/teiler;

        return this;
    }


    // Methode zum Dividieren
    public Bruch dividieren(Bruch bruch) {
        this.zaehler *= bruch.nenner;
        this.nenner *= bruch.zaehler;
        int teiler = ggt(this.zaehler, this.nenner);
        this.zaehler = this.zaehler/teiler;
        this.nenner = this.nenner/teiler;

        return this;

    }


    public int ggt(int a, int b) {

        if (a == 0)
            return b;
        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }

}




