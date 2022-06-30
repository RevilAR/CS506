public class Employee {
    protected int id ;
    protected String name;

    //Constructor 

    public Employee(int id,String name   )
    {
        this.id = id;
        this.name = name;

    }
    //Default Constructor 

    public Employee()
    {
        this(0,"Not set");
    }
    //setters

    public void setName(String name)
    {
        this.name = name ;

    }
    
    public void setId(int id)
    {
        this.id = id;

    }
    //Getters
    public String getName()
    {
        return name;

    }
    public int getId()
    {
        return id;

    }
     //Display Method
    public void display()
    {
        System.out.println("                         Display Employee Data ");
        System.out.println("Employee ID :" +id);
        System.out.println("\nEmployee Name :"+name);

    }
    //overriding function
    public String toString()
    {
        return "id"+id+", name:"+name;

    }
}
