import java.util.*;
import javax.swing.*;
public class AddressBook {
    
    ArrayList persons;
    public AddressBook()
    {
        persons = new ArrayList();

    }
    public void addPerson()
    {
        String name = JOptionPane.showInputDialog("Enter name of Person:");
        String address = JOptionPane.showInputDialog("Enter Address of Person");
        String phonenu = JOptionPane.showInputDialog("Enter Phone Number of Person");

        PersonInfo p = new PersonInfo(name, address, phonenu);
        persons.add(p);
        
    }


}
