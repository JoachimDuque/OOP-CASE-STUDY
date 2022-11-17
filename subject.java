public class subject {

    private String subject, Schedule;

    public String getSubj() {
        return subject;
    }

    public String getSched() {
        return Schedule;
    }

    public void setSubj(String s) {
        if (s.equalsIgnoreCase("wd")) {
            subject = "Web Development";
        } else if (s.equalsIgnoreCase("oop")) {
            subject = "Object Oriented Programming";
        } else if (s.equalsIgnoreCase("ea")) {
            subject = "Enterprise Architecture";
        } else if (s.equalsIgnoreCase("ipt")) {
            subject = "Integrative Programming Technologies";
        } else if (s.equalsIgnoreCase("cc6")) {
            subject = "Information Management";
        }
    }

    public void setSched(String Sc) {
        if (Sc.equals("1")) {
            Schedule = "8:30AM to 10:00AM";
        } else if (Sc.equals("2")) {
            Schedule = "9:00AM to 10:30AM";
        } else if (Sc.equals("3")) {
            Schedule = "10:00AM to 11:30AM";
        } else if (Sc.equals("4")) {
            Schedule = "1:00PM to 2:30PM";
        } else if (Sc.equals("5")) {
            Schedule = "3:00PM to 4:30PM";
        }
    }

    public String toString(){
        return ("-----------------------------------------\n" + "SUBJECT ADDED!!! \n" + subject + " - " + Schedule);
    }
}
