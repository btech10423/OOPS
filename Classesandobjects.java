import java.util.*;
public class Classesandobjects {
    public static void main(String args[]){
        Pen p1= new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(50);
        System.out.println(p1.tip);
        p1.color = "yellow";
        System.out.println(p1.color);
    }
}
    class Pen{
        String color;
        int tip;
    
        void setcolor(String newcolor){
            color = newcolor;
        }
        void settip(int newtip){
           tip = newtip;
        }
    }
    class student{
        String name;
        int age;
        float percentage;

        void calculatepercentage(int phy,int chem,int math){
            percentage = (phy+chem+math)/3;
        }
    }
