public class opp2{
    public static void main(String[] args) {
        Student s1 = new Student("John Doe", "john.doe@example.com", "123", "A", "B", "A+");
        System.out.println("CGR of " + s1.name + " is: " + s1.getCGR());
    }
}

class Student{
    String name;
    String email;
    String rollNo;
    String ICP;
    String webDev;
    String DM;

    public Student(String name, String email, String rollNo, String ICP, String webDev, String DM) {
        this.name = name;
        this.email = email;
        this.rollNo = rollNo;
        this.ICP = ICP;
        this.webDev = webDev;
        this.DM = DM;
    }

    public int getRating(String grade){
        if(grade.equals("A+")){
            return 10;
        }
        else if(grade.equals("A")){
            return 9;
        }
        else if(grade.equals("B")){
            return 8;
        }   
        else if(grade.equals("C")){
            return 7;
        }
        else{
            return 0;
        }
    }

    public double getCGR(){
        return (getRating(ICP)*4 + getRating(webDev)*3 + getRating(DM)*3) / 10.0;
    }
}


