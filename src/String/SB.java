package String;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());
        //It is mutable
        //This method keeps updating the object and do not create a new object everytime

        builder.deleteCharAt(0);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
    }
}
