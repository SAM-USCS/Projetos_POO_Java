/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ana.mello
 */
public class GastoTableModel extends AbstractTableModel {

    private List<Gasto> dados = new ArrayList<>();
    private String[] colunas = {"Tipo de Gasto", "Data", "Descrição", "Valor"};
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
        //identifica automaticamente o nome das colunas (aquele string alí que vc escreveu)
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
                return dados.get(linha).getTipoDeGasto();
            case 1:
                return dados.get(linha).getData();
            case 2: 
                return dados.get(linha).getDescricao();
            case 3:
                return dados.get(linha).getValor();
        }        
        return null;
    }
    
    //agora bora colocar uns valores na tabela
    
    public  void Incluir(Gasto gasto){
        this.dados.add(gasto);
        this.fireTableDataChanged();
    }
    
    public void Excluir(int linha){
        this.dados.remove(linha);
        this.fireTableDataChanged();
    }

    public void Atualizar(Object valor, int linha, int coluna){;
                    switch(coluna){
            case 0:
                dados.get(linha).setTipoDeGasto((String) valor);
                break;
            case 1:
                dados.get(linha).setData((String) valor);
                break;
            case 2: 
                dados.get(linha).setDescricao((String) valor);
                break;
            case 3:
                dados.get(linha).setValor( Double.parseDouble((String) valor));
                break;
        }   
                    this.fireTableRowsUpdated(linha, linha);
    }

}


