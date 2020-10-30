
package Sorting;


public class ISSStudent implements Comparable {
    private String name, address;
    private int id;
    
    ISSStudent(String n, String a, int i){
        name = n;
        address = a;
        id = i;
    }
    
    public String toString(){
        return "Name:\t\t" + name + "\nAddress:\t" + address +
                "\nID:\t\t" + id;
    }
    
    public int getID(){
        return id;
    }
    
    public String getAdd(){
        return address;
    }
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Object t) {
        ISSStudent other = (ISSStudent)t;
        return name.compareTo(other.getName());
    }
    
    
}
