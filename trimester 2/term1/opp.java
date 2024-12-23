public class opp {
    public static void main(String[] args) {
        Student s1 = new Student(); 
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "John";
        s1.marks = 90;
        s1.email = "8m7L3@example.com";
        s1.phone = "1234567890";
        s1.cgr = 9.9;

        s2.name = "Jane";
        s2.marks = 80;  
        s2.email = "jane@123";
        s2.phone = "9876543210";
        s2.cgr = 9.8;

        s3 = s2;

        System.out.println(s1.name + " " + s1.marks + " " + s1.email + " " + s1.phone + " " + s1.cgr);
        System.out.println(s2.name + " " + s2.marks + " " + s2.email + " " + s2.phone + " " + s2.cgr);
        System.out.println(s3.name + " " + s3.marks + " " + s3.email + " " + s3.phone + " " + s3.cgr);
    }
}

class Student {
    String name;
    int marks;
    String email;
    String phone;
    double cgr;
}
