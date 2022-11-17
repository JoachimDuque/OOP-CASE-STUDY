import java.util.*;

public class Enrollment {
    static Scanner sc = new Scanner(System.in);
    static String course;
    Enrollment(){
        System.out.println("------------------ C O U R S E S -------------------");
        System.out.println("[BSIT] Bachelor of Science in Information Technology");
        System.out.println("[BSIS] Bachelor of Science in Information System");
        System.out.println("[BSCS] Bachelor of Science in Computer Science");

        do{
            System.out.println("----------------------------------------------------");
            System.out.print("Select course code: ");
            course = sc.nextLine();

            if (course.equalsIgnoreCase("bsit")){
                subject c  = new subject();
                System.out.println("-----------------------------------------");
                System.out.println("AVAILABLE SUBJECT \nENTER CODE SUBJECT: ");
                System.out.println("[WD] Web Development ");
                System.out.println("[OOP] Object Oriented Programming ");
                System.out.println("[EA] Enterprise Architecture ");
                System.out.println("[IPT] Integrative Programming Technologies ");
                System.out.println("[CC6] Information Management  ");
                System.out.print(">>> ");
                String sub = sc.nextLine();
                c.setSubj(sub);

                System.out.println("-----------------------------------------");
                System.out.println("ENTER SCHEDULE: ");
                System.out.println("[1] 8:30AM - 10:00AM ");
                System.out.println("[2] 9:00AM - 10:30AM ");
                System.out.println("[3] 10:00AM - 11:30AM");
                System.out.println("[4] 1:00PM - 2:30PM ");
                System.out.println("[5] 3:00PM - 4:30PM  ");
                System.out.print(">>> ");
                String sch = sc.nextLine();
                c.setSched(sch);
                System.out.println("-----------------------------------------");
                System.out.println("SELECT OPTION \n[1]Show All \n[2]Go to Menu \n[3]End");
                int choice;
                do{
                    System.out.print(">>> ");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        student st = new student();
                        System.out.println(st);
                        st.display();
                    }
                    else if(choice == 2){
                        new home();
                    }
                    else if(choice == 3){
                        System.out.println("PROCESS ENDED");
                    }
                    else {
                        System.out.println("INVALID TRY AGAIN!!!");
                    }
                }while(choice != 1 && choice != 2 && choice != 3);
            }
            else if (course.equalsIgnoreCase("bsis")){
                subject c  = new subject();
                System.out.println("-----------------------------------------");
                System.out.println("AVAILABLE SUBJECT \nENTER CODE SUBJECT: ");
                System.out.println("[WD] Web Development ");
                System.out.println("[OOP] Object Oriented Programming ");
                System.out.println("[EA] Enterprise Architecture ");
                System.out.println("[IPT] Integrative Programming Technologies ");
                System.out.println("[CC6] Information Management  ");
                System.out.print(">>> ");
                String sub = sc.nextLine();
                c.setSubj(sub);

                System.out.println("-----------------------------------------");
                System.out.println("ENTER SCHEDULE: ");
                System.out.println("[1] 8:30AM - 10:00AM ");
                System.out.println("[2] 9:00AM - 10:30AM ");
                System.out.println("[3] 10:00AM - 11:30AM");
                System.out.println("[4] 1:00PM - 2:30PM ");
                System.out.println("[5] 3:00PM - 4:30PM  ");
                System.out.print(">>> ");
                String sch = sc.nextLine();
                c.setSched(sch);
                System.out.print(c);

            }
            else if (course.equalsIgnoreCase("bscs")){
                subject c  = new subject();
                System.out.println("-----------------------------------------");
                System.out.println("AVAILABLE SUBJECT \nENTER CODE SUBJECT: ");
                System.out.println("[WD] Web Development ");
                System.out.println("[OOP] Object Oriented Programming ");
                System.out.println("[EA] Enterprise Architecture ");
                System.out.println("[IPT] Integrative Programming Technologies ");
                System.out.println("[CC6] Information Management  ");
                System.out.print(">>> ");
                String sub = sc.nextLine();
                c.setSubj(sub);

                System.out.println("-----------------------------------------");
                System.out.println("ENTER SCHEDULE: ");
                System.out.println("[1] 8:30AM - 10:00AM ");
                System.out.println("[2] 9:00AM - 10:30AM ");
                System.out.println("[3] 10:00AM - 11:30AM");
                System.out.println("[4] 1:00PM - 2:30PM ");
                System.out.println("[5] 3:00PM - 4:30PM  ");
                System.out.print(">>> ");
                String sch = sc.nextLine();
                c.setSched(sch);
                System.out.print(c);
            }
            else{
                System.out.println("INVALID COURSE CODE: TRY AGAIN!!!");            }
        }while(!course.equalsIgnoreCase("bsit") && !course.equalsIgnoreCase("bsis") && !course.equalsIgnoreCase("bscs"));

    }
}
