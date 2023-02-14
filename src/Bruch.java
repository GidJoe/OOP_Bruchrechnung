public class Bruch {

    private int zaehler, nenner;

    public Bruch (int numOne, int numTwo) {
        zaehler = numOne;
        nenner = numTwo;
    }

    public Bruch add(Bruch bruch) {
        this.zaehler = (this.zaehler * bruch.nenner)+(this.nenner * bruch.zaehler);
        this.nenner = this.nenner * bruch.nenner;

        this.zaehler =
        return this;

    }

    public String toString() {
        return zaehler + " / " + nenner;
    }


    public Bruch mul(Bruch anderer) {
        return new Bruch(zaehler * anderer.zaehler, nenner * anderer.nenner);
    }
}
