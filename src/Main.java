
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samsung
 */
public class Main {
    public static void main(String[] args){
         int banyak;
      Call ruang[];
      Scanner in = new Scanner (System.in);
      System.out.println("Masukkan jumlah ruang : ");
      banyak = in.nextInt();
      ruang = new Call[banyak];
      for(int i=0;i<ruang.length;i++){
          ruang[1].utama();
          ruang[i].sarana();
          ruang[i].kondisi();
          ruang[i].kebersihan();
          ruang[i].kondisikelas();
          ruang[i].kenyamanan();
          ruang[i].keamanan();
          
    }
     
}
}
