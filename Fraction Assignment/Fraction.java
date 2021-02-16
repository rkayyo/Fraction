
public class Fraction{
       public int numer, denom;
         
    
    //Constructors
    public Fraction(){
      this.numer = 1;
      this.denom = 1;
        
    }
    
    public Fraction(int numer, int denom){
        if (denom == 0){
         System.out.println("Error Denominator Cannot Equal 0");
         this.denom = 1;
        }else{
         this.denom = denom;   
        }
    }
    
    public Fraction(String str){
        int slashIndex = str.indexOf("/");
        String numerator = str.substring(0,slashIndex);
        String denominator = str.substring(slashIndex+1);
        this.numer = Integer.parseInt(numerator);
        this.denom = Integer.parseInt(denominator);
    }

    public Fraction(Fraction f){
        this.numer = f.numer;
        this.denom = f.denom;
    }
    

    //Accessor Methods
    public int getNumer(Fraction f){
        return this.numer;
    }
    
    public int getDenom(Fraction f){
        return this.denom;   
    }
    
    public double toDouble(){
        return (double) numer/denom;
    }
    
    
    public String toString(){
        return this.numer + "/" + this.denom;
    }
    
    
    //Mutator Methods
    public void setNumer(int n){
        this.numer = n;
    }
    
    public void setDenom(int d){
        if(d != 0) this.denom = d;
        else System.out.println("Error! Denominator Cannot be Zero");
    }
    
    public void reduce(){
     int gcf = GCF(this.numer, this.denom);
     this.numer = this.numer / gcf;
     this.denom = this.denom /  gcf;
    }
    
    //Static methods
    public static Fraction multiply(Fraction a, Fraction b){
        int newNum = a.numer * b.numer;
        int newDen = a.denom * b.denom;
        Fraction f = new Fraction(newNum, newDen);
        f.reduce();
        return f;
    }
    
     public static Fraction add (Fraction a, Fraction b) {
        

        int newNum = a.numer * b.denom + b.numer * a.denom;
        int newDen = a.denom * b.denom;
        Fraction ans = new Fraction(newNum, newDen);
        ans.reduce();

        return ans;
    }

    public static Fraction subtract (Fraction a, Fraction b) {      
        

        int newNum = a.numer * b.denom - b.numer * a.denom;
        int newDen = a.denom * b.denom;
        Fraction ans = new Fraction(newNum, newDen);
        ans.reduce();

        return ans;
    }
    
    public static Fraction divide(Fraction a, Fraction b){
        int newNum = a.numer * b.denom;
        int newDen = a.denom * b.numer;
        Fraction f = new Fraction(newNum, newDen);
        f.reduce();
        return f;
    }
    
    //Helper Method
    private int GCF(int a , int b){
       int larger = a;
       int smaller = b;
       while(larger != smaller){
         larger = Math.max(larger,smaller);
         smaller = Math.min(larger,smaller);
         
         larger = larger - smaller;
        }
       return larger;
    }
    
}
