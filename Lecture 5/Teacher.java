public class Teacher extends Employee {

    private String qualfication;

    //Constructor
    public Teacher()
    {
        qualfication = "";

    }

    //paramitorzi constructor

    public Teacher(int i,String n,String q)
    {
        super(i,n);
        qualfication = q;

    }

    //Setter 
    public void setQual(int q)
    {
        this.qualfication = q;

    }
    //Getter

    public String getQual()
    {
        return qualfication;

    }

    //Display method for Teacher class overriding 

    public void display()
    {
        System.out.println("in Teacher class display method");
        super.display();
        System.out.println("Teacher qualification :"+qualfication);
    }

    //overriding toString method 

    public String toString()
    {
        String emp = super.toString();
        return emp+"qualification:"+qualfication;

    }
    // class end
    
}
