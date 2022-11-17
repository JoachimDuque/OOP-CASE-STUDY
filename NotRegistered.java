
import java.util.Scanner;

public class NotRegistered {
    static Scanner scan = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
    static int choice;
    static student st = new student();

    public NotRegistered() {

        System.out.println("------------------------------------------");
        System.out.println("Welcome to the Course Registration System.");
        System.out.println("Please Enter Code: \n[1]Student \n[2]Teacher \n[3]Back \n[4]Exit");
        int s;

        do {
            System.out.print("CHOICE: ");
            s = scan.nextInt();

            if (s == 1) {
                System.out.println("-----------------------------------------");
                System.out.print("ID NUMBER: ");
                long id = scan.nextLong();
                scan.nextLine();
                st.setID(id);

                System.out.print("LRN: ");
                long lrn = scan.nextLong();
                scan.nextLine();
                st.setlrn(lrn);

                System.out.print("NAME: ");
                String name = scan.nextLine();
                st.setname(name);

                System.out.print("AGE: ");
                int age = scan.nextInt();
                scan.nextLine();
                st.setage(age);

                System.out.print("GENDER: ");
                String gender = scan.nextLine();
                st.setgen(gender);

                System.out.print("STATUS: ");
                String status = scan.nextLine();
                st.setstat(status);

                System.out.print("ADDRESS: ");
                String address = scan.nextLine();
                st.setadd(address);

                System.out.print("RELIGION: ");
                String religion = scan.nextLine();
                st.setrel(religion);

                System.out.print("NATIONALITY: ");
                String nationality = scan.nextLine();
                st.setNat(nationality);

                System.out.print("PHONE NUMBER: ");
                long Pnum = scan.nextLong();
                scan.nextLine();
                st.setpn(Pnum);

                System.out.print("MOTHER'S NAME: ");
                String MN = scan.nextLine();
                st.setMName(MN);

                System.out.print("MOTHER'S OCCUPATION: ");
                String MO = scan.nextLine();
                st.setMOcc(MO);

                System.out.print("FATHER'S NAME: ");
                String FN = scan.nextLine();
                st.setFName(FN);

                System.out.print("FATHER'S OCCUPATION: ");
                String FO = scan.nextLine();
                st.setFOcc(FO);

                System.out.println("------------------------------------------");
                System.out.println("SELECT OPTION \n[1]Show Details \n[2]Enroll \n[3]Go to Menu \n[4]Exit");
                

                do{
                    System.out.print("------------------------------------------\n>>>");
                    choice = scan.nextInt();
                    if (choice == 1) {
                        System.out.println("------------STUDENT INFORMATION-----------");
                        System.out.println(st);
                        st.display();
                    }
                    else if(choice == 2){
                        String course;
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
                
                            do{
                                System.out.print(">>> ");
                                choice = sc.nextInt();
                                if (choice == 1) {
                                    System.out.println("-----------------------------------------");
                                    System.out.println(st);
                                    st.display();
                                    System.out.println(c);
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
                System.out.println("-----------------------------------------");
                            System.out.println("SELECT OPTION \n[1]Show All \n[2]Go to Menu \n[3]End");
                
                            do{
                                System.out.print(">>> ");
                                choice = sc.nextInt();
                                if (choice == 1) {
                                    System.out.println(st);
                                    st.display();
                                    System.out.println(c);
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
                System.out.println("-----------------------------------------");
                            System.out.println("SELECT OPTION \n[1]Show All \n[2]Go to Menu \n[3]End");
                
                            do{
                                System.out.print(">>> ");
                                choice = sc.nextInt();
                                if (choice == 1) {
                                    System.out.println("------------STUDENT INFORMATION-----------");
                                    System.out.println(st);
                                    st.display();
                                    System.out.println(c);
                                    System.out.println("-----------------------------------------");
                                    System.out.println("SELECT OPTION \n[1]Go to Menu \n[2]End");
                                    do{
                                        System.out.print(">>>");
                                        choice = sc.nextInt();
                                        System.out.println("-----------------------------------------");

                                        if (choice == 1){
                                            new home();
                                        }
                                        else if (choice ==2){
                                            System.out.println("PROCESS ENDED");
                                        }
                                        else{
                                            System.out.println("INVALID TRY AGAIN!!!");
                                        }

                                    }while(choice != 1 && choice != 2);
                                    
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
            else{
                System.out.println("INVALID COURSE CODE: TRY AGAIN!!!");            }
        }while(!course.equalsIgnoreCase("bsit") && !course.equalsIgnoreCase("bsis") && !course.equalsIgnoreCase("bscs"));

                    }
                    else if(choice == 3){
                        new home();
                    }
                    else if(choice == 4){
                        System.out.println("PROCESS ENDED");
                    }
                    else {
                        System.out.println("INVALID TRY AGAIN!!!");
                    }
                }while(choice != 1 && choice != 2 && choice != 3 && choice !=4);
            } 
            else if (s == 2) {
                student st = new student();
                System.out.println("------------------------------------------");
                System.out.print("ID NUMBER: ");
                int id = scan.nextInt();
                scan.nextLine();
                st.setID(id);

                System.out.print("LRN: ");
                int lrn = scan.nextInt();
                scan.nextLine();
                st.setlrn(lrn);

                System.out.print("NAME: ");
                String name = scan.nextLine();
                st.setname(name);

                System.out.print("AGE: ");
                int age = scan.nextInt();
                scan.nextLine();
                st.setage(age);

                System.out.print("GENDER: ");
                String gender = scan.nextLine();
                st.setgen(gender);

                System.out.print("STATUS: ");
                String status = scan.nextLine();
                st.setstat(status);

                System.out.print("ADDRESS: ");
                String address = scan.nextLine();
                st.setadd(address);

                System.out.print("RELIGION: ");
                String religion = scan.nextLine();
                st.setrel(religion);

                System.out.print("NATIONALITY: ");
                String nationality = scan.nextLine();
                st.setNat(nationality);

                System.out.print("PHONE NUMBER: ");
                int Pnum = scan.nextInt();
                scan.nextLine();
                st.setpn(Pnum);
                System.out.println("------------------------------------------");
                System.out.println("SELECT OPTION \n[1]Show Details \n[2]Enroll \n[3]Go to Menu \n[4]Exit");
                do{
                    System.out.print("------------------------------------------\n>>>");
                    choice = scan.nextInt();
                    if (choice == 1) {
                        System.out.println("------------TEACHER's INFORMATION-----------");
                        System.out.println(st);
    
                    } 
                    else if(choice == 2){
                        String course;
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
                
                            do{
                                System.out.print(">>> ");
                                choice = sc.nextInt();
                                if (choice == 1) {
                                    System.out.println("-----------------------------------------");
                                    System.out.println(st);
                                    System.out.println(c);
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
                System.out.println("-----------------------------------------");
                            System.out.println("SELECT OPTION \n[1]Show All \n[2]Go to Menu \n[3]End");
                
                            do{
                                System.out.print(">>> ");
                                choice = sc.nextInt();
                                if (choice == 1) {
                                    System.out.println(st);
                                    st.display();
                                    System.out.println(c);
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
                System.out.println("-----------------------------------------");
                            System.out.println("SELECT OPTION \n[1]Show All \n[2]Go to Menu \n[3]End");
                
                            do{
                                System.out.print(">>> ");
                                choice = sc.nextInt();
                                if (choice == 1) {
                                    System.out.println("------------TEACHER INFORMATION-----------");
                                    System.out.println(st);
                                    st.display();
                                    System.out.println(c);
                                    System.out.println("-----------------------------------------");
                                    System.out.println("SELECT OPTION \n[1]Go to Menu \n[2]End");
                                    do{
                                        System.out.print(">>>");
                                        choice = sc.nextInt();
                                        System.out.println("-----------------------------------------");

                                        if (choice == 1){
                                            new home();
                                        }
                                        else if (choice ==2){
                                            System.out.println("PROCESS ENDED");
                                        }
                                        else{
                                            System.out.println("INVALID TRY AGAIN!!!");
                                        }

                                    }while(choice != 1 && choice != 2);
                                    
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
            else{
                System.out.println("INVALID COURSE CODE: TRY AGAIN!!!");            }
        }while(!course.equalsIgnoreCase("bsit") && !course.equalsIgnoreCase("bsis") && !course.equalsIgnoreCase("bscs"));
        
                    }
                    else if(choice==3){
                        new NotRegistered();
                    }
                    else if(choice==4){
                        System.out.println("PROCESS ENDED");
                    }
                    else {
                        System.out.println("INVALID TRY AGAIN!!!");
                    }
                }while(choice != 1 && choice != 2 && choice != 3 && choice !=4);
            } 
            else if(s == 3){
                new home();
                System.out.println("------------------------------------------");
            }
            else if (s==4){
                System.out.println("PROCESS ENDED");
            }
            else {
                System.out.println("------------------------------------------");
                System.out.println("TRY AGAIN");
            }
        } while (s != 1 && s != 2 && s!=3 && s!=4);
    }
}