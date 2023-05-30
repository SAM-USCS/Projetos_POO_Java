
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class CadastroMaquinaTableModel extends AbstractTableModel{
    
    private final List<CadastroMaquina> dados = new ArrayList<>();
    private final String[] colunas = {"Id","nome","player"};

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
                return dados.get(linha).getnome();
            case 2:
                return dados.get(linha).getplayer();         
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
                dados.get(linha).setnome((String) valor);
                break;
            case 2:
                dados.get(linha).setplayer(Integer.parseInt((String) valor));
                break;             
        } 
       
       this.fireTableRowsUpdated(linha, linha);
    }
            
    
    public void addRow(CadastroMaquina c) {
        this.dados.add(c);
        this.fireTableDataChanged();
       
    }
    
    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
        
    }
    
}
