package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums= {23,45,76,111,3435,66,78890,643532,867};
        System.out.println(FindNum(nums));

    }
    static int FindNum(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

     static boolean even(int num){
        int numberofDigits = digits(num);
        if (numberofDigits%2==0){
            return true;
        }
        return false;
    }
    static  int digits(int num){
        if(num<1){
             num = num*-1;
        }

        if (num==0){
            return 1;
        }
        int count= 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
    // Simpler way to find the number of digit
    static  int digits2(int num){
        return (int)(Math.log10(num))+1;
    }
}
