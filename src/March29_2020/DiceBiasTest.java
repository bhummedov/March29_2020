package March29_2020;

public class DiceBiasTest {
    public static void main(String[] args) {
        Dice_Class myBias = new Dice_Class(8, 6);
        myBias.roll();
        myBias.rollTwice();
        myBias.rollTriple();
        myBias.biasedRoll();
        myBias.setBiasFactor(5);
    }
}
