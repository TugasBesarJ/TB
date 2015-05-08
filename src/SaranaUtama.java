
import java.util.Scanner;
public class SaranaUtama {
    String kondisibaik;
    String DipojokDanDekatDosen;
    String BerfungsiDanDekatDosen;
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
    String dibelakang_disamping;
    String SSID;
    int CCTV;
    String posisiCCTV;
    private String atapruangan;
    private String UMMhotspot;
    private String depan_belakang;

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public int getCCTV() {
        return CCTV;
    }

    public void setCCTV(int CCTV) {
        this.CCTV = CCTV;
    }

    public int getKipasAngin() {
        return KipasAngin;
    }

    public void setKipasAngin(int KipasAngin) {
        this.KipasAngin = KipasAngin;
    }

    public int getLampu() {
        return Lampu;
    }

    public void setLampu(int Lampu) {
        this.Lampu = Lampu;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public int getSteker() {
        return Steker;
    }

    public void setSteker(int Steker) {
        this.Steker = Steker;
    }

    public int getKabelLCD() {
        return kabelLCD;
    }

    public void setKabelLCD(int kabelLCD) {
        this.kabelLCD = kabelLCD;
    }

    public String getKondisiAC() {
        return kondisiAC;
    }

    public void setKondisiAC(String kondisiAC) {
        this.kondisiAC = kondisiAC;
    }

    public String getKondisiKabelLCD() {
        return kondisiKabelLCD;
    }

    public void setKondisiKabelLCD(String kondisiKabelLCD) {
        this.kondisiKabelLCD = kondisiKabelLCD;
    }

    public String getKondisiKipasAngin() {
        return kondisiKipasAngin;
    }

    public void setKondisiKipasAngin(String kondisiKipasAngin) {
        this.kondisiKipasAngin = kondisiKipasAngin;
    }

    public String getKondisiLampu() {
        return kondisiLampu;
    }

    public void setKondisiLampu(String kondisiLampu) {
        this.kondisiLampu = kondisiLampu;
    }

    public String getKondisiSteker() {
        return kondisiSteker;
    }

    public void setKondisiSteker(String kondisiSteker) {
        this.kondisiSteker = kondisiSteker;
    }

    public String getPosisiAC() {
        return posisiAC;
    }

    public void setPosisiAC(String posisiAC) {
        this.posisiAC = posisiAC;
    }

    public String getPosisiCCTV() {
        return posisiCCTV;
    }

    public void setPosisiCCTV(String posisiCCTV) {
        this.posisiCCTV = posisiCCTV;
    }

    public String getPosisiKabelLCD() {
        return posisiKabelLCD;
    }

    public void setPosisiKabelLCD(String posisiKabelLCD) {
        this.posisiKabelLCD = posisiKabelLCD;
    }

    public String getPosisiKipasAngin() {
        return posisiKipasAngin;
    }

    public void setPosisiKipasAngin(String posisiKipasAngin) {
        this.posisiKipasAngin = posisiKipasAngin;
    }

    public String getposisiLampu() {
        return posisiLampu;
    }

    public void setposisiLampu(String posisiLampu) {
        this.posisiLampu = posisiLampu;
    }

    public String getPosisiSteker() {
        return posisiSteker;
    }

    public void setPosisiSteker(String posisiSteker) {
        this.posisiSteker = posisiSteker;
    }
    public String getkondisiLampu(){
        return kondisiLampu;
    }
    
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
     boolean Steker(){
        if(getSteker()>= 4){
            System.out.println("jumlah sesuai");
        }
        else{
            System.out.println("jumlah tidak sesuai");
        }
        return true;
      }
      boolean PosisiSteker(){
        if(getPosisiSteker() == DipojokDanDekatDosen ){
            System.out.println("posisi sesuai.");
        }
        else{
            System.out.println("posisi tidak sesuai");
        }
        return true;
      }
      boolean KabelLCD(){
          if(getKabelLCD()>=1){
             System.out.println("Jumlah Sesuai");
          }
          else{
              System.out.println("Jumlah tidak sesuai");
          }
          return true;
      }
      boolean PosisiKabelLCD(){
          if(getPosisiKabelLCD().equals(BerfungsiDanDekatDosen)){
              System.out.println("Berfungsi");
          }
          else{
              System.out.println("Tidak Berfungsi");
          }
          return true;
      }
      boolean Lampu(){
          if(getLampu()>=18){
              System.out.println("Jumlah Sesuai ");
          }
          else{
              System.out.println("jumkah tidak sesuai");
          }
          return true;
      }
      boolean kondisiLampu(){
          if(getKondisiLampu()== kondisibaik){
              System.out.println("Sesuai");              
          }
          else{
              System.out.println("Tidak sesuai");
          }
          return true;
      }
      
      boolean posisiLampu(){
          if(getposisiLampu() == atapruangan){
              System.out.println("Sesuai");
          }
          else{
              System.out.println("Tidak Sesuai");
          }
          return true;
      }
      boolean KipasAngin(){
          if(getKipasAngin()>=2){
              System.out.println("sesuai");
          }
          else{
              System.out.println("Tidak sesuai");
          }
          return true;
      }
      boolean posisiKipasAngin(){
          if(getPosisiKipasAngin()== atapruangan){
              System.out.println("Sesuai");
          }
          else{
              System.out.println("Tidak sesuai");
          }
          return true;
      }
      boolean AC(){
          if(getAC()>=1){
              System.out.println("Sesuai");
          }
          else{
              System.out.println("Tidak sesuai");
          }
          return true;
      }
      boolean posisiAC(){
          if(getPosisiAC().equals(dibelakang_disamping)){
              System.out.println("Sesuai");
          }
          else{
              System.out.println("Tidak sesuai");
          }
          return true;
      }
      boolean SSID(){
          if(getSSID()==UMMhotspot){
              System.out.println("Sesuai");
          }
          else{
              System.out.println("Tidak sesuai");
          }
          return true;
      }
      boolean CCTV(){
          if(getCCTV()==2){
             System.out.println("Sesuai"); 
          }
          else{
              System.out.println("Tidak Sesuai");
          }
          return true;
      }
      boolean PosisiCCTV(){
          if(getPosisiCCTV()==depan_belakang){
              System.out.println("Sesuai");
          }
          else{
              System.out.println("Tidak sesuai");
          }
          return true;
      }
}
