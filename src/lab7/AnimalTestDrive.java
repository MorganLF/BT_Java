package lab7;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog("Rotweiler" , 9, "Germany");
        dog.makeNoise();
        dog.eat();
        dog.sleep();
        dog.evolution();
        dog.chaseCat();
        Cat cat = new Cat ("hang VN",7,2);
        cat.makeNoise();
        cat.eat();
        cat.sleep();
        cat.evolution();
        Bat bat = new Bat("Amoured-Bat", 82 , 49);
        bat.makeNoise();
        bat.sleep();
        bat.roam();
        bat.evolution();
        Hippo hippo=new Hippo(" đầm lầy", 7, 79);
        hippo.makeNoise();
        hippo.sleep();
        hippo.roam();

    }
    

    


    
}
