package lab7;



public class ShapeTestDrive {
    public static void main(String[] args) {
        Square square = new Square("oi ban oi");
        square.rotate();
        square.playSound();
        Circle circle = new Circle("lieu thi an nhieu");
        circle.rotate();
        circle.playSound();
        Triangle triangle = new Triangle("oi doi oi");
        triangle.rotate();
        triangle.playSound();
        Amoeba amoeba = new Amoeba("bruhhhhhh",45,90);
        amoeba.rotate();
        amoeba.playSound();

        
    }
    
}
