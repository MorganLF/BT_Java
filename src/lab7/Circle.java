package lab7;

public class Circle {
    String sound;
    Circle(){}
    public Circle(String s){
        sound = s  ;
    }
    void rotate(){
        System.out.println("Roll around 360 Degree:");
    }
    void playSound(){
        System.out.println(" Play soundfile's name:"+ sound);
    }

    
}
