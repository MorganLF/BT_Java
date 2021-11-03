package lab8;

public class SinhVienIOT extends SinhVien {
    private double diemJava;
    private double diemHtml;
    private double diemCss;
    protected SinhVienIOT(String name,double diemJava,double diemCss,double diemHtml){
        super(name,"IOT");
        this.diemCss=diemCss;
        this.diemHtml=diemHtml;
        this.diemJava=diemJava;
    }
    @Override
    protected double getDiem() {
        return (2*diemJava+diemCss+diemHtml)/4;
    }
       
}
    

