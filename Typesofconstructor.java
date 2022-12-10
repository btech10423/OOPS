public class Typesofconstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Vaibhav");
        Student s3 = new Student(123);
       
    }
}
class Student {
    String name;
    int roll;
   //nonparamaterized
    Student() {
        System.out.println("constructor is called...");
    }
    //paramaterized
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}