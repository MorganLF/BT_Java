package kiemtragiuaki;

public class HocVien extends Nguoi  {
    private static int hoTen;
    private float diemMonhoc1;
    private float diemMonhoc2;
    private static int  soLuongHV;
    protected HocVien(String name, Float diemMonhoc1, Float diemMonhoc2,int soLuongHV){
        
        this.diemMonhoc1 = diemMonhoc1;
        this.diemMonhoc2 = diemMonhoc2;
        this.soLuongHV = soLuongHV;
    }
    
    int diemtrungbinh;
    protected double getDiemTrungBinh(){
        return (diemMonhoc1+diemMonhoc2)/2;

    }
    @Override
    public String toString(){
        return ("ho va ten: "+this.hoTen + "diem trung binh"+this.diemtrungbinh);
    }
}
