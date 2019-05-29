


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.apache.logging.log4j.*;


public class MyPanel extends JPanel
                       implements ActionListener
{
    private static Logger logger = LogManager.getLogger(MyPanel.class);

    private  JTextField txtFirstName;
    private  JTextField txtLastName;
    private  JButton btnSubmit;

    private  JLabel lblfirstName;
    private  JLabel lbllastName;

    private  JTextField txtOutput;




    public MyPanel()
    {                   /* CONFIGURE THE WIDGETS*/

        //default layout for a PANEL is FLOWLAYOUT
        logger.debug(" INSIDE Panel Constructor !!! ");

         JLabel lblfirstName = new JLabel("First Name: ");
        txtFirstName = new JTextField(20);

         JLabel lblLastName = new JLabel("Last Name: ");
        txtLastName = new JTextField(20);

         btnSubmit = new JButton("Submit");
         JLabel lblFullName = new JLabel("Full Name:");
         txtOutput = new JTextField(20);


         btnSubmit.addActionListener(this);
         btnSubmit.setActionCommand("submit");

         add(lblfirstName);
         add(txtFirstName);
         add(lblLastName);
         add(txtLastName);

         add(btnSubmit);
        add(lblFullName);
        add(txtOutput);

    }


    @Override
    public void actionPerformed(ActionEvent e) // Outputting the full name
    {

        logger.debug(" INSIDE DRIVER actionPerformed!!!");

        String FirstName = txtFirstName.getText();
        String LastName = txtLastName.getText();
        txtOutput.setText( FirstName + " " + LastName);




    }

}
