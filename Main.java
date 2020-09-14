package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main<j, a> extends JFrame {

    int counter = 0;

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    String w1="",w2="",w3="",w4="",w5="",w6="",w7="",w8="",w9="";


    public Main() {
        super("Tic Tac Toe");
        this.setVisible(true);
        this.setSize(800, 800);
        this.setDefaultCloseOperation(3);
        this.setLayout(new GridLayout(3, 3));


         b1 = new JButton("");
        add(b1);

         b2 = new JButton("");
        add(b2);

       b3 = new JButton("");
        add(b3);

         b4 = new JButton("");
        add(b4);

         b5 = new JButton("");
        add(b5);

         b6 = new JButton("");
        add(b6);

         b7 = new JButton("");
        add(b7);

         b8 = new JButton("");
        add(b8);

         b9 = new JButton("");
        add(b9);




        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton buttons = (JButton) e.getSource();
                buttons.setFont(new Font("Arial", Font.PLAIN, 200));
                if (counter % 2 == 0) {
                    buttons.setText("X");
                }
                else
                    {
                        buttons.setText("O");
                    }
            buttons.setEnabled(false);
                counter++;
                 w1 = b1.getText();
                winnner();
            }



        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton buttons = (JButton) e.getSource();
                buttons.setFont(new Font("Arial", Font.PLAIN, 200));
                if (counter % 2 == 0) {
                    buttons.setText("X");
                }
                else
                {
                    buttons.setText("O");
                }
                buttons.setEnabled(false);
                counter++;
                 w2 = b2.getText();
                winnner();
            }



        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton buttons = (JButton) e.getSource();
                buttons.setFont(new Font("Arial", Font.PLAIN, 200));
                if (counter % 2 == 0) {
                    buttons.setText("X");
                }
                else
                {
                    buttons.setText("O");
                }
                buttons.setEnabled(false);
                counter++;
                 w3 = b3.getText();
                winnner();
            }



        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton buttons = (JButton) e.getSource();
                buttons.setFont(new Font("Arial", Font.PLAIN, 200));
                if (counter % 2 == 0) {
                    buttons.setText("X");
                }
                else
                {
                    buttons.setText("O");
                }
                buttons.setEnabled(false);
                counter++;
                w4 = b4.getText();
                winnner();
            }



        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton buttons = (JButton) e.getSource();
                buttons.setFont(new Font("Arial", Font.PLAIN, 200));

                if (counter % 2 == 0) {
                    buttons.setText("X");
                }
                else
                {
                    buttons.setText("O");
                }
                buttons.setEnabled(false);
                counter++;
                 w5 = b5.getText();
                winnner();
            }



        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton buttons = (JButton) e.getSource();
                buttons.setFont(new Font("Arial", Font.PLAIN, 200));

                if (counter % 2 == 0) {
                    buttons.setText("X");
                }
                else
                {
                    buttons.setText("O");
                }
                buttons.setEnabled(false);
                counter++;
                 w6 = b6.getText();
                winnner();
            }



        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton buttons = (JButton) e.getSource();
                buttons.setFont(new Font("Arial", Font.PLAIN, 200));

                if (counter % 2 == 0) {
                    buttons.setText("X");
                }
                else
                {
                    buttons.setText("O");
                }
                buttons.setEnabled(false);
                counter++;
                 w7 = b7.getText();
                winnner();
            }



        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton buttons = (JButton) e.getSource();
                buttons.setFont(new Font("Arial", Font.PLAIN, 200));

                if (counter % 2 == 0) {
                    buttons.setText("X");
                }
                else
                {
                    buttons.setText("O");
                }
                buttons.setEnabled(false);
                counter++;
                w8 = b8.getText();
                winnner();
            }



        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton buttons = (JButton) e.getSource();
                buttons.setFont(new Font("Arial", Font.PLAIN, 200));

                if (counter % 2 == 0) {
                    buttons.setText("X");
                }
                else
                {
                    buttons.setText("O");
                }
                buttons.setEnabled(false);
                counter++;
                 w9 = b9.getText();
                winnner();

            }


        });


    }



 private void winnner()
    {
       if
       (
               w1==("X")  && w2 ==("X") && w3 ==("X")||
               w4==("X")  && w5 ==("X") && w6 ==("X")||
               w7==("X")  && w8 ==("X") && w9 ==("X")||

               w1==("X")  && w4 ==("X") && w7 ==("X")||
               w2==("X")  && w5 ==("X") && w8 ==("X")||
               w3==("X")  && w6 ==("X") && w7 ==("X")||

               w1==("X")  && w5 ==("X") && w9 ==("X")||
               w3==("X")  && w5 ==("X") && w7 ==("X")
       )

        {

            int reset = JOptionPane.showConfirmDialog(this, "Player X wins ! Do you want to  restart the game ? ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            if(reset==JOptionPane.YES_OPTION)
            {

              reset();

            }
        }
       else if
    (
                    w1==("O")  && w2 ==("O") && w3 ==("O")||
                    w4==("O")  && w5 ==("O") && w6 ==("O")||
                    w7==("O")  && w8 ==("O") && w9 ==("O")||

                    w1==("O")  && w4 ==("O") && w7 ==("O")||
                    w2==("O")  && w5 ==("O") && w8 ==("O")||
                    w3==("O")  && w6 ==("O") && w7 ==("O")||

                    w1==("O")  && w5 ==("O") && w9 ==("O")||
                    w3==("O")  && w5 ==("O") && w7 ==("O")
    )

    {

        int reset = JOptionPane.showConfirmDialog(this, "Player O wins ! Do you want to  restart the game ? ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        if(reset==JOptionPane.YES_OPTION)
        {

            reset();

        }
    }
       else if
       (
                       w1!=("")  && w2 !=("") && w3 !=("")&&
                       w4!=("")  && w5 !=("") && w6 !=("")&&
                       w7!=("")  && w8 !=("") && w9 !=("")


       )
       {
           int reset = JOptionPane.showConfirmDialog(this, "Nobody won  ! Do you want to  restart the game ? ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           if(reset==JOptionPane.YES_OPTION)
           {

               reset();

           }
       }



     }
         private  void reset()
         {

             dispose();
             new Main<>();
         }






    public static void main(String[] args) {


                new Main();


            }
        }
