package lopMyDate;

import java.util.Scanner;

class SDmyDate{
    public static void main(String[] args) {
        myDate d1 = new myDate();
        d1.nhap();
        d1.hienThi();
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = kb.nextInt();
        System.out.println("Ket qua la: ");
        d1.congNgay(n).hienThi();
    }
}