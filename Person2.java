public class Person2 {
    String name;
    int age;
    Person2(){
        this.name ="";
        this.age = -1;
    }
    Person2(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Name: "+ this.name + " Age: "+ this.age);
    }
}
