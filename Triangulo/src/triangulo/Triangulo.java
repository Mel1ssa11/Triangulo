/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangulo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Triangulo extends JFrame {

    Container tela;
    JLabel titulo, lado1, lado2, lado3, resultado;
    JTextField texto1, texto2, texto3;
    JButton verificar;

    public Triangulo() {

        super("Tipos de Triangulo");

        tela = getContentPane();
        tela.setLayout(null);
        tela.setBackground(new Color(142, 210, 188));

        titulo = new JLabel("Verificador de Triangulos");
        titulo.setBounds(0, 20, 500, 30);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 24));
        titulo.setForeground(new Color(26, 75, 131));

        lado1 = new JLabel("Lado 1:");
        lado2 = new JLabel("Lado 2:");
        lado3 = new JLabel("Lado 3:");
        lado1.setBounds(50, 90, 100, 25);
        lado2.setBounds(50, 140, 100, 25);
        lado3.setBounds(50, 190, 100, 25);

        texto1 = new JTextField();
        texto2 = new JTextField();
        texto3 = new JTextField();
        texto1.setBounds(130, 90, 150, 25);
        texto2.setBounds(130, 140, 150, 25);
        texto3.setBounds(130, 190, 150, 25);

        verificar = new JButton("Verificar Tipo");
        verificar.setBounds(80, 260, 180, 30);
        verificar.setBackground(new Color(246, 86, 65));
        verificar.setForeground(Color.WHITE);

        resultado = new JLabel("Resultado");
        resultado.setBounds(300, 150, 180, 30);
        resultado.setFont(new Font("Arial", Font.BOLD, 18));
        resultado.setForeground(new Color(26, 75, 131));

        verificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    double l1 = Double.parseDouble(texto1.getText().replace(",", "."));
                    double l2 = Double.parseDouble(texto2.getText().replace(",", "."));
                    double l3 = Double.parseDouble(texto3.getText().replace(",", "."));

                    if (l1 == l2 && l2 == l3) {

                        resultado.setText("Triangulo Equilatero");

                    } else if (l1 == l2 || l1 == l3 || l2 == l3) {

                        resultado.setText("Triangulo Isosceles");

                    } else {

                        resultado.setText("Triangulo Escaleno");

                    }

                } catch (NumberFormatException erro) {

                    JOptionPane.showMessageDialog(null,
                            "Digite apenas numeros validos");

                }
            }
        });

        tela.add(titulo);

        tela.add(lado1);
        tela.add(lado2);
        tela.add(lado3);

        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);

        tela.add(verificar);

        tela.add(resultado);

        setSize(520, 400);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
