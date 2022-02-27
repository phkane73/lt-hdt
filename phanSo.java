package phanSo;

import java.util.Scanner;

public class phanSo {
    private int tuso;
    private int mauso;
    // Cac ham xay dung
    public phanSo(){
        tuso=1;
        mauso=1;
    }

    public phanSo(int x, int y){
        tuso=x;
        mauso=y;
    }

    //Cac phuong thuc
    public void nhap(){
        while(true){
            Scanner kb = new Scanner(System.in);
            System.out.println("Nhap tu so");
            tuso = kb.nextInt();
            System.out.println("Nhap mau so");
            mauso = kb.nextInt();
            if(hopLe()) break;
            System.out.println("Khong hop le - Nhap lai !!!");
        }
    }

    public boolean hopLe(){
        if(mauso==0)
            return false;
        return true;
    }

    public void hienThi(){
        if(tuso==0)
            System.out.println("0");
        if(mauso==1)
            System.out.println(tuso);
        if ((tuso!=0)&&(mauso!=1))
            System.out.println(tuso+"/"+mauso);
    }

    public void nghichDao(){
        int t;
        t=tuso;
        tuso=mauso;
        mauso=t;
    }

    public phanSo giaTriNghichDao(){
        phanSo kq = new phanSo(tuso,mauso);
        int t;
        t=tuso;
        tuso=mauso;
        mauso=t;
        kq.tuso=tuso;
        kq.mauso=mauso;
        return kq;
    }

    

    

}
