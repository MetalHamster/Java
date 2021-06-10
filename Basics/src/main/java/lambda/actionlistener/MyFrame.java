package lambda.actionlistener;

import javax.swing.*;

/**
 * @author Matthias.Flueckiger
 */
public class MyFrame extends JFrame{
    JButton button = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");

    MyFrame(){
        button.setBounds(100,100,200,100);
        button.addActionListener(
                (e) -> System.out.println("button 1 clicked")
        );
        button2.setBounds(100,200,200,100);
        button2.addActionListener(
                (e) -> System.out.println("button 2 clicked")
        );

        this.add(button);
        this.add(button2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
    }
}
