public class Studentstatic3 {
    int id;
    String name;
    static String college = "Manipal";
    static void changeCollegeName(String newcollegename){
        college = newcollegename;
    }
    Studentstatic3(int id , String name){
        this.id = id;
        this.name=name;
    }
}
