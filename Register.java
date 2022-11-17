import java.util.*;
public class Register {
    static Scanner scan = new Scanner(System.in);
    public Register(){
        System.out.println("------------------------------------------");
        System.out.println("Welcome to the Subject Enrollment.");
        System.out.println("Please Enter Code: \n [1]Student \n [2]Teacher \n[3]Back \n[4]Exit");
        int s;

        do {
            System.out.print("CHOICE: ");
            s = scan.nextInt();
            scan.nextLine();

            if (s == 1) {
                subject c  = new subject();
                System.out.println("-----------------------------------------");
                System.out.println("AVAILABLE SUBJECT \nENTER CODE SUBJECT: ");
                System.out.println("[WD] Web Development ");
                System.out.println("[OOP] Object Oriented Programming ");
                System.out.println("[EA] Enterprise Architecture ");
                System.out.println("[IPT] Integrative Programming Technologies ");
                System.out.println("[CC6] Information Management  ");
                System.out.print(">>> ");
                String sub = scan.nextLine();
                c.setSubj(sub);

                System.out.println("-----------------------------------------");
                System.out.println("ENTER SCHEDULE: ");
                System.out.println("[1] 8:30AM - 10:00AM ");
                System.out.println("[2] 9:00AM - 10:30AM ");
                System.out.println("[3] 10:00AM - 11:30AM");
                System.out.println("[4] 1:00PM - 2:30PM ");
                System.out.println("[5] 3:00PM - 4:30PM  ");
                System.out.print(">>> ");
                String sch = scan.nextLine();
                c.setSched(sch);
                System.out.println(c);
            } 
            else if (s == 2) {
                subject c  = new subject();
                System.out.println("-----------------------------------------");
                System.out.println("AVAILABLE SUBJECT \nENTER CODE SUBJECT: ");
                System.out.println("[WD] Web Development ");
                System.out.println("[OOP] Object Oriented Programming ");
                System.out.println("[EA] Enterprise Architecture ");
                System.out.println("[IPT] Integrative Programming Technologies ");
                System.out.println("[CC6] Information Management  ");
                System.out.print(">>> ");
                String sub = scan.nextLine();
                c.setSubj(sub);

                System.out.println("-----------------------------------------");
                System.out.println("ENTER SCHEDULE: ");
                System.out.println("[1] 8:30AM - 10:00AM ");
                System.out.println("[2] 9:00AM - 10:30AM ");
                System.out.println("[3] 10:00AM - 11:30AM");
                System.out.println("[4] 1:00PM - 2:30PM ");
                System.out.println("[5] 3:00PM - 4:30PM  ");
                System.out.print(">>> ");
                String sch = scan.nextLine();
                c.setSched(sch);
                System.out.println(c);
            } 
            else if(s==3){
                new home();
            }
            else if(s==4){
                System.out.println("PROCESS ENDED");
            }
            
            else {
                System.out.println("------------------------------------------");
                System.out.println("TRY AGAIN");
            }
        } while (s != 1 && s != 2 && s!=3 && s!=4);
    }
}
