/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo4_OOP;

/**
 *
 * @author minhdq
 */
public class main {
    public static void main(String[] args) {
        // khai báo và khởi tạo 1 đối tượng laptop
        Laptop lt = new Laptop();
        // gán gtri cho thuộc tính của đối tượng lt
        lt.price = -23;
        lt.setPrice(32);
        lt.setBrand("OK bay by");
        
        System.out.println(lt.getBrand());
        System.out.println(lt.getPrice());
        
//        System.out.println(lt.hangSX);
//        
//        Laptop lt2 = new Laptop(2016);
//        lt2.mauSac = "xi đèn đèn";
//        lt2.xemVideo();
//        lt2.goNatPhim();
//        
//        Laptop lt3 = new Laptop("đen", 2020, "Apple");
//        System.out.println("====");
//        lt.xuat();
//        
//        System.out.println(lt);
//        
//        System.out.println(lt2);
//        System.out.println(lt3);
    }
}
