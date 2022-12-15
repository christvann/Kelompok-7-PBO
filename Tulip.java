/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plant;
/**
 *
 * @author user
 */
public class Tulip extends PlantBeraksi {
    private final String jenis;
    public Tulip(){
        super();
        jenis = "Tulip";
    }
    
    @Override
    public void cekKondisiTumbuh(){
        if(getJumlahAir() >=3 && getJumlahPupuk() >=1){
            tumbuh();
        }
    }
    
    @Override
    public void tumbuh(){
        if(getStatusTumbuh() <4){
            setJumlahAir(getJumlahAir() - 3);
            setJumlahPupuk(getJumlahPupuk() -1);
            setStatusTumbuh(getStatusTumbuh() +1);
        }
    }
    
    public String getJenis(){
        return jenis;
 }

}
