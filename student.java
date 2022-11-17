public class student extends details {
    private String MName, FName, MOcc, FOcc;

    public String getMName(){
        return MName;
    }
    public String getFName(){
        return FName;
    }
    public String getMOcc(){
        return MOcc;
    }
    public String getFOcc(){
        return FOcc;
    }
    public void setMName(String M){
        MName = M;
    }
    public void setFName(String F){
        FName = F;
    }
    public void setMOcc(String MO){
        MOcc = MO;
    }
    public void setFOcc(String FO){
        FOcc = FO;
    }
    public void display(){
        System.out.println("Mother's Name: " + MName);
        System.out.println("Mother's Occupation: " + MOcc);
        System.out.println("Father's Name: " + FName);
        System.out.println("Father's Occupation: " + FOcc);
    }
    
}
