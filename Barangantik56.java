/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barangantik56;

/**
 *
 * @author User
  * Nama : Bintang Fajar Nusantara
 * Nim : 22205028
 * Prodi : Teknik Informatika
 */
public class Barangantik56 {

    int umur;
    
    public Barangantik56 (int umur){
      this.umur = umur;  
    }
    
    public void tampilUmur(){
        System.out.println("Umur Barang Antik ini adalah : " +umur+ " tahun ");
        
}

}

class Radio extends Barangantik56 {
    private String name;

    public Radio(int umur){
        super(umur);
        this.umur = umur;
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
}
    class Main {
    public static void main(String[] args) {
        Radio rdo = new Radio(234);
        rdo.setName("Radio AM");
        System.out.println("Nama Barang Antik : " + rdo.getName());
        rdo.tampilUmur();

    }
    
}
