package com.lojaifpr.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCrudClient extends JFrame {
    private static final long serialVersionUID = 564564654654564L;
    
    private JLabel lblNome;
    private JTextField txtNome;

    private JLabel lblTelefone;
    private JTextField txtTelefone;

    private JButton btnIncluir;
    private JButton btnCancelar;
    private JButton btnConsultar;
    private JButton btnAlterar;
    private JButton btnExcluir;


    public TelaCrudClient(){
        super("Cadastro de Clientes");

        lblNome = new JLabel("Nome");
        txtNome = new JTextField();

        lblTelefone = new JLabel("Telefone");
        txtTelefone = new JTextField();

        btnIncluir = new JButton("Incluir");
        btnCancelar = new JButton("Cancelar");
        btnAlterar = new JButton("Alterar");
        btnConsultar = new JButton("Consultar");
        btnExcluir = new JButton("Excluir");

        setSize(650, 200);
        setVisible(true);
        setLayout(null);

        lblNome.setBounds(10, 10, 100,25);
        txtNome.setBounds(50, 10, 200, 25);

        lblTelefone.setBounds(10, 50, 100, 25);
        txtTelefone.setBounds(70,  50, 200, 25);

        btnIncluir.setBounds(20, 100, 120, 25);
        btnAlterar.setBounds(140, 100, 120, 25);
        btnCancelar.setBounds(260, 100, 120, 25);
        btnConsultar.setBounds(380, 100, 120, 25);
        btnExcluir.setBounds(500, 100, 120, 25);

        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

        add(lblNome); 
        add(txtNome);
        add(lblTelefone);
        add(txtTelefone);
        add(btnIncluir);
        add(btnAlterar);
        add(btnCancelar);
        add(btnConsultar);
        add(btnExcluir);
    }

}
