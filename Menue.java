package de.Home.Bewerbung;

import java.util.Scanner;

public class Menue {
    static Scanner sc = new Scanner(System.in);
    static void main(String[] args) {menue();}
    private static void menue() {
        int auswahl;
        System.out.print("Berwerbung\n------------------------------\n1.) Anschreiben\n2.) Lebenslauf\n3.) Zeugnis vom ersten Semester\n4.) Reposetorrie\n0.) Beenden");
        System.out.print("\nAuswahl: ");
        auswahl = sc.nextInt();
        if (auswahl == 1) {anschreiben(); menue();}
        else if (auswahl == 2) {lebenslauf(); menue();}
        else if (auswahl == 3) {zeugnis(); menue();}
        else if (auswahl == 4) {reposetorie(); menue();}
        else if (auswahl == 0) {System.out.println("Programm beendet.");}
        else {System.out.println("Ungültige Eingabe!"); menue();}
    }
    static void anschreiben() {
        Anschreiben a1 = new Anschreiben("Dokument: Anschreiben", "Dokument: Bewerbungsflyer");
        System.out.println(a1.getAnschreiben() + "\n" + a1.getBerwerbungsflyer());
    }
    static void lebenslauf() {
        Lebenslauf l = new Lebenslauf("Dokument: Lebenslauf");
        System.out.println(l.getLebenslauf());
    }
    static void zeugnis() {
        Zeugnisse z = new Zeugnisse("Zeugnis vom ersten Semester", "Zeugnis vom zweiten Semester");
        System.out.println(z.getSenester1() + "\n" + z.getSemester2());
    }
    static void reposetorie() {
        System.out.println("GITHub Link zu meinem Profil");
    }
}