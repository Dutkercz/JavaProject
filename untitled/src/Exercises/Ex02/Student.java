package Exercises.Ex02;

public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }
    public double gradeAverage(){
       return grade1 + grade2 + grade3;
    }

    public String verifyApprobation(){
        if (gradeAverage() > 60 ){
            return "Student Pass";
        }
        else {
            double missingPoints = 60 - gradeAverage();
            return " Student Failed "+
                    "\n Missing points: " + missingPoints;
        }
    }

    @Override
    public String toString() {
        return "Name: " + getName()+
                "\n Grades: "+"\n 1º " + getGrade1()+"\n 2º "+ getGrade2()+"\n 3º "+ getGrade3() +
                "\nFinal Grade: " + String.format("%.2f", gradeAverage()) + "/100";
    }
}
