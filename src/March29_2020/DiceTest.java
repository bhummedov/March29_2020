package March29_2020;

public class DiceTest {
    public static void main(String[] args) {
        CasinoDice myCasino = new CasinoDice();
        System.out.println(myCasino.rollDice());
        DarkCasinoDice myDark = new DarkCasinoDice();
        System.out.println(myDark.rollDice());
    }

}
