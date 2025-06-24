public class Person5 {
    private String name;
    private int age;
    Person5(String name, int age){
     this.name = name;
     this.age = age;
    }
    Person5(){
        this.name = "Unknown";
        this.age = 0;
    }
    public Person5(Person5 otherperson){
     this.name = otherperson.name;
     this.age = otherperson.age;
    }
    public String getDetails(){
    return "Name: " + name + ", Age: " + age;
    }
    }

