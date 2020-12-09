/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1demo7_kethua;

/**
 *
 * @author minhdq
 */
public class J1Demo7_KeThua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv = new NhanVien("Minh", 5.0);
        nv.xuat();
        
        System.out.println("Trưởng phòng");
        TruongPhong tp = new TruongPhong(30000, "minh", 10000);
        tp.xuat();
    }
    
}
