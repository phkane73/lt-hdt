package lopMyDate;

import java.util.Scanner;

public class myDate {
    private int ngay;
    private int thang;
    private int nam;
    //Cac ham xay dung
    public myDate(){
        ngay =7;
        thang =3;
        nam =2002;
    }

    public myDate(int d,int m, int y){
        ngay = d;
        thang =m;
        nam =y;
    }
    //Dinh nghia cac phuong thuc
    public void hienThi(){
        System.out.println(ngay+"/"+thang+"/"+nam);
    }

    public void nhap(){
        Scanner kb = new Scanner(System.in);
        while (true){
            System.out.println("Nhap ngay:");
            ngay = kb.nextInt();
            System.out.println("Nhap thang:");
            thang = kb.nextInt();
            System.out.println("Nhap nam");
            nam = kb.nextInt();
            if (hopLe()) break;
            System.out.println("Khong hop le - Nhap lai !!!");
            
        }
    }
    public boolean hopLe(){
        if (ngay <= 0 || thang <= 0|| thang >12)
            return false;
        if (thang == 2 && (nam%4==0)&&(nam%400==0&&nam%100==0))
            return (ngay<=29);
        int songaymax[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
            return (ngay <= songaymax[thang]);
    }
    public myDate ngayMai(){
        myDate kq = new myDate(ngay,thang,nam);
        if(thang==2 &&(nam%4==0)&&(nam%400==0&&nam%100==0))
            return new myDate(29,2,nam);
        kq.ngay++;
        int songaymax[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(kq.ngay>songaymax[kq.thang]){
            kq.ngay =1;
            kq.thang++;
        }
        if(kq.thang>12){
            kq.nam++;
            kq.thang=1;
        }
        return kq;
    }
    public myDate congNgay(int n){
        myDate kq = new myDate(ngay, thang, nam);
        for(int i=0;i<=n;i++){
            kq=kq.ngayMai();
        }
        return kq;
    }

    public int layGiaTriNgay(){
        return ngay;
    }
    public int layGiaTriThang(){
        return thang;
    }
    public int layGiaTriNam(){
        return nam;
    }
}
