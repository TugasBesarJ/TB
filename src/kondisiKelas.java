
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
            System.out.println("kondisi lantai sesuai.");
        }
        else{
            System.out.println("kondisi lantai tidak sesuai");
        }
        return true;
    }
    boolean analisiskebersihan2(){
        if(getDinding()== bersih){
            System.out.println("kondisi dinding sesuai.");
        }
        else{
            System.out.println("kondisi dinding tidak sesuai");
        }
        return true;
    }
    
    boolean analisiskebersiahan3(){
        if(getAtap()== bersih){
            System.out.println("kondisi atap sesuai.");
        }
        else{
            System.out.println("kondisi atap tidak sesuai.");
        }
        return true;
    }
        
    boolean analisiskebersihan4(){
        if(getPintu()== bersih){
            System.out.println("kondisi pintu sesuai.");
        }
        else{
            System.out.println("kondisi pintu tidak sesuai.");
        }
        return true;
    }
    
    boolean analisiskebersiahan5(){    
        if(getJendela()== bersih){
            System.out.println("kondisi jendela sesuai.");
        }
        else{
            System.out.println("kondisi jendela tidak sesuai.");
        }
        return true;
    }
    
}

