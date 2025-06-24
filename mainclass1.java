package Inheritance;

public class mainclass1 {
   public static void main (String args[]){
    employee Employee = new employee();
    Employee.submitTimesheet();
    Employee.bookVacation();

    System.out.println();

    programmer Programmer = new programmer();
    Programmer.submitTimesheet();
    Programmer.bookVacation();
    Programmer.writeCode();

    System.out.println();

    tester Tester = new tester();
    Tester.submitTimesheet();
    Tester.bookVacation();
    Tester.testCode();

    System.out.println();

    webprogrammer WebProgrammer = new webprogrammer();
    WebProgrammer.submitTimesheet();
    WebProgrammer.bookVacation();
    WebProgrammer.writeCode();
    WebProgrammer.createWebsite();
   } 
}
