package java_sinhala_basic;

import javax.swing.*;

public class Java_sinhala_basic extends JFrame {
    // Open JFrame
    Java_sinhala_basic() {
        // set JFrame layout null
        setLayout(null);

        // close the JFrame when click the close button on top
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // set size of the JFrame
        setSize(600, 400);

        // set title for the JFrame
        setTitle("First JFrame");

        // make visible
        setVisible(true);

        // set object to exact location where we give
        setLocationRelativeTo(null);
    }

    // Main method
    public static void main(String[] args) {
        Java_sinhala_basic javaSinhalaBasic = new Java_sinhala_basic();
    }
}

/**
 * @author darkphoenix|2011300036
 */