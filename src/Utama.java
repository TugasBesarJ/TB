
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Utama extends IdentitasKelas {
    double luas;
    double luasrasio;
    private int panjang;
    private int lebar;
    private int jumlahKursi;
    private int jumlahJendela;
    private int jumlahPintu;

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getLebar() {
        return lebar;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahJendela(int jumlahJendela) {
        this.jumlahJendela = jumlahJendela;
    }

    public int getJumlahJendela() {
        return jumlahJendela;
    }
    
    
    
    
    void inputawal(){
        Scanner in=new Scanner(System.in);
        System.out.println("Masukkan nama ruang anda : ");
        super.setNamaRuang(in.next());
        System.out.println("Masukkan lokasi ruangan anda : ");
        super.setLokasiRuang(in.nextInt());
        System.out.println("Pilih program jurusan anda : ");
        setProdi(in.next());
    }
    void input(){
        Scanner in = new Scanner (System.in);
        System.out.println("Panjang : ");
        setPanjang(in.nextInt());
        System.out.println("Lebar : ");
        setLebar(in.nextInt());
        System.out.println("Jumlah Kursi :");
        setJumlahKursi(in.nextInt());
        System.out.println("Jumlah Jendela :");
        setJumlahJendela(in.nextInt());
        System.out.println("Jumlah pintu : ");
        setJumlahPintu(in.nextInt());
            
    }
    
    double luas(){
        return panjang*lebar;
    }
    
    double luasrasio(){
        return luas()/jumlahKursi;
    }
    
    void tampil(){
        System.out.println("Nama ruang anda : "+getNamaRuang());
        System.out.println("Lokasi ruangan anda ada di : "+getLokasiRuang());
        System.out.println("Jurusan/ program studi pilihan anda adalah : "+getProdi());
        System.out.println("Luas " + luas());
        System.out.println("Jumlah rasio luas " + luasrasio());
        System.out.println("Panjang yang anda inputkan : "+ getPanjang());
        System.out.println("Lebar yang anda inputkan : "+ getLebar());
    }
    
    boolean analisisbentukruang(){
        if(getPanjang()!= getLebar()){
            System.out.println(outanalisisbentukruang());
            return true;  
        }
        else{
            System.out.println(out1analisisbentukruang());
           return false;
        }
    }
    public static boolean outanalisisbentukruang(){
        System.out.println("luas ruang sesuai"); 
        return true;
    }
    public static boolean out1analisisbentukruang(){
        System.out.println("luas ruang tidak sesuai");
        return false;
    }
    
    
    
    
    boolean analisisrasioruang(){
        if(luasrasio > 0.5){
            System.out.println(outanalisisrasioruang());
           return true;
        }
        else{
            System.out.println(out1analisisrasioruang());
             return false;   
        }  
    }
    public static boolean outanalisisrasioruang(){
      System.out.println("Luas rasio kelas sesuai."); 
      return true;
    }
    public static boolean out1analisisrasioruang(){
       System.out.println("luas rasio kelas tidak sesuai");
        return false; 
    }
    
    
    
    boolean analispintudanjendela(){
        if(getJumlahPintu() >=2 && getJumlahJendela() >= 2){
            System.out.println(outanalispintudanjendela());
            return true;
        }
        else if(getJumlahPintu() >=2 && getJumlahJendela() <= 2){
            System.out.println(out1analispintudanjendela());
            return Boolean.FALSE;
        }
        else{
            System.out.println(out2analispintudanjendela());
            return false;
        }
    }
    
    public static boolean outanalispintudanjendela(){
      System.out.println("Jumlah pintu dan jendela sesuai."); 
      return true;
    }
    public static boolean out1analispintudanjendela(){
       System.out.println("Jumlah jendela sesuai, namun jendela tidak sesuai");
        return false; 
    }
      public static boolean out2analispintudanjendela(){
       System.out.println("Jumlah jendela dan pintu tidak sesuai.");
        return false; 
    }
}
