package Array;

public class MajorityElement {
    public static int majority(int[] arr){
        int res = 0 ;
        int count =1;
        for(int i=1; i<arr.length; i++){
            if(arr[res]==arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[res]==arr[i]) count++;

        }
        if(count<=arr.length/2) res=-1;

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,5,5,5,6,5,};
        System.out.println(majority(arr));
    }
}
