import java.util.Scanner;
public class wordOccurernce {
    public static void main(String[] args) {
        System.out.println("Enter text");
        Scanner scan = new Scanner(System.in);
    
        String userInput = scan.nextLine().toLowerCase();
        int count = 0;
        for(int i= 0; i<userInput.length(); i++ ){
            if(userInput == userInput){
                count++;

            }

        }
        System.out.println("Instance " + count);
        
    }
    
}
