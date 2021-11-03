package lab8;

public class HinhChuNhat {
    public class ChuNhat {
        private double a;
        private double b;
    
        public ChuNhat(double a, double b) {
            this.a = a;
            this.b = b;
        }
        public void xuat() {
            System.out.println("Chieu dai: "+a);
            System.out.println("Chieu rong: "+ b);
            System.out.println("Chu vi: ("+ a +"+"+b+")*2 = "+getChuVi());
            System.out.println("Dien tich: "+a +"*"+b+"= "+getDienTich());
        }
        protected double getChuVi() {
            return (a+b)*2;
        }
        protected double getDienTich() {
            return a*b;
        }
        protected double geta() {
            return a;
        }
        protected double getb() {
            return b;
        }
    }

    public void xuat() {
    }
    
}
