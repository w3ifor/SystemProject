package sample;

public class User {
    private String fname;
    private String lname;
    private String userName;
    private String password;
    public User(){
        this(null,null,null,null);
    }
    public User(String fname,String lname,String userName,String password){
        this.fname=fname;
        this.lname=lname;
        this.userName=userName;
        this.password=password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
