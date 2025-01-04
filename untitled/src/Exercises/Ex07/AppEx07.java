package Exercises.Ex07;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AppEx07 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post1 = new Post(data.parse("28/12/2024 15:56:22"), "Star JavaDev career",
                "Comecei hoje minha carreira dev Java", 12);

        Comment commentAux = new Comment("Isso é incrivel!");
        Comment commentAux2 = new Comment("Pra cima deles!");
        post1.setListComment(commentAux);
        post1.setListComment(commentAux2);

        System.out.println(post1);
    }
}
