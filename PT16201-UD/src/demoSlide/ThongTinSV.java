/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoSlide;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ThongTinSV {

    static Scanner sc = new Scanner(System.in);
    private static ArrayList<SinhVien> listSV = new ArrayList<>();
    public void menu() {

        while (true) {
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên theo khoảng điểm");
            System.out.println("4. Tìm sinh viên theo tên");
            System.out.println("5. Sửa điểm SV theo tên");
            System.out.println("6. Xoá SV theo tên");
            System.out.println("7. SX theo tên");
            System.out.println("0. Kết thúc");

            System.out.print(">> Chọn chức năng: ...  ");
            int so = sc.nextInt();
            System.out.println("======================");
            sc.nextLine();

            switch (so) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatTheoDiem();
                    break;
                case 4:
                    timTheoTen();
                    break;
                case 5:
                    sua();
                    break;
                case 6:
                    xoa();
                    break;
                case 7:
                    sapXepTheoTen();
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Vui lòng chọn số từ 0 đến 6!");
                    break;
            }
        }
    }
    public void nhap() {
        System.out.println("NHẬP DANH SÁCH SINH VIÊN");
        while (true) {
            System.out.print("Nhập tên: ");
            String ten = sc.nextLine();
//              if (ten.isEmpty() || ten.equals("\n")){
//                System.out.println("Its empty");
//                break;
//            } else {
//                System.out.println("wrong input.");
//            }
            System.out.print("Nhập điểm: ");
            double diem = Double.parseDouble(sc.nextLine());
            
            SinhVien sv = new SinhVien(ten, diem);
            listSV.add(sv);
            
            // tiếp hay ko ?
            System.out.print("Nhập tiếp (Y/N)? ");
            if (sc.nextLine().equals("N")) {
                break;
            }

        }

    }

    public void xuat() {
        System.out.println("XUẤT DANH SÁCH SINH VIÊN");
        int i = 1;
        for (SinhVien a : listSV) {
            System.out.printf("SV %d: ", i);
            System.out.println(a);
            i++;
        }
        
//        listSV.forEach((xxx) -> {
//            System.out.println(xxx);
//        }
//        );
        
        System.out.println("======================");
    }

    public void xuatTheoDiem() {
        System.out.println("TÌM KIẾM SINH VIÊN THEO ĐIỂM");
        System.out.print("Điểm min: ");
        double min = sc.nextDouble();
        System.out.print("Điểm max: ");
        double max = sc.nextDouble();
        for (SinhVien sv : listSV) {
            if (sv.getDiem() >= min && sv.getDiem() <= max) {
                System.out.println(sv.toString());
            }
        }
        System.out.println("======================");
    }

    public void timTheoTen() {
        System.out.println("TÌM KIẾM SINH VIÊN");
        System.out.print("Tên sinh viên: ");
        String name = sc.nextLine();

        for (SinhVien sv : listSV) {
            if (sv.getTen().equalsIgnoreCase(name)) {
                System.out.println(sv);
            }
        }
        System.out.println("======================");
    }

    public void sua() {
        System.out.println("update THÔNG TIN SINH VIÊN");
        System.out.print("Tên sinh viên: ");
        String name = sc.nextLine();

        for (SinhVien sv : listSV) {
            if (sv.getTen().equalsIgnoreCase(name)) {
                System.out.print("Nhập điểm mới: ");
                sv.setDiem(Double.parseDouble(sc.nextLine()));
//                sc.nextLine();
            }
        }
        System.out.println("======================");
    }

    public void xoa() {

        System.out.println("XÓA SINH VIÊN");
        System.out.print("Tên sinh viên: ");
        String name = sc.nextLine();

        for (SinhVien sv : listSV) {
            if (sv.getTen().equalsIgnoreCase(name)) {
                listSV.remove(sv);
                break;
            }
        }
        System.out.println("======================");
    }

    public void xoaTheoViTri() {
        System.out.println("XÓA SINH VIÊN");
        System.out.print("Nhập vị trí cần xóa:  ");
        int vitri = sc.nextInt();
        listSV.remove(vitri - 1);
        System.out.println("======================");
    }

    public void sapXepTheoTen() {
        Comparator<SinhVien> comp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o2, SinhVien o1) {
                return o1.getTen().compareTo(o2.getTen());
            }
        };
        Collections.sort(listSV, comp);
        for (SinhVien xxx : listSV) {
            System.out.println(xxx.toString());
        }
        System.out.println("======================");
    }
    public void sortName() {
        // giảm dòng code, bỏ tiêu chí vào trong luôn
        Collections.sort(listSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        for (SinhVien xxx : listSV) {
            System.out.println(xxx.toString());
        }
    }
    public void sortDiem() {
        // giảm dòng code, bỏ tiêu chí vào trong luôn
        Collections.sort(listSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.getDiem(), o2.getDiem());
//                return o1.getDiem().compareTo(o2.getDiem());
            }
        });
        for (SinhVien xxx : listSV) {
            System.out.println(xxx.toString());
        }
    }
}
