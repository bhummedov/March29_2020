package March29_2020;

public class Dice_Class implements Interfaces_Dices {
    protected int numberOfFaces;
    protected int biasFactor;

    public Dice_Class(int numberOfFaces, int biasFactor) {
        this.numberOfFaces = numberOfFaces;
        this.biasFactor = biasFactor;
    }

    public int getBiasFactor() {
        return biasFactor;
    }

    public void setBiasFactor(int biasFactor) {
        this.biasFactor = biasFactor;
    }

    public void roll(){
        System.out.println(((int)(Math.random()*faces+1)));

    }
    public void rollTwice(){
        System.out.println(((int)(Math.random()*faces+1)));
        System.out.println(((int)(Math.random()*faces+1)));
    }
    public void rollTriple (){
        System.out.println(((int)(Math.random()*faces+1)));
        System.out.println(((int)(Math.random()*faces+1)));
        System.out.println(((int)(Math.random()*faces+1)));
    }
    public void biasedRoll(){
        if (this.biasFactor>faces){
            System.out.println("Bias too large");
        }
        else if (this.biasFactor== faces) {
            System.out.println(faces);
        }
        else if (this.biasFactor<faces){
            System.out.println((int)(Math.random()*(faces-this.biasFactor)+this.biasFactor));
        }
    }
}
