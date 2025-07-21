public class Mainpojo1 {
    public static void main (String args[]){
        Studentpojo1 studentpj1 = new Studentpojo1(22, "Shabnam", "BCA");
        System.out.println("Name: " + studentpj1.getname());
        System.out.println("Age: "+ studentpj1.getage());
        System.out.println("Class: " + studentpj1.getclassName());
    }}