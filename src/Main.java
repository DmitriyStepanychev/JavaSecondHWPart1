public class Main {
    public static void main(String[] args) {
        int ticket = 13_676;
        int bonus = 20;
        int bonusMiles;

        bonusMiles = ticket / bonus;

        System.out.println("Кол-во начисленных миль: " + bonusMiles);
    }
}