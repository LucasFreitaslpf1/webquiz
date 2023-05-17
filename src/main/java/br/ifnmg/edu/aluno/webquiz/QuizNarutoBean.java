/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.ifnmg.edu.aluno.webquiz;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author gusta
 */
@Named
@SessionScoped
public class QuizNarutoBean implements Serializable{
    
    private String respostaSelecionada;
    private Boolean respostaCorreta;

    public void minato(){
    respostaSelecionada = "Minato Namikaze";}
    public void madara(){
    respostaSelecionada = "Madara Uchiha";}
    public void iruka(){
    respostaSelecionada = "Iruka Umino";}
    public void kakashi(){
    respostaSelecionada = "Kakashi Hatake";}
    
    public String verificarResposta(){
        respostaCorreta = respostaSelecionada.equals("Minato Namikaze");
        return respostaSelecionada;
    }
    
    public String respostaCerta(){
        return respostaCorreta ? "Parabéns! Resposta Correta!" : "Que Pena. Resposta Errada.";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
