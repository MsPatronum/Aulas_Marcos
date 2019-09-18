/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Nicole
 */
public class Funcionario {
    private int cod_funcionario;
    private String nome_funcionario;
    private String cargo_funcionario;
    private double salario_funcionario;
    private Date dataAdm_funcionario;
    private SimpleDateFormat df = new SimpleDateFormat("DD/MM/YYYY");
    private static NumberFormat nf = NumberFormat.getCurrencyInstance();

    public int getCod_funcionario() {
        return cod_funcionario;
    }

    public void setCod_funcionario(int cod_funcionario) {
        this.cod_funcionario = cod_funcionario;
    }

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public String getCargo_funcionario() {
        return cargo_funcionario;
    }

    public void setCargo_funcionario(String cargo_funcionario) {
        this.cargo_funcionario = cargo_funcionario;
    }

    public double getSalario_funcionario() {
        return salario_funcionario;
    }

    public void setSalario_funcionario(double salario_funcionario) {
        this.salario_funcionario = salario_funcionario;
    }

    public Date getDataAdm_funcionario() {
        return dataAdm_funcionario;
    }

    public void setDataAdm_funcionario(Date dataAdm_funcionario) {
        this.dataAdm_funcionario = dataAdm_funcionario;
    }
    
    // ----------------------------------------------
    
    public String getDataAdmFormatada(){
        return df.format(dataAdm_funcionario);
    }
    public String getSalarioFormatado(){
        return nf.format(salario_funcionario);
    }
}
