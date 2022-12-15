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
public class Daisy extends PlantBeraksi{
    private final String jenis;
    
    public Daisy(){
        super();
        jenis = "Daisy";
    }
    
    @Override
    public void cekKondisiTumbuh(){
        if(getJumlahAir() >=2 && getJumlahPupuk() >=1){
            tumbuh();
        }
    }
    
    @Override
    public void tumbuh(){
        if(getStatusTumbuh() <4){
            setJumlahAir(getJumlahAir() - 2);
            setJumlahPupuk(getJumlahPupuk() -1);
            setStatusTumbuh(getStatusTumbuh() +1);
        }
    }
    
    public String getJenis(){
        return jenis;
 }

}
