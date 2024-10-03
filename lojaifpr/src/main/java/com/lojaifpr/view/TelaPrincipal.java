package com.lojaifpr.view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaPrincipal extends JFrame {
    private static final long serialVersionUID = -346123942816557733L;

    private JMenuBar barmenu;
    private JMenu menuCadastro;
    private JMenu menuCompra;
    private JMenu menuAjuda;
    private JMenuItem itemMenuClient;
    private JMenuItem itemMenuFonecedor;
    private JMenuItem itemMenuProduto;
    private JMenuItem itemMenuSobre;
    private JMenuItem itemMenuSair;

    public TelaPrincipal(){
        super("Loja IFPR");

        barmenu = new JMenuBar();
        menuCadastro = new JMenu("Cadastro");
        menuCompra = new JMenu("Compra");
        menuAjuda = new JMenu("Ajuda");

        itemMenuClient = new JMenuItem("Client");
        itemMenuFonecedor = new JMenuItem("Fornecedor");
        itemMenuProduto = new JMenuItem("Produto");
        itemMenuSobre = new JMenuItem("Sobre");
        itemMenuSair = new JMenuItem("Sair");

        setJMenuBar(barmenu);
        barmenu.add(menuCadastro);
        barmenu.add(menuCompra);
        barmenu.add(menuAjuda);

        menuCadastro.add(itemMenuClient);
        menuCadastro.add(itemMenuFonecedor);
        menuCadastro.add(itemMenuProduto);
        menuAjuda.add(itemMenuSobre);
        menuAjuda.add(itemMenuSair);


    }

}
