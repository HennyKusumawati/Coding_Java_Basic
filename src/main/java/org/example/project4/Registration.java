package org.example.project4;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        this.email = email;
        if(!email.contains("yahoo")){
            System.out.println("Other yahoo mail is not supported");
        }else{
            System.out.println("Email successfully created: "+email);
        }
    }
    public void setUserName(String userName) {
        this.userName = userName;
        if(userName.isEmpty()){
            System.out.println("Username can not be empty");
        } else if (userName.length()<=6) {
            System.out.println("Username has to be more than 6 character");
        } else {
            System.out.println("Username successfully created: "+userName);
        }
    }
    public void setPassword(String password) {
        this.password = password;
        if(password.isEmpty()){
            System.out.println("Password can not be empty");
        } else if (password.length()<=6) {
            System.out.println("Password has to be more than 6 character");
        } else if (password.contains(userName)) {
            System.out.println("Password can not contain username");
        }else{
            System.out.println("Password successfully created: "+password);
        }
    }
}
class RegistrationTester{
    public static void main(String[] args) {
        Registration reg=new Registration();
        reg.setEmail("barley@yahoo.com");
        reg.setUserName("HennyKusuma");
        reg.setPassword("sunnysunday24");
    }
}