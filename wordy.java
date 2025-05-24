import java.util.Scanner;
public class wordy {
    public static void main(String[] args){
        System.out.println("Enter text ");
        Scanner scan = new Scanner(System.in);
        String inputValue = scan.nextLine().toLowerCase();
        scan.close();
        int count = 0;
        for(int i = 0; i < inputValue.length(); i++){
            count++;
            
        }

    }
    
}
