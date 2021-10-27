package lab7;

public class Cat extends SharpeningClaws {
    Cat(String giongLoai,int canNang,int tuoi){
        giongLoai = breed;
        canNang = weight;
        tuoi = age;

    }
    protected void makeNoise(){
        System.out.println(" mèo méo meo mèo meo meo meo ");
    }
    protected void eat(){
        System.out.println(" cơm cho quý sờ tộc ");
    }
    protected void sleep(){
        System.out.println(" ngủ cả ngày !Useless ");
    }
    protected void evolution(){
        System.out.println(" mồn lèo dô dụng "); 
    } 
}
