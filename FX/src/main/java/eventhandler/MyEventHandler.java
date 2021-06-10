package eventhandler;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class MyEventHandler implements EventHandler<ActionEvent> {
    //EventHandling als separate Klasse
        @Override
        public void handle(ActionEvent event) {
            if(event.getSource() instanceof Button)
            {
                Button btn;
                btn=(Button)event.getSource();
                String txt=btn.getText().equals("ON")?"OFF":"ON";
                btn.setText(txt);
            }
            System.out.println("Button pressed");
        }
    }
