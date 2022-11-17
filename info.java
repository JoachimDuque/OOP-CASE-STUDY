import java.util.*;
public class info {
    static Scanner scan = new Scanner(System.in);
    public info(){
        student st = new student();

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
    }
}
