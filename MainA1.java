package Aggregation;
public class MainA1 {
    public static void main (String args[]){
        Address address = new Address("Germany", "Berlin", "Zimmer Street", 123);
        Person person = new Person("Shabnam", 22, address);
        System.out.println("Name: "+ person.getName() + " Age: "+ person.getAge());
        System.out.println("Address: "+ person.address.getCity()+ " , " + person.address.getCountry() + " , " + person.address.getStreet() + " , " + person.address.getPostNumber() );
    }
    
}
