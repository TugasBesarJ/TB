/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samsung
 */
import java.util.Scanner;
public class SaranaUtama {
    int Steker;
    String kondisiSteker;
    String posisiSteker;
    int kabelLCD;
    String kondisiKabelLCD;
    String posisiKabelLCD;
    int Lampu;
    String kondisiLampu;
    String posisiLampu;
    int KipasAngin;
    String kondisiKipasAngin;
    String posisiKipasAngin;
    int AC;
    String kondisiAC;
    String posisiAC;
    String SSID;
    int CCTV;
    String posisiCCTV;
    
    void masuk(){
        Scanner in=new Scanner(System.in);
        System.out.println("Masukkan jumlah steker : ");
        int Steker=in.nextInt();
        System.out.println("Bagaimana kondisi steker : ");
        String kondisiSteker=in.nextLine();
        System.out.println("Dimana posisis Steker : ");
        String posisiSteker=in.nextLine();
        
        System.out.println("Masukkan jumlah kabel LCD : ");
        int kabelLCD=in.nextInt();
        System.out.println("Bagaimana kondisi kabel LCD : ");
        String kondisiKabelLCD=in.nextLine();
        System.out.println("Dimana posisi kabel LCD : ");
        String posisiKabelLCD=in.nextLine();
        
        System.out.println("Masukkan jumlah lampu : ");
        int Lampu=in.nextInt();
        System.out.println("Bagaimana kondisi lampu : ");
        String kondisiLampu=in.nextLine();
        System.out.println("Dimana posisi lampu : ");
        String posisiLampu=in.nextLine();
        
        System.out.println("Masukkan jumlah kipas angin : ");
        int KipasAngin=in.nextInt();
        System.out.println("Bagaimana kondisi kipas angin : ");
        String kondisiKipasAngin=in.nextLine();
        System.out.println("Dimana posisi kipas angin : ");
        String posisiKipasAngin=in.nextLine();
        
        System.out.println("Masukkan jumlah ac : ");
        int AC=in.nextInt();
        System.out.println("Bagaimana kondisi ac : ");
        String kondisiAC=in.nextLine();
        System.out.println("Dimana posisi AC : ");
        String posisiAC=in.nextLine();
        
        System.out.println("Apakah memiliki SSID : ");
        String SSID=in.nextLine();
        
        System.out.println("Masukkan jumlah CCTV : ");
        int CCTV=in.nextInt();
        System.out.println("dimana posisi CCTV : ");
        String posisiCCTV=in.nextLine();
        
        
        
    }
}
