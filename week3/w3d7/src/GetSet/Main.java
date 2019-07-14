package GetSet;

public class Main {

    private String emailAddress;

    public String getEmailAddress () {
        return emailAddress;
    }

    public void setEmailAddress (String email) {
        if (email.indexOf("@") != -1) {
            this.emailAddress = email;
        } else {
            throw new IllegalArgumentException("email address is invalid");
        }


    }

}
