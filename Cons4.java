public class Cons4 {
    public static void main (String args[]){
        Person4 person = new Person4();
        person.name ="Shabnam";
        person.age = 22;
        Person4 person2 = new Person4(person);
        System.out.println("Name: "+ person2.name + " Age: "+ person2.age);
    }
}
