
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
public class kebersihanRuang {
    String lancar;
    
    private String SirkulasiUdara;
    private int Pencahayan;
    private int Kelembapan;
    private int Suhu;

    public String getSirkulasiUdara() {
        return SirkulasiUdara;
    }

    public void setSirkulasiUdara(String SirkulasiUdara) {
        this.SirkulasiUdara = SirkulasiUdara;
    }

    public int getPencahayan() {
        return Pencahayan;
    }

    public void setPencahayan(int Pencahayan) {
        this.Pencahayan = Pencahayan;
    }

    public int getKelembapan() {
        return Kelembapan;
    }

    public void setKelembapan(int Kelembapan) {
        this.Kelembapan = Kelembapan;
    }

    public int getSuhu() {
        return Suhu;
    }

    public void setSuhu(int Suhu) {
        this.Suhu = Suhu;
    }
     
    void inputawal2(){
        Scanner in=new Scanner(System.in);
        System.out.println("kelancaran sirkulasi udara : ");
        setSirkulasiUdara(in.nextLine());
        System.out.println("nilai pencahayan : ");
        setPencahayan(in.nextInt());
        System.out.println("nilai kelembapan : ");
        setKelembapan(in.nextInt());
        System.out.println("nilai suhu : ");
        setSuhu(in.nextInt());
    }
    
    boolean analisissirkulasiudara(){
        if(getSirkulasiUdara()== lancar){
            System.out.println(outanalisissirkulasiudara());
            return true;
        }
        else{
            System.out.println(out1analisissirkulasiudara());
            return false;
        }
    }
    public static boolean outanalisissirkulasiudara(){
       System.out.println("kelancaran sirkulasi udara sesuai.");
       return true;
    }
    public static boolean out1analisissirkulasiudara(){
     System.out.println("kelancaran sirkulasi udara tidak sesuai.");
        return false;
    }
    
    
    
    boolean analisispencahayaan(){
        if(getPencahayan()>=250 &&getPencahayan()<=350){
            System.out.println(outanalisispencahayaan());
            return true;
        }
        else{
            System.out.println(out1analisispencahayaan());
            return false;
        }
    }
    public static boolean outanalisispencahayaan(){
       System.out.println("nilai pencahayaan sesuai.");
       return true;
    }
    public static boolean out1analisispencahayaan(){
     System.out.println("nilai pencahayaan tidak sesuai");
        return false;
    }
    
    
    
    
    boolean analisiskelembapan(){
        if(getKelembapan()>=70 &&getKelembapan()<=80){
            
            System.out.println(outanalisiskelembapan());
            return true;
        }
        else{
            System.out.println(out1analisiskelembapan());
            return false;
        }
    }
    public static boolean outanalisiskelembapan(){
       System.out.println("nilai kelembapan sesuai.");
       return true;
    }
    public static boolean out1analisiskelembapan(){
     System.out.println("nilai kelembapan tidak sesuai.");
        return false;
    }
    
    
    
    
    boolean analisissuhu(){
        if(getSuhu()>=25 && getSuhu() <= 35){
            System.out.println(outanalisissuhu());
            return true;
        }
        else{
            System.out.println(out1analisissuhu());
            return false;
        }
    }
    public static boolean outanalisissuhu(){
       System.out.println("nilai suhu sesuai");
       return true;
    }
    public static boolean out1analisissuhu(){
     System.out.println("nilai suhu tidak sesuai.");
        return false;
    }
}
