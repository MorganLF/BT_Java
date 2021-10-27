package lab7;

public class Amoeba extends Shape {
    String sound;
    int x;
    int y;
    Amoeba(){}
    public Amoeba(String s){
        sound = s;

    }
    public Amoeba(String s, int xx, int yy){
        sound = s;
        x= xx;
        y= yy;

    }
    void rotate(){
        System.out.println("Xoay theo tọa độ x= " + x + "và y = " + y);

    }
    void playSound(){
        System.out.println("Play soundfile'name :" + sound);

    }
    
}
