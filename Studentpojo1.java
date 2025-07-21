public class Studentpojo1 {
    private int age;
    private String name;
    private String className;
    public Studentpojo1(int age, String name, String className){
        this.age = age;
        this.name = name;
        this.className = className;
    }
     public String getname(){
        return name;
     }

    public void setname(String name){
        this.name = name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age = age;
    }
    public String getclassName(){
        return className;
    }
    public void setclassName(String className){
        this.className=className;
    }
}
