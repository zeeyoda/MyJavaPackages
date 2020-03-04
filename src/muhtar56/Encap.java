package muhtar56;

public class Encap {

    private String name;
    final int ssn = 899;

    public Encap(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public int getSsn(){
        return ssn;
    }
    public void setName(String name1){
        this.name = name1;
    }
    public void setSsn(int ssn1){
        //this.ssn=ssn1;//cannot use set method as ssn is a final field
    }
}
