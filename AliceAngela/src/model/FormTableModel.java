
package model;

import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author leona
 */
public class FormTableModel extends AbstractTableModel{
    
    private List<DadosForm> dados = new ArrayList<>();
    private String[] colunas = {"REs", "Nome", "CPF", "Email", "Celular", "Data de Admissão", "Atuação"};
    
    @Override
    public String getColumnName(int column){
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
                return dados.get(linha).getRE();
            case 1:
                return dados.get(linha).getNome();
            case 2: 
                return dados.get(linha).getCpf();
            case 3:
                return dados.get(linha).getEmail();
            case 4: 
                return dados.get(linha).getCelular();
            case 5: 
                return dados.get(linha).getDataAdmissao();
            case 6:
                return dados.get(linha).getAtuacao();
        }
       return null;
    }
    
    @Override
    public void setValueAt(Object valor, int linha, int coluna){
        
        switch(coluna){
            case 0: 
                dados.get(linha).setRE(Integer.parseInt((String) valor));
                break;
            case 1:
                dados.get(linha).setNome((String) valor);
                break;
            case 2: 
                dados.get(linha).setCpf((String) valor);
                break;
            case 3:
                dados.get(linha).setEmail((String) valor);
                break;
            case 4: 
                dados.get(linha).setCelular((String) valor);
                break;
            case 5: 
                dados.get(linha).setDataAdmissao((String) valor);
                break;
            case 6:
                dados.get(linha).setAtuacao((String) valor);
                break;
        }
        
        this.fireTableRowsUpdated(linha, linha);
    }
    
    public void addRow(DadosForm f){
        this.dados.add(f);  
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
        
    }
    
}
