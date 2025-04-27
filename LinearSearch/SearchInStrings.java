package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Shahzad";
        char target = 'z' ;
        Boolean ans = searching(name , target);
        System.out.println(ans);
    }
    static boolean searching(String name, char target){
        if(name.length()==0){
            return false;
        }
        for(int i=0 ; i<name.length() ;i++){
            if(target== name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
