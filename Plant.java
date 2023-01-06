package plant;

import java.util.Scanner;

public class Plant {

   
    public static void main(String[] args) {
        //Plant p = new Plant();
        Tulip p = new Tulip();
        Daisy b = new Daisy();
        Lilac c = new Lilac();
             
        Scanner sc = new Scanner(System.in);
        int inp = 0;
        do{
            System.out.println("Masukkan : 0 untuk memberi air, 1 untuk memberi pupuk, 2 untuk keluar");
            inp = sc.nextInt();
            switch(inp){
                case 0 : p.beriAir();
                break;
                case 1 : p.beriPupuk();
                break;
            }
            p.displayPlant();
        }while (inp!=2);

    }
}
