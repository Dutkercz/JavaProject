package Exercises.Ex05.Methods;

public class Methods {
    private String name;
    private String email;
    private int apto;


    public Methods(String name, String email, int numeroDoApto) {
        this.name = name;
        this.email = email;
        this.apto = numeroDoApto;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getApto() {
        return apto;
    }

    public void setApto(int apto) {
        this.apto = apto;
    }

    @Override
    public String toString() {
        return "\nApartamento: " + apto +
                "\n Name: " + name+
                "\n e-mail: " + email;
    }
}
