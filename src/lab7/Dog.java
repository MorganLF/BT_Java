package lab7;

public class Dog extends Jaws {
    Dog(String giongLoai,int tuoi, String noiSong){
        breed = giongLoai;
        age = tuoi;
        habitat =  noiSong;

    }

    protected void makeNoise(){
        System.out.println(" Gâu Gâu ! Cút ngay ko bố xin một miếng bây giờ");

    }
    protected void eat(){
        System.out.println(" Cơm chó ");

    }
    protected void sleep(){
        System.out.println(" Ngủ lúc nào chả đc");

    }
    protected void evolution(){
        System.out.println(" Evole thành cầy tơ bảy món in a day");
    }
    void chaseCat(){
        System.out.println("chạy hộ cái mồn lèo ơi");
    }
}
