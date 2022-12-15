/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garden;

/**
 *
 * @author User
 */
public class Plant {
    private int statusTumbuh;
    private int jumlahAir;
    private int jumlahPupuk;
    public Plant(){
        statusTumbuh = 0;
        jumlahAir = 0;
        jumlahPupuk = 0;
    }
    
    public int getJumlahAir(){
        return jumlahAir;
    }
    
    public void setJumlahAir (int n){
        jumlahAir = n;
    }
    public int getJumlahPupuk(){
        return jumlahPupuk;
    }
    
    public void setJumlahPupuk(int n){
        jumlahPupuk = n;
    }
    
    public void setStatusTumbuh(int n){
        statusTumbuh = n;
    }
    
    public void beriAir(){
        jumlahAir++;
        cekKondisiTumbuh();
    }
    
    public void beriPupuk(){
        jumlahPupuk++;
        cekKondisiTumbuh();
    }
    
    public void cekKondisiTumbuh(){
        if(jumlahAir >=3 && jumlahPupuk >=1){
            tumbuh();
        }
    }
    
    public void tumbuh(){
        if(statusTumbuh <4){
            jumlahAir = jumlahAir - 3;
            jumlahPupuk = jumlahPupuk -1;
            statusTumbuh++;
        }
    }
    
    public void displayPlant(){
        System.out.println(getStatusTumbuhText());
        System.out.println("Jumlah Air :" + jumlahAir);
        System.out.println("Jumlah Pupuk :" + jumlahPupuk);
    }
    
    public String getStatusTumbuhText(){
        switch(statusTumbuh){
            case 0: return "Benih";
            case 1: return "Tunas";
            case 3: return "Tanaman Dewasa";
        }
        return "Berbunga";
    }
    
    public int getStatusTumbuh(){
        return statusTumbuh;
    }
    
    public String getImagePath(){
        String tImagePath = "img/seed.png";
        switch(statusTumbuh){
            case 0:tImagePath="img/seed.png";break;
            case 1:tImagePath="img/sprout.png";break;
            case 2:tImagePath="img/big.png";break;
            case 3:tImagePath="img/blossom.png";break;
        }
        return tImagePath;
    }
}
