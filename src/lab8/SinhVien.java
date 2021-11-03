package lab8;

public class SinhVien {
    private String hoTen;
        private String nganh;
    
        public SinhVien(String hoTen, String nganh) {
            this.hoTen = hoTen;
            this.nganh = nganh;
        }
        protected double getDiem() {
            return getDiem();
        }
        protected void getHocLuc() {
            if (getDiem()<5)
                System.out.println("Hoc luc D");
            else 
                    if (getDiem()>=4 && getDiem() <=6.5)
                        System.out.println("Hoc luc C");
                    else 
                        if (getDiem() >= 6.5 && getDiem() <= 7.5)
                            System.out.println("Hoc luc B");
                        else
                            if (getDiem()>= 7.5 && getDiem() <= 9)
                                System.out.println("Hoc sinh A");
                            else 
                                if (getDiem() > 9 )
                                    System.out.println("Hoc sinh A+");
        }
    }
    

