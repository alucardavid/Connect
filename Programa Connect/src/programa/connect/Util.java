/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.connect;

import java.awt.*;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import oracle.Oracle;

/**
 *
 * @author David
 */
public class Util {
    
    public static String FormatData(String data){
        Date result;
        try {
            result = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            return String.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(result));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return "";
        }
    }
    
    public static int GerarCodigo(String tabela, String campo){
        // VARIAVEL PARA GERAR UM NUMERO RANDOMICO
        Random gerador = new Random();
        int codRandom;
        String querySel;
        ResultSet resultSet;
        boolean teste = false;
        try {
            Connection conn = Oracle.ObterConexao();
            Statement statement = conn.createStatement();
            while (!teste) { 
                codRandom = gerador.nextInt(10000);
                querySel = "SELECT * FROM " + tabela + " WHERE " + campo + "='" + codRandom + "'";
                resultSet = statement.executeQuery(querySel);
                if (resultSet.next()) {
                    
                }
                else{
                    teste = true;
                    conn.close();
                    return codRandom;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0;
        }
        return 0;
    }
    
    public static void LimparCamposTexto(JInternalFrame internalFrame){
        try {
            Component[] components = internalFrame.getContentPane().getComponents();
            for (Component component : components) {
                if (component instanceof JTextField) {
                    JTextComponent sObject = (JTextComponent) component;
                    sObject.setText("");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void FormatarCampoData(JTextField campo){
        String data, dia, mes, ano, tmp;
        int count;
        data = campo.getText().replace("/", "");
        dia = campo.getText().replace("/", "");
        mes = campo.getText().replace("/", "");
        ano = campo.getText().replace("/", "");
        count = data.length();
        switch (count){
            case 2:
                campo.setText(data);
                break;
            case 3:
                tmp = dia.substring(0, 2) + "/" + mes.substring(2, 3);
                campo.setText(tmp);
                break;
            case 4:
                tmp = dia.substring(0, 2) + "/" + mes.substring(2, 4);
                campo.setText(tmp);
                break;
            case 5:
                tmp = dia.substring(0, 2) + "/" + mes.substring(2, 4) + "/" + ano.substring(4,5);
                campo.setText(tmp); 
                break;
            case 6:
                tmp = dia.substring(0, 2) + "/" + mes.substring(2, 4) + "/" + ano.substring(4,6);
                campo.setText(tmp); 
                break;
            case 7:
                tmp = dia.substring(0, 2) + "/" + mes.substring(2, 4) + "/" + ano.substring(4,7);
                campo.setText(tmp); 
                break;
            case 8:
                tmp = dia.substring(0, 2) + "/" + mes.substring(2, 4) + "/" + ano.substring(4,8);
                campo.setText(tmp); 
                break;
            case 9:
                tmp = dia.substring(0, 2) + "/" + mes.substring(2, 4) + "/" + ano.substring(4,8);
                campo.setText(tmp); 
                break;
        }
    }
    
    public static boolean ValidarCampoTextoVazio(JInternalFrame internalFrame){
        Component[] components = internalFrame.getContentPane().getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextComponent sObject = (JTextComponent) component;
                if (sObject.getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void NegarInputTexto(java.awt.event.KeyEvent evt){
        String carac = "0987654321";
        if (!carac.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }
    
    public static void FormatarCampoValor(JTextField campo){
        String tmp, tmp2, valor;
        int count;
        valor = campo.getText().replace(",", "").replace(".", "");
        count = valor.length();
        switch(count){
            case 2:
                campo.setText(valor);
                break;
            case 3:
                tmp = valor.substring(0, 2) + "," + valor.substring(2, 3);
                campo.setText(tmp);
                break;
            case 4:
                tmp = valor.substring(0, 2) + "," + valor.substring(2, 4);
                campo.setText(tmp);
                break;
            case 5:
                tmp = valor.substring(0, 3) + "," + valor.substring(3, 5);
                campo.setText(tmp);
                break;
            case 6:
                tmp = valor.substring(0, 1) + "." + valor.substring(1, 4) + "," + valor.substring(4, 6);
                campo.setText(tmp);
                break;
            case 7:
                tmp = valor.substring(0, 2) + "." + valor.substring(2, 5) + "," + valor.substring(5, 7);
                campo.setText(tmp);
                break;
            case 8:
                tmp = valor.substring(0, 3) + "." + valor.substring(3, 6) + "," + valor.substring(6, 8);
                campo.setText(tmp);
                break;
            case 9:
                tmp = valor.substring(0, 1) + "." + valor.substring(1, 4) + "." + valor.substring(4, 7) + "," + valor.substring(7, 9);
                campo.setText(tmp);
                break;
        }
    }
    
}
