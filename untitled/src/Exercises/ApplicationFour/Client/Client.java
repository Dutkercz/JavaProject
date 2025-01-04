package Exercises.ApplicationFour.Client;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    private static SimpleDateFormat dataBrithday = new SimpleDateFormat("dd/MM/yyyy");

    private String clientName;
    private String email;
    private Date birthday;


    public Client(String clientName, Date birthday, String email) {
        this.clientName = clientName;
        this.birthday = birthday;
        this.email = email;
    }

    public String getClientName() {
        return clientName;
    }


    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        StringBuffer stb = new StringBuffer();
        stb.append("Name: " + clientName).append("\nE-mail: "+ email).append(" - Birthday: " + dataBrithday.format(birthday));
        return stb.toString();
    }
}
