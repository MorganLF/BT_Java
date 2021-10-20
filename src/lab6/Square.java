package lab6;

public class Square {
    boolean click = false ;
    void click(){
        click = !click;
	}
    void play(){
        if(click==true){
            System.out.println("Rotate Around!!plss"); 
        }
        else
            System.out.println(" Stop!!Plss ");	
    }
    void changechannel(){
        if(click==true){
            System.out.println("Bluetooth mode");

        }
        else
        System.out.println("Standard!!plss");

    }
}
    

