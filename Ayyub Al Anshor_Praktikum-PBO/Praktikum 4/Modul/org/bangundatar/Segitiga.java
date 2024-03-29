package bangundatar;

import poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = 3; // Jumlah sisi segitiga adalah 3
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public void printInfo() {
        System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
    }
}
