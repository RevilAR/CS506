
public class Student{
    private int rollNo;
    private String name;

    //class methods 

    // Setter 
    public void setName(String name)
    {
        this.name = name;

    }
    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;


    }

    //Getter 

    public String getName()
    {
        return name;

    }
    public int getRollNo()
    {
        return rollNo;

    }
      // Default Constructor
    public Student()
    {
        name = "not set" ;
        rollNo = 100;

    }
    //parameteriza constructor
    public Student(String name , int rollNo)
    {
        setRollNo(rollNo);
        setName(name);

    }
    // copy constructor

    public Student(Student s)
    {
        name = s.name;
        rollNo = s.rollNo;

    }
    public void print()
    {
        System.out.println("Student name :"+name +",Student roll number:"+rollNo);
    }

}
