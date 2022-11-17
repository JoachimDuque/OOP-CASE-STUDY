public class details {
    private String name, address, gender, status, religion, nationality;
    private long id,phonenumber, lrn;
    private int age;
    

    public String getName(){
        return name;
    }    
    public String getAdd(){
        return address;
    }
    public String getGender(){
        return gender;
    }
    public String getStat(){
        return status;
    }
    public String getrel(){
        return religion;
    }
    public String getnation(){
        return nationality;
    }
    public long getID(){
        return id;
    }
    public int getage(){
        return age;
    }
    public long getPN(){
        return phonenumber;
    }
    public long getLRN(){
        return lrn;
    }
    public void setname(String n){
        name = n;
    }
    public void setadd(String a){
        address = a;
    }
    public void setgen(String g){
        gender = g;
    }
    public void setstat(String s){
        status = s;
    }
    public void setrel(String r){
        religion = r;
    }
    public void setNat(String na){
        nationality = na;
    }
    public void setID(long i){
        id = i;
    }
    public void setage(int ag){
        age = ag;
    }
    public void setpn(long p){
        phonenumber = p;
    }
    public void setlrn(long l){
       lrn = l;
    }
    public String toString(){
        return ("NAME: " + name +
        "\nID NUMBER: " + id + 
        "\nLRN: " + lrn +
        "\nAGE: " + age +
        "\nSTATUS: " + status +
        "\nADDRESS: " + address + 
        "\nELIGION: " + religion + 
        "\nNATIONALITY: " + nationality +
        "\nPHONE NUMBER: " + phonenumber);

    }

}
