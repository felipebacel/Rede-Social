/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redesocial.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import redesocial.classes.Empresa;

/**
 *
 * @author cliente
 */
public class ModelEmpresa extends AbstractTableModel {
    
   public ArrayList<Empresa>ListaDeEmpresas = new ArrayList<>();
    
    String[] colunas ={"Nome", "CNPJ","Area/Ramo"};
    
    public void AdicionarEmpresa(Empresa e){
        ListaDeEmpresas.add(e);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
       return ListaDeEmpresas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    public String getColumnName(int column){
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return ListaDeEmpresas.get(rowIndex).getNomeUsuario();
        }else if(columnIndex == 1){
            return ListaDeEmpresas.get(rowIndex).getCNPJ();
        }else{
            return ListaDeEmpresas.get(rowIndex).getRamo();
        }
    }
    
}
