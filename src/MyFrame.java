import javax.swing.*;
import java.awt.*;
import org.apache.logging.log4j.*;


public class MyFrame extends JFrame
{         /* Frames contain panels ---->  put panels here  */

    private static Logger logger = LogManager.getLogger(MyFrame.class);

    //declare the widgets
    private MyPanel pnlTemp;

    public MyFrame()
    { /* Configure the widgets*/


        logger.debug(" INSIDE MyFrame constructor !!! ");

        pnlTemp = new MyPanel();
        add(pnlTemp, BorderLayout.CENTER);

    }


}
