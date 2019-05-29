/* This program will have the user enter first and last name. When they click 'submit' the
 the program will output their full name*/


import javax.swing.*;
import org.apache.logging.log4j.*;

public class Driver
{
    private static Logger logger = LogManager.getLogger(Driver.class);// whatever class we are in we use that class

    public static void main(String[] args)
    {
        logger.debug("INSIDE DRIVER  MAIN !!!");

        MyFrame frm = new MyFrame();

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(600,400);
        frm.setVisible(true);



    }


}
