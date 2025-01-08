package Exercises.ApplicationTen;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class User {
    private Integer userNumber;

    private Set<User> userSet = new HashSet<>();

    public User(){
    }

    public User(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public void scanList (int studentsNumber){
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= studentsNumber; i++) {
            System.out.print("User "+i+"# number: ");
            int userNumber = scan.nextInt();
            User userAux = new User(userNumber);
            userSet.add(userAux);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userNumber, user.userNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userNumber);
    }

    @Override
    public String toString() {
        return "Total students of Alex courses: " + userSet.size();
    }
}
