
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class CompraTableModel extends AbstractTableModel{
    
    private List<Compra> dados = new ArrayList<>();
    private String[] colunas = {"Id","Descrição","Qtd"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
        
    @Override
    public int getRowCount() {
        return dados.size();
        
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                return dados.get(linha).getId();
            case 1:
                return dados.get(linha).getDescricao();
            case 2:
                return dados.get(linha).getQtd();         
        }
        
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
       switch(coluna){
            case 0:
                dados.get(linha).setId(Integer.parseInt((String) valor));
                break;
            case 1:
                dados.get(linha).setDescricao((String) valor);
                break;
            case 2:
                dados.get(linha).setQtd(Integer.parseInt((String) valor));
                break;             
        } 
       
       this.fireTableRowsUpdated(linha, linha);
    }
            
    
    public void addRow(Compra c) {
        this.dados.add(c);
        this.fireTableDataChanged();
       
    }
    
    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
        
    }
    
}
