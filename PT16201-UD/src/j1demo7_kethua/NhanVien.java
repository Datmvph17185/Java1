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
public class NhanVien {

    public String hoTen;
    protected double luong;

    public NhanVien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public NhanVien(String hoTen) {
        this.hoTen = hoTen;
    }

    private double thueThuNhap() {
        return this.luong * 0.1;
    }

    void xuat() {
        System.out.println(" >> Họ và tên: " + this.hoTen);
        System.out.println(" >> Lương: " + this.luong);
        System.out.println(" >> Thuế thu nhập: " + this.thueThuNhap());
    }
    
}
