package de.Home.Bewerbung;

public class Anschreiben {
    private String anschreiben, berwerbungsflyer;

    public Anschreiben(String anschreiben, String berwerbungsflyer) {
        this.anschreiben = anschreiben;
        this.berwerbungsflyer = berwerbungsflyer;
    }
    public void setAnschreiben(String anschreiben) {this.anschreiben = anschreiben;}
    public void setBerwerbungsflyer(String berwerbungsflyer) {this.berwerbungsflyer = berwerbungsflyer;}

    public String getAnschreiben() {return anschreiben;}
    public String getBerwerbungsflyer() {return berwerbungsflyer;}
}