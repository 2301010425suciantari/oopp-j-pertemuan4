/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan402;

/**
 *
 * @author Suciantari cantyk syekaliii
 * tanggal 25 maret 2025
 */
public class Pertemuan402 {
    public static String [][]Kursi = new String [2][2];  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kursi[0][0] = "Kulo";
        Kursi[0][1] = "Kulu";
        
        Kursi[1][0] = "Kuli";
        Kursi[1][1] = "Kalu";
        
        for(int baris=0;baris<2;baris++){
            for(int kolom=0;kolom<2;kolom++){
                System.out.println("posisi"+baris+":"+kolom+"="+ Kursi[baris][kolom]);
            }
        }
        
    }
    
}
