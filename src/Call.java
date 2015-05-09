/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author the 12
 */
public class Call {
    
    void utama(){
        Utama qaz=new Utama();
        qaz.inputawal();
        qaz.input();
        qaz.luas();
        qaz.luasrasio();
        qaz.tampil();
        qaz.analisisbentukruang();
        qaz.analisisrasioruang();
        qaz.analispintudanjendela();
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
