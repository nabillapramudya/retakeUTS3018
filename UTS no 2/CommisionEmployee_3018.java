/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.uts_no2_a_3018;

/**
 *
 * @author HP
 */
public class CommisionEmployee_3018 extends Employess_3018{
    public float Komisi;
    public float TotalPenjualan;
    public float Totalgaji;
    
    public CommisionEmployee_3018(){
        
    }
    
    public float TotalGaji(){
        Totalgaji = GajiPokok + (Komisi * TotalPenjualan);
        return Totalgaji;
    }
    
    public void TampilData(){
        System.out.println("Commission Employee");
        Tampil();
        System.out.println("Total Gaji: " + Totalgaji);
    }
}

