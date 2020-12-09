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
public class TruongPhong extends NhanVien {

    public double trachNhiem;

    public TruongPhong(double trachNhiem, String hoTen, double luong) {
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(double trachNhiem, String hoTen) {
        super(hoTen);
        this.trachNhiem = trachNhiem;
    }

    public void xuat() {
        super.xuat();
        System.out.println(" >> Trách nhiệm: " + trachNhiem);
    }
}
