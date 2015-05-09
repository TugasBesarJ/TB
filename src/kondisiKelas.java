
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author the 12
 */
public class kondisiKelas {
    String bersih;
    
    private String Lantai;
    private String dinding;
    private String Atap;
    private String Pintu;
    private String Jendela;


    public String getLantai() {
        return Lantai;
    }

    public void setLantai(String Lantai) {
        this.Lantai = Lantai;
    }

    public String getDinding() {
        return dinding;
    }

    public void setDinding(String dinding) {
        this.dinding = dinding;
    }

    public String getAtap() {
        return Atap;
    }

    public void setAtap(String Atap) {
        this.Atap = Atap;
    }

    public String getPintu() {
        return Pintu;
    }

    public void setPintu(String Pintu) {
        this.Pintu = Pintu;
    }

    public String getJendela() {
        return Jendela;
    }

    public void setJendela(String Jendela) {
        this.Jendela = Jendela;
    }
     
    void inputawal4(){
        Scanner in=new Scanner(System.in);
        System.out.println("Masukkan kondisi lantai : ");
        setLantai(in.nextLine());
        System.out.println("Masukkan kondisi dinding : ");
        setDinding(in.nextLine());
        System.out.println("masukan kondisi atap : ");
        setAtap(in.nextLine());
        System.out.println("Masukkan kondisi pintu : ");
        setPintu(in.nextLine());
        System.out.println("Masukkan kondisi jendela : ");
        setJendela(in.nextLine());
    }
    
     
    boolean analisiskebersihan1(){
        if(getLantai()== bersih){
            System.out.println(outanalisiskebersihan1());
            return true;
        }
        else{
            System.out.println(out1analisiskebersihan1());
            return true;
        }
        
    }
      public static boolean outanalisiskebersihan1(){
          System.out.println("kondisi lantai sesuai.");
          return true;  
      }
       public static boolean out1analisiskebersihan1(){
          System.out.println("kondisi lantai tidak sesuai"); 
        return false;
       }
       
       
       
    boolean analisiskebersihan2(){
        if(getDinding()== bersih){
            System.out.println(outanalisiskebersihan2());
             return true;
        }
        else{
            System.out.println(out1analisiskebersihan2());
             return false;  
        }
    }  
      public static boolean outanalisiskebersihan2(){
          System.out.println("kondisi dinding sesuai.");
          return true;  
      }
       public static boolean out1analisiskebersihan2(){
          System.out.println("kondisi dinding tidak sesuai"); 
        return false;
       }
       
       
       
       
    boolean analisiskebersiahan3(){
        if(getAtap()== bersih){
            System.out.println(outanalisiskebersihan3());
            return true;
        }
        else{
            System.out.println(out1analisiskebersihan3());
            return false;
        }
    }
        
      public static boolean outanalisiskebersihan3(){
          System.out.println("kondisi atap sesuai.");
          return true;  
      }
       public static boolean out1analisiskebersihan3(){
          System.out.println("kondisi atap tidak sesuai"); 
        return false;
       }
       
       
       
       
    boolean analisiskebersihan4(){
        if(getPintu()== bersih){
            System.out.println(outanalisiskebersihan4());
            return true;
        }
        else{
            System.out.println(out1analisiskebersihan4());
            return false;
        }
   
    }
      public static boolean outanalisiskebersihan4(){
          System.out.println("kondisi pintu sesuai.");
          return true;  
      }
       public static boolean out1analisiskebersihan4(){
          System.out.println("kondisi pintu tidak sesuai"); 
        return false;
       }
       
       
       
       
     
    boolean analisiskebersiahan5(){    
        if(getJendela()== bersih){
            System.out.println(outanalisiskebersihan5());
             return true;
        }
        else{
            System.out.println(out1analisiskebersihan5());
            return false;
        }
       
    }
    public static boolean outanalisiskebersihan5(){
          System.out.println("kondisi pintu sesuai.");
          return true;  
      }
       public static boolean out1analisiskebersihan5(){
          System.out.println("kondisi pintu tidak sesuai"); 
        return false;
       }
}

