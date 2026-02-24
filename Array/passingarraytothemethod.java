public class passingarraytothemethod {
    public static void main(String[] args) {
        int [] x = {45,8,62,34,71,99};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void  change(int[] y) {
        y[2] = 26;
    }
}
