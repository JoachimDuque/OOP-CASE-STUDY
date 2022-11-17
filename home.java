import java.util.*;
public class home {
    static Scanner scan = new Scanner(System.in);
    public home(){
        String ans;

        do {
            System.out.print("Is this your first time using this Registration System? (Y/N) [0]Exit\n>>>");
            ans = scan.nextLine();

            if (ans.equalsIgnoreCase("y")) {
                new NotRegistered();
            } 
            else if (ans.equalsIgnoreCase("n")) {
               new Register();
            } 
            else if (ans.equals("0")){
                System.out.println("PROCESS ENDED");
            }
            else {
                System.out.println("TRY AGAIN");
            }
        } while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n") && !ans.equals("0"));
    }
}
