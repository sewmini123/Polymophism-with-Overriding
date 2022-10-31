public class Friends {
    void friend(){
        System.out.println("My friends");
    }
}
class Kamal extends Friends{
    void friend(){
        System.out.println("Kamal can Java");
    }
}
class Amal extends Friends{
    void friend(){
        System.out.println("Amal can not Java");
    }
}
class Samal extends Friends{
    void friend(){
        System.out.println("Samal can Java & Python");
    }
}
class Answer{
    public static void main(String[] args) {
        Friends f;
        f = new Kamal ();
        f.friend();
        f = new Amal();
        f.friend();
        f = new Samal();
        f.friend();
    }
}
