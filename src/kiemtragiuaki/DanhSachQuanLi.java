package kiemtragiuaki;

public class DanhSachQuanLi {
    public static void main(String[] args) {
        Nguoi nguoi = new Nguoi(null, 0);
        Nguoi.Nhap();
        Nguoi.Xuat();
    int n;
    ArrayList<Nguoi> list = new ArrayList<Nguoi>();
        Object in;
        n = in.nextInt();
        for(int i=0;i<n;i++){
            Nguoi nguoi = new Nguoi(null, i);
            Nguoi.nhap();
            list.add(nguoi);
            System.out.println("số lương Người: ");
        }
        System.out.println("Thông Tin người:");
        for(Nguoi nguoi: list){
            Nguoi.Xuat();
        }
    }
}

