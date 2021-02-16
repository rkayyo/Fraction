public class FractionDriver{

    public static void Main (String[] args){
        Fraction myFraction = new Fraction();
        Fraction coolFraction = new Fraction("10/24");
        coolFraction.reduce();
        System.out.println(coolFraction.toString()); 
    }



}
