package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class investmentViewer1 {

    private static final int FRAME_WIDTH = 120;
    public static final int FRAME_HEIGHT = 60;

    private static final double INTEREST_RATE = 10;
    private static final double INITIAL_BALANCE = 1000;


    public static void main(String[] args) {

        JFrame frame = new JFrame();
         JButton button = new JButton("Add Interest");
         frame.add(button);

         BankAccount account = new BankAccount(INITIAL_BALANCE);

         class AddInterestListener implements ActionListener{

             public void actionPerformed(ActionEvent event){

                 double interest = account.getBalance() * INTEREST_RATE / 100;
                 account.deposit(interest);
                 System.out.println("balance:" + account.getBalance());
             }
         }
         ActionListener listener = new AddInterestListener();
         button.addActionListener(listener);

         frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);

    }
}
