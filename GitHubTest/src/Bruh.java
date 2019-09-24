public class Bruh {

    private int bruhPoints;

    public Bruh(int bruh){
         bruhPoints = bruh;
    }

    public static void main(String[] args) {
        Bruh bruh = new Bruh(5);
        System.out.println(bruh);
    }

    @Override public String toString() {
        return "lmao bruh i have: " + bruhPoints + " bruh points";
    }
}
