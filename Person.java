package Aggregation;

public class Person {
    String Name;
    int Age;
    Address address;
    public Person(String Name, int Age, Address address){
        this.Name = Name;
        this.Age = Age;
        this.address = address;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
    public void setaddress(Address address){
        this.address = address;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public Address address(){
        return address;
    }
}
