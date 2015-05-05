
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
public class keamananRuang {
    String kokoh,ada,aman;
    
    private String Kekokohan;
    private String KunciPintuJendela;
    private String Bahaya;

    public String getKekokohan() {
        return Kekokohan;
    }

    public void setKekokohan(String Kekokohan) {
        this.Kekokohan = Kekokohan;
    }

    public String getKunciPintuJendela() {
        return KunciPintuJendela;
    }

    public void setKunciPintuJendela(String KunciPintuJendela) {
        this.KunciPintuJendela = KunciPintuJendela;
    }

    public String getBahaya() {
        return Bahaya;
    }

    public void setBahaya(String Bahaya) {
        this.Bahaya = Bahaya;
    }
    
    void inputawal2(){
        Scanner in=new Scanner(System.in);
        System.out.println("masukan kekokohan : ");
        setKekokohan(in.nextLine());
        System.out.println("masukan kunci pintu dan jendela : ");
        setKunciPintuJendela(in.nextLine());
        System.out.println("masukan bahaya: ");
        setBahaya(in.nextLine());
    }
    
      boolean analisiskekokohan(){
        if(getKekokohan()!= kokoh){
            System.out.println("kondisi ruang sesuai.");
        }
        else{
            System.out.println("kondisi ruang tidak sesuai");
        }
        return true;
      }
      
      boolean analisiskuncipintudanjendela(){
        if(getKunciPintuJendela()== ada){
            System.out.println("kondisi ruang sesuai.");
        }
        else{
            System.out.println("kondisi ruang tidak sesuai");
        }
        return true;
      }
      
      boolean analisiskeamananruang(){
        if(getBahaya()== aman){
            System.out.println("kondisi ruang sesuai.");
        }
        else{
            System.out.println("kondisi ruang tidak sesuai.");
              
        }
        return true;
      }
}
