package lab7;

public class Bat extends Wings {
    Bat(String giongLoai,int tuoi,int canNang) {
        giongLoai = breed;
        tuoi = age;
        canNang = weight;


    } 

    protected void makeNoise(){
        System.out.println(" i'm batman ");

    }
    protected void sleep(){
        System.out.println(" ngủ trong biệt thự ");
    }
    protected void roam(){
        System.out.println(" dạo quanh gotham city kiếm tk trúa hề ");

    }
    protected void evolution(){
        System.out.println(" become the true bat :) ");
    }
    void status(){
        System.out.println("i'm rich");
    }

}
