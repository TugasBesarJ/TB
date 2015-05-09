
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
public class kenyamananRuang {
    
    String bising,bau,bocor,rusak;
    
    private String Kebisingan;
    private String Bau;
    private String Kebocoran;
    private String Kerusakan;

    public String getKebisingan() {
        return Kebisingan;
    }

    public void setKebisingan(String Kebisingan) {
        this.Kebisingan = Kebisingan;
    }

    public String getBau() {
        return Bau;
    }

    public void setBau(String Bau) {
        this.Bau = Bau;
    }

    public String getKebocoran() {
        return Kebocoran;
    }

    public void setKebocoran(String Kebocoran) {
        this.Kebocoran = Kebocoran;
    }

    public String getKerusakan() {
        return Kerusakan;
    }

    public void setKerusakan(String Kerusakan) {
        this.Kerusakan = Kerusakan;
    }

    void inputawal3(){
        Scanner in=new Scanner(System.in);
        System.out.println("masukan kebisingan : ");
        setKebisingan(in.nextLine());
        System.out.println("masukan bau : ");
        setBau(in.nextLine());
        System.out.println("masukan kebocoran: ");
        setKebocoran(in.nextLine());
        System.out.println("masukan kerusakan : ");
        setKerusakan(in.nextLine());
    }
    
      boolean analisiskebisingan(){
        if(getKebisingan()!= bising){
            System.out.println(outanalisiskebisingan ());
            return true;
        }
        else{
            System.out.println(out1analisiskebisingan ());
            return false;
        }
        }
      public static boolean outanalisiskebisingan (){
          System.out.println("kondisi ruang sesuai.");
          return true;  
      }
       public static boolean out1analisiskebisingan (){
          System.out.println("kondisi ruang tidak sesuai"); 
        return false;
       }
      
       
       
       
      boolean analisisbau(){
        if(getBau()!= bau){
            System.out.println(outanalisisbau());
            return true;
        }
        else{
            System.out.println(out1analisisbau());
            return false;
        }
        }
      
      public static boolean outanalisisbau(){
          System.out.println("kondisi ruang sesuai.");
          return true;  
      }
       public static boolean out1analisisbau(){
          System.out.println("kondisi ruang tidak sesuai"); 
        return false;
       }
       
       
       
       
      
      boolean analisiskebocoran(){
        if(getKebocoran()!= bocor){
            System.out.println(outanalisiskebocoran());
            return true;
        }
        else{
            System.out.println(out1analisiskebocoran());
            return false;
        }
      }
       
      public static boolean outanalisiskebocoran(){
          System.out.println("kondisi ruang sesuai.");
          return true;  
      }
       public static boolean out1analisiskebocoran(){
          System.out.println("kondisi ruang tidak sesuai"); 
        return false;
       }
        
       
       
       
      boolean analisiskerusakan(){
        if(getKerusakan()!= rusak){
            System.out.println("kondisi ruang sesuai.");
            return true;
        }
        else{
            System.out.println("kondisi ruang tidak sesuai.");
            return false;
        }
    }
      
      public static boolean outanalisiskerusakan(){
          System.out.println("kondisi ruang sesuai.");
          return true;  
      }
       public static boolean out1analisiskerusakan(){
          System.out.println("kondisi ruang tidak sesuai"); 
        return false;
       }
}
