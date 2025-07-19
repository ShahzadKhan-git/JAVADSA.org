package String;

public class performance {
    public static void main(String[] args) {

        String Series = "";
        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);
            Series = Series + ch;
        }

        System.out.println(Series);

        //The Drawback of this method is that it creates new object many times when the loop runs
    }
}
