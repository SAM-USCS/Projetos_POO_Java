/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.time.LocalDate;
/**
 *
 * @author ana.mello
 */
public class Gasto {
    
    private String TipoDeGasto;
    private String Data;
    private String Descricao;
    private double Valor;

    public String getTipoDeGasto() {
        return TipoDeGasto;
    }

    public String getData() {
        return Data;
    }

    public String getDescricao() {
        return Descricao;
    }

    public double getValor() {
        return Valor;
    }

    public void setTipoDeGasto(String TipoDeGasto) {
        this.TipoDeGasto = TipoDeGasto;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

}
