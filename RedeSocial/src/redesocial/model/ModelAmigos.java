/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redesocial.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import redesocial.classes.Pessoa;

/**
 *
 * @author cliente
 */
public class ModelAmigos extends AbstractTableModel{
    
   public ArrayList<Pessoa>pAmigos = new ArrayList();
    
    String[] colunas = {"Nome", "Email"};
    
    public void AddPessoa(Pessoa p){
        pAmigos.add(p);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
       return pAmigos.size();
    }

    @Override
    public int getColumnCount() {
       return colunas.length;
    }
    @Override
     public String getColumnName(int column){
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return pAmigos.get(rowIndex).getNomeUsuario();
        }else{
            return pAmigos.get(rowIndex).getEmail();
        }
        
    }
    
}
