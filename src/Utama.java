
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
        super.setNamaRuang(in.nextLine());
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
    
    boolean analisisluasruang(){
        if(getPanjang()!= getLebar()){
            System.out.println("Bentuk ruangan persegi panjang dan sesuai.");
        }
        else{
            System.out.println("Bentuk kelas persegi dan tidak sesuai.");
        }
        return true;
    }
    
    boolean analisisbentukruang(){
        if(luasrasio > 0.5){
            System.out.println("Luas rasio kelas anda sesuai.");
        }
        else{
            System.out.println("Luas rasio kelas anda tidak sesuai");
        }
        return true;
    }
    
    boolean analisisrasioruang(){
        if(getJumlahPintu() >=2 && getJumlahJendela() >= 2){
            System.out.println("Jumlah pintu dan jendela sesuai.");
        }
        else if(getJumlahPintu() >=2 && getJumlahJendela() <= 2){
            System.out.println("Jumlah jendela sesuai, namun jendela tidak sesuai");
        }
        else{
            System.out.println("Jumlah jendela dan pintu tidak sesuai.");
        }
        return true;
    }
    
    void sarana(){
    SaranaUtama qaz  = new SaranaUtama();
    qaz.masuk();
    qaz.Steker();
    qaz.PosisiSteker();
    qaz.KabelLCD();
    qaz.PosisiKabelLCD();
    qaz.Lampu();
    qaz.kondisiLampu();
    qaz.posisiLampu();
    qaz.KipasAngin();
    qaz.posisiKipasAngin();
    qaz.AC();
    qaz.posisiAC();
    qaz.SSID();
    qaz.CCTV();
    qaz.PosisiCCTV();
    
}
    void kondisi(){
        kondisiKelas exe = new kondisiKelas();
        exe.inputawal4();
        exe.analisiskebersihan1();
        exe.analisiskebersihan2();
        exe.analisiskebersiahan3();
        exe.analisiskebersihan4();
        exe.analisiskebersiahan5();
                
    }
    void kebersihan(){
        kebersihanRuang qwe=new kebersihanRuang();
        qwe.inputawal2();
        qwe.analisissirkulasiudara();
        qwe.analisispencahayaan();
        qwe.analisiskelembapan();
        qwe.analisissuhu();
    }
    void kondisikelas(){
        kondisiKelas qaz=new kondisiKelas();
        qaz.inputawal4();
        qaz.analisiskebersihan1();
        qaz.analisiskebersihan2();
        qaz.analisiskebersiahan3();
        qaz.analisiskebersihan4();
        qaz.analisiskebersiahan5();
    }
    void kenyamanan(){
        kenyamananRuang qaz=new kenyamananRuang();
        qaz.inputawal3();
        qaz.analisiskebisingan();
        qaz.analisisbau();
        qaz.analisiskebocoran();
        qaz.analisiskerusakan();
        
    }
    void keamanan(){
        keamananRuang qaz=new keamananRuang();
        qaz.inputawal2();
        qaz.analisiskekokohan();
        qaz.analisiskuncipintudanjendela();
        qaz.analisiskeamananruang();
    }
}
