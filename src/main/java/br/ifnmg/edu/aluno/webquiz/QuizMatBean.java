/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.ifnmg.edu.aluno.webquiz;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Lucas
 */
@Named(value = "quizMatBean")
@SessionScoped
public class QuizMatBean implements Serializable {

    private Integer resultado;
    private final Random r;
    private Integer palpite;

    /**
     * Creates a new instance of QuizMatBean
     */
    public QuizMatBean() {
        r = new Random();
    }

    public Integer getResultado() {
        return resultado;
    }

    public Integer getPalpite() {
        return palpite;
    }

    public void setPalpite(Integer palpite) {
        this.palpite = palpite;
    }
    
    public String gerarNumeros() {
        String s = new String();
        Integer qtd = r.nextInt(5) + 1;
        Integer valor;
        resultado = 0;

        valor = r.nextInt(100);
        s += valor;
        resultado += valor;

        for (int i = 0; i < qtd; i++) {
            valor = r.nextInt(30) + 1;
            s = operacao(s, valor);
        }
        System.out.println(resultado);
        return s;
    }

    private String operacao(String s, Integer valor) {
        switch (r.nextInt(4) + 1) {
            case 1:
                resultado += valor;
                s = s + " + " + valor;
                break;
            case 2:
                resultado -= valor;
                s = s + " - " + valor;
                break;
            case 3:
                resultado *= valor;
                s =  s + " * " + valor;
                break;
            case 4:
                resultado /= valor;
                s = s + " / " + valor;
                break;
        }
        return s;
    }
    
    public Boolean acertou(){
        return palpite.equals(resultado);
    }
}
