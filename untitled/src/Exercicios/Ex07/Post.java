package Exercicios.Ex07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    Comment comment;
    ArrayList<Comment> listComment = new ArrayList<>();

    public Post(){
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public ArrayList<Comment> getListComment() {
        return listComment;
    }

    public void setListComment(Comment newComment) {
        listComment.add(newComment);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(title + "\n").append(content + "\n").append("Likes: "+ likes +" - ").append(moment+"\n");
        stringBuilder.append("Comments:\n");
        for (Comment c : listComment){
            stringBuilder.append(c+"\n");
        }

        return stringBuilder.toString();
    }
}
