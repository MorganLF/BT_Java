package lab8;

public class SinhVienANTT extends SinhVien {
    private double speaking;
    private double writing;
    private double listening;
    public SinhVienANTT(String hoTen, double speaking, double writing, double listening) {
        super(hoTen, hoTen);
        this.speaking = speaking;
        this.writing = writing;
        this.listening = listening;
    }
    protected double getDiem() {
        return (2*speaking+writing+listening)/4;
    }
}
    

