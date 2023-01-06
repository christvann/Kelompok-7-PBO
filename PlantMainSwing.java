/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Thread;

/**
 *
 * @author User
 */
public class plantmainswing {
    private int jenis;
    private String namaJenis;
    private JFrame frame;
    private JLabel label;
    private JLabel jumlahAir;
    private JLabel jumlahPupuk;
    private JButton Tulip;
    private JButton Daisy;
    private JButton Lilac;
    private JButton back;
    private JButton btnBeriAir;
    private JButton btnBeriPupuk;
    private JTextField txtJenis;
    private JTextField txtDisplay;
    private ImageIcon plantIcon;
    private PlantBeraksi p;
public plantmainswing()
{
    p = new PlantBeraksi();
    createAndShowGUI();
    setPlantImage();
}
private void createAndShowGUI()
{
    frame = new JFrame("WELCOME TO GARDEN KELOMPOK 7");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    //Masukkan background
    JLabel background = new JLabel("");
    ImageIcon gambar = createImageIcon("/plant/background.png","gambar");
    background.setIcon(gambar);
    background.setBounds(200,100,500,700);
    frame.setContentPane(background); //menambah content ke frame
    
    txtJenis = new JTextField("");
        txtJenis.setBounds(20,70,150,30); //mengatur posisi
        txtJenis.setOpaque(true);
        txtJenis.setEditable(false);
        txtJenis.setBackground(Color.WHITE); //mengatur warna background
        txtJenis.setHorizontalAlignment(SwingConstants.CENTER); //agar text ditengah
        frame.getContentPane().add(txtJenis);
    //menambahkan button tulip
    Tulip = new JButton("Tulip");
    Tulip.setBounds(20,10,100,30); //mengatur posisi button tulip
    frame.getContentPane().add(Tulip); //menambahkan content ke frame
    
    //menambahkan button daisy
        Daisy = new JButton("Daisy");
        Daisy.setBounds(210,10,100,30); //mengatur posisi button daisy
        frame.getContentPane().add(Daisy); //menambahkan content ke frame
        
        //menambhkan button lilac
        Lilac = new JButton("Lilac");
        Lilac.setBounds(370,10,100,30); //mengatur posisi button lilac 
        frame.getContentPane().add(Lilac);
//Add label
    label = new JLabel("");
    label.setBounds(184, 50, 150, 150);
    frame.getContentPane().add(label);
    //Add button
    btnBeriAir = new JButton("Beri Air");
    btnBeriPupuk = new JButton("Beri Pupuk");
    btnBeriAir.setBounds(350, 130, 100, 30);
    btnBeriPupuk.setBounds(350, 90, 100, 30);
    frame.getContentPane().add(btnBeriAir);
    frame.getContentPane().add(btnBeriPupuk);
    
    //memasukkan text jumlah air
        jumlahAir = new JLabel("<html><span style='font-size:10px'>Jumlah Air : "+p.getJumlahAir()+"</span></html>");
        jumlahAir.setBounds(20,190,150,30); //mengatur posisi
        jumlahAir.setOpaque(true);
        jumlahAir.setBackground(Color.WHITE); //mengatur warna background
        frame.getContentPane().add(jumlahAir); //menambahkan content ke frame
        
        //memasukkan text jumlah pupuk
        jumlahPupuk = new JLabel("<html><span style='font-size:10px'>Jumlah Pupuk : "+p.getJumlahPupuk()+"</span></html>");
        jumlahPupuk.setBounds(20,220,150,30); //mengatur posisi
        jumlahPupuk.setOpaque(true);
        jumlahPupuk.setBackground(Color.WHITE); //mengatur warna background
        frame.getContentPane().add(jumlahPupuk); //menambahkan content ke frame
        //memasukkan button untuk mereset
        back = new JButton("Ambil");
        frame.getContentPane().add(back); //menambhkan content ke frame
        back.setBounds(350, 210, 100, 30); //mengatur posisi
        back.setVisible(true);
        //Add text
        txtDisplay = new JTextField("HASIL");
        txtDisplay.setBounds(190,210,139,30);
        txtDisplay.setEditable(false);
        txtDisplay.setOpaque(true);
        txtDisplay.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(txtDisplay);
     //Add action listener
        btnBeriAir.addActionListener(new ActionListener() {
            @Override
    public void actionPerformed(ActionEvent e)
    {
    btnBeriAir_actionPerformed(e);
    }
    });
        Tulip.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e)
        {
            Tulip_actionPerformed(e);
        }

            private void Tulip_actionPerformed(ActionEvent e) {
                txtJenis.setText("Tulip");
                
                //munculkan menu selanjutnya
                setPlantImage();
            }
    });
        //menambahkan action listener untuk daisy
        Daisy.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Daisy_actionPerformed(e);
        }

            private void Daisy_actionPerformed(ActionEvent e) {
                txtJenis.setText("Daisy");
                
                //munculkan menu selanjutnya
                setPlantImage();
            }
    });
        //menambahkan action listener untuk lilac
        Lilac.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Lilac_actionPerformed(e);
        }
            
            private void Lilac_actionPerformed(ActionEvent e) {
                txtJenis.setText("Lilac");
                
                //munculkan menu selanjutnya
                setPlantImage();
            }
    });
        //memasukkan add action listener tombol kembali ke menu utama
        back.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e)
        {
        back_actionPerformed(e);
        }
        private void back_actionPerformed(ActionEvent e)
        {
            //reset status tumbuh, air, dan pupuk
            txtDisplay.setText("HASIL");
            txtJenis.setText("");
            jumlahAir.setText("Jumlah Air : 0");
            jumlahPupuk.setText("Jumlah Pupuk : 0");
            
        }
    });
    btnBeriPupuk.addActionListener(new ActionListener()
    {
        @Override
    public void actionPerformed(ActionEvent e) {
    btnBeriPupuk_actionPerformed(e);
    }
    });
    //Display the window
    frame.setSize(500,300);
    frame.setVisible(true);
    }
    private void btnBeriAir_actionPerformed(ActionEvent e){
    System.out.println("beri air");
     p.beriAir();
    txtDisplay.setText(p.getStatusTumbuhText());
    jumlahAir.setText("Jumlah Air :"+p.getJumlahAir());
    
    setPlantImage();
    
    }
    private void btnBeriPupuk_actionPerformed(ActionEvent e){
    System.out.println("beri pupuk");
    p.beriPupuk();
    txtDisplay.setText(p.getStatusTumbuhText());
    jumlahPupuk.setText("Jumlah Pupuk :"+p.getJumlahPupuk());
    
    setPlantImage();
    
    }
    protected ImageIcon createImageIcon(String path, String
    description) {
    java.net.URL imgURL = getClass().getResource(path);
    if (imgURL != null) {
    return new ImageIcon(imgURL, description);
    } else {
    System.err.println("Couldn't find file: " + path);
    return null;
    }
    }
    private void setPlantImage()
    {
    plantIcon = createImageIcon(p.getImagePath(),
    p.getStatusTumbuhText());
    label.setIcon(plantIcon);
    }
    public static void main(String[] args)
    {
    javax.swing.SwingUtilities.invokeLater(new
    Runnable(){
        @Override
    public void run(){
    plantmainswing uGardenApp = new
    plantmainswing();
    }
    });
    }
}
