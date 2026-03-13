package de.Home.Bewerbung;

public class Zeugnisse {
    private String senester1, semester2;

    public Zeugnisse(String senester1,String semester2) {
        this.senester1 = senester1;
        this.semester2 = semester2;
    }
    public void setSenester1(String senester1) {this.senester1 = senester1;}
    public void setSemester2(String semester2) {this.semester2 = semester2;}

    public String getSenester1() {return senester1;}
    public String getSemester2() {return semester2;}
}
