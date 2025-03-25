/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Suciantari
 * tanggal 25 maret 2025
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] nama = new String[5];
        
        for(int y=0;y<5;y++){
            System.out.print("isi data teman: ");
            nama[y] = inp.nextLine();
        }
        
        System.out.println("Data ke 1: "+nama[0]);
        System.out.println("Data ke 1: "+nama[1]);
        System.out.println("Data ke 1: "+nama[2]);
        System.out.println("Data ke 1: "+nama[3]);
        System.out.println("Data ke 1: "+nama[4]);
        
        for(int i=0;i<nama.length;i++){
            System.out.println("Data ke-"+(i+1)+":"+nama[i]);   
        }
        for(String x : nama){
            System.out.println(x);
        }
    }
    
}
