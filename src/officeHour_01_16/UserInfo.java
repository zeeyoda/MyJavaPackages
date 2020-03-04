package officeHour_01_16;

public class UserInfo {
    //Attributes ==> instance variables

    private String userName,
            password,
            ssn;

    public UserInfo(){


    }
public String getUserName(){
    return this.userName;
}
public void setUserName(String userName){
    this.userName=userName;
}
public String getSsn(){
    return this.ssn;
}
public void setSsn(String Ssn){
    this.ssn = Ssn;
}
public String getPassword(){
    return this.password;
}
public void setPassword(){
    this.password = password;
}
}
