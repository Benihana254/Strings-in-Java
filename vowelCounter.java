import java.util.Scanner;
public class vowelCounter {
    public static void main(String[] args) {
        System.out.println("Enter text");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine().toLowerCase();
        scan.close();
        int vowelCount = 0;
        for (int i= 0; i < userInput.length(); i++ ){
            char ch = userInput.charAt(i);
            if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
                vowelCount++;

            }

        }
        int consonantCount = userInput.length() - vowelCount;
        System.out.println("Letters Count " + userInput.length());
        System.out.println("Vowel Count " + vowelCount);
        System.out.println("Consonant Count " + consonantCount);


        }
    }
    

