package OOPSinJava;

public class Fraction {

    public static int gcd(int num, int den) {
        num = Math.abs(num);
        den = Math.abs(den);
        int min = Math.min(num, den);
        for (int i = min; i >= 1; i--) {
            if (num % i == 0 && den % i == 0) {
                return i;
            }
        }
        return 1;
    }
    public static class fraction{
        int num;
        int den;

        public fraction(int num, int den){
            this.num = num;
            this.den = den;
        }

        public void simplify(){
            int hcf = gcd(num,den);
            num /= hcf;
            den /= hcf;
        }

    }

    public static void main(String[] args) {
      fraction f1 = new fraction(35,21);
      System.out.println(f1.num + "/" + f1.den);
      f1.simplify();
      System.out.println(f1.num + "/" + f1.den);



    }
}
