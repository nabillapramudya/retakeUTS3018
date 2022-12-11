/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.uts_no2_a_3018;

/**
 *
 * @author HP
 */
public class ProjectPlan_3018 extends Employess_3018{
    public float Komisi;
    public float TotalHslProyek;
    public double Totalgaji;
    
    public ProjectPlan_3018(){
        
    }
            
    public double TotalGaji(){
        Totalgaji = GajiPokok + (Komisi * TotalHslProyek) - (GajiPokok*5/100);
        return Totalgaji;
    }
    
    public void TampilData(){
        System.out.println("Project Plannner");
        Tampil();
        System.out.println("Total Gaji: " + Totalgaji);
    }
}

