public class S25 {
 
    public static void main(String args[]) {
        String str1 = "Hello";
        String str2 = "World";
        boolean areEqual = str1.equals(str2);
        System.out.println("Are two strings equal? : " + areEqual);

        String sentence = str1 + " " + str2;
        System.out.println("Hello World Sentence: " + sentence);

        String sub = sentence.substring(2, 5);
        System.out.println("Substring: " + sub);

        String FirstName = "Shabnam";
        String LastName = "Silawat";
        int age = 22;

        String formatted = String.format("First Name: %s, Last Name: %s, Age: %d", FirstName, LastName, age);
        System.out.println(formatted);
    }
}

