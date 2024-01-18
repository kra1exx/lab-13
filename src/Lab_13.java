import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Lab_13 extends Frame{
    Lab_13(String title){
        super(title);
        Frame frame = new Frame("My App");
        setSize(1000,900);
        setLayout(null);
        Button button = new Button("Start");
        button.setSize(100, 100);
        button.setLocation(100,100);
        Label label = new Label("Label");
        label.setSize(100,25);
        label.setLocation(300,150);
        add(label);
        add(button);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });}
    public static void main(String[] args) {
        new Lab_13("My App");
    }
}