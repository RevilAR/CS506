


public class ClassInJava {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.print();
        Student S2 = new Student("Ali Ramzan",3);
        System.out.println("Student Name : "+S2.getName() +" ,Roll Number:"+S2.getRollNo());

        Student S3 = new Student(S1);
        System.out.println("calling copy constructor.... ");
        S3.print();



        



        
    }
    
}
