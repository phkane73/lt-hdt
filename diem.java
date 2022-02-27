package lopDiem;
import java.util.Scanner;

class diem{
    private int x;
    private int y;
    //Cac ham xay dung
    public diem(){
        x=y=0;
        System.out.println("Hello!!");
    }
    
    public diem(int a) {
            x=y=a;
    }
    public diem(int g, int h){
        x=g;
        y=h;
    }
    //Dinh nghia cac phuong thuc

    public void khoiTao(int g, int h) {
        x=g;
        y=h;
    }

    public void hienThi(){
        System.out.println("("+x+","+y+")");
    }

    public void nhap(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap hoanh do");
        x= kb.nextInt();
        System.out.println("Nhap tung do");
        y= kb.nextInt();
    }

    public void doiDiem(int dx, int dy){
        x+=dx;
        y+=dy;
    }

    public int layGiaTriX(){
        return x;
    }
    public int layGiaTriY(){
        return y;
    }

    public float khoangCach(){
        float kq =0;
        kq = (float)Math.sqrt(x*x+y*y);
        return kq;
    }

    public float khoangCach(diem d){
        float kq;
        kq = (float)Math.sqrt((d.x*d.x - x*x)+(d.y*d.y - y*y));
        return kq;
    }
    
}