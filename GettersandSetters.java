import java.net.PasswordAuthentication;

public class GettersandSetters {

    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(50);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());
    }
}

class Pen {
    private String Color;
    private int Tip;
    
    String getColor() {
        return this.Color;
    }

    int getTip() {
        return this.Tip;
    }

    void setColor(String newColor) {
        this.Color = newColor;
    }

    void setTip(int newTip) {
        this.Tip = newTip;
    }
}
