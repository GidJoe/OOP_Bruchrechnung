public class Main {
    public static void main(String[] args) {


        Bruch bruch1 = new Bruch(5,10);
        Bruch bruch2 = new Bruch(10,5);

        System.out.println(bruch1.multiplizieren(bruch2).toString());

        bruch1.add(bruch2);





    }
}