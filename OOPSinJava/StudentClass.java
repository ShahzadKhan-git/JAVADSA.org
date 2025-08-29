package OOPSinJava;

public class StudentClass {



    public static void main(String[] args) {
        student x = new student();
        x.name="Shahzad";
        x.rollno=59;
        x.percent=96.98;
        System.out.println(x.name);
        System.out.println(x.rollno + 11);
        System.out.println(x.percent);

        student y = new student();
        y.name = "Khan";
        y.rollno = 43;
        y.percent = 67.12;
        System.out.println(y.name);
        System.out.println(y.rollno);
        System.out.println(y.percent);

        student z = new student("Baadshah",54,89.3);
        //All the attributes can be done at once using constructor - 1 hi line mein saara kuchh declare karna h toh iska usse kro
        System.out.println(z.name);
        System.out.println(z.rollno);
        System.out.println(z.percent);

    }
}
