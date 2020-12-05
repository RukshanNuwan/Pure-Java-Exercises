/**
 * @author darkphoenix|2011300036
 */

package java_sinhala_basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Java_sinhala_basic extends JFrame {
    // Open JFrame
    Java_sinhala_basic() {
        // set JFrame layout null
        setLayout(null);

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // Components
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // new added objects are always add to this area [between setLayout() and setDefaultCloseOperation() functions]
        // create a button
        JButton btnClose = new JButton("Close");
        // set location of button
        btnClose.setBounds(290, 330, 80, 20);
        // add button into the JFrame
        add(btnClose);

        // create clear button
        JButton btnClear = new JButton("Clear");
        // set location of button
        btnClear.setBounds(200, 330, 80, 20);
        // add button into the JFrame
        add(btnClear);

        // create text field
        JTextField txt = new JTextField("");
        txt.setBounds(10, 10, 200, 20);
        add(txt);

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // Functions
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // add action into the close button
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // add action into the clear button
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("");
            }
        });

        // close the JFrame when click the close button on top
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // set size of the JFrame
        setSize(400, 400);

        // set title for the JFrame
        setTitle("First JFrame");

        // remove default close, minimize, maximize buttons
        //setUndecorated(true);

        // set colors for the JFrame
        //setBackground(new Color(21, 114, 151,200));

        // make visible
        setVisible(true);

        // set object to exact location where we give
        setLocationRelativeTo(null);
    }

    // Main method
    public static void main(String[] args) {
        Java_sinhala_basic mainFrame = new Java_sinhala_basic();
    }
}