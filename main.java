package lab7;

public class main {
    
    public static void main(String[] args)
    {
        Movable m1 = new MovablePoint(1, 2, 3, 4);   
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
           
        Movable m2 = new MovableCircle(5, 6, 7, 8, 9); 
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
