/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan36.objectorientedtargetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Tabungan{
    public int akhir;
    public int saldo = 3500000;
    public int bunga = 8;
    public int target = 6000000;

    public int targetSaldo(int a, int b){
    akhir = (a + (a*b/100));
        return 0;
    }
}

public class TargetSaldoTabungan {
    
    public static void main(String[] args) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator('.');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        kursIndonesia.setMaximumFractionDigits(0);
        
        Tabungan t = new Tabungan();
        
        for (int i = 1; i <= i; i++){
            t.targetSaldo(t.saldo, t.bunga);
            System.out.println("Saldo di bulan ke-"+i+" " + kursIndonesia.format(t.akhir));
            t.saldo = t.akhir;
         if(t.akhir >= t.target)
             break;
        }
    }
}