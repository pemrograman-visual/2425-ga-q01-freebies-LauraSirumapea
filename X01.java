// 12S24057 - Laura Awise Sirumapea
// 12S24017 - Arya Pratama Sinambela

import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargabuku, totaltransaksi, palingmurah;

        totaltransaksi = 0;
        hargabuku = 0;
        palingmurah = 999;
        hargaakhir = 0;
        hargabuku = Double.parseDouble(input.nextLine());
        while (hargabuku != 0) {
            if (palingmurah <= hargabuku) {
                hargabuku = hargabuku;
            } else {
                palingmurah = hargabuku;
            }
            totaltransaksi = totaltransaksi + hargabuku;
            hargabuku = Double.parseDouble(input.nextLine());
        }
        if (totaltransaksi >= 100) {
            totaltransaksi = totaltransaksi - palingmurah;
        } else {
            totaltransaksi = totaltransaksi;
        }
        System.out.println(toFixed(totaltransaksi,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

