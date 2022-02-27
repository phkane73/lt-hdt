package lopDiem;
class SDdiem{
    public static void main(String[] args) {
        //Diem a
        diem a;
        a=new diem();
        a.khoiTao(3, 4);
        System.out.println("Toa do diem a");
        a.hienThi();
        System.out.println();
        //Diem b
        diem b = new diem();
        System.out.println("Nhap toa do diem b");
        b.nhap();
        System.out.println("RToa do diem b");
        b.hienThi();
        System.out.println();
        //Diem c
        diem c = new diem();
        c.khoiTao(-b.layGiaTriX(), -b.layGiaTriY());
        System.out.println("Toa do diem C la");
        c.hienThi();
        System.out.println();
        //Khoang cach tu B den O
        float kq = b.khoangCach();
        System.out.println("Khoang cach tu B den tam O la:"+kq);
        //Khoang cach tu A den B
        float kq1 = a.khoangCach(b);
        System.out.println("Khoang cach tu diem A den diem B la:"+ kq);
    }
}