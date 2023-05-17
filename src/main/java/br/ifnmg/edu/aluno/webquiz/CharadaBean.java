/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifnmg.edu.aluno.webquiz;

import java.io.Serializable;
import java.util.Random;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author DER
 */

@Named(value = "charadaBean")
@SessionScoped
public class CharadaBean implements Serializable {
    
    // me arrependo amargamento de nao ter chamado isso tudo de charadas , agora nao vou rescrever tudo de novo não :/
    
    private int r=0;
    private String resposta;
    private Boolean acertou = false;
    
    
    public CharadaBean(){
        
    }
    
    public String pergunta(){
        Random random = new Random();
        this.r = random.nextInt(7);
        
        if(r==0){
            // reposta : nada
            return "O que é uma coisa que todos desejam ter, muitos gastam a vida procurando, mas quando a encontram, a lançam fora?";
        }
        else if(r==1){
            // reposta : buraco
            return "Quanto mais você tira, mais cresce. O que é?";
        }
        else if(r==2){
            // reposta : mapa
            return "Tenho cidades, mas não tenho casas. Tenho florestas, mas não tenho árvores. Tenho rios, mas não tenho água. O que sou eu?";
        }
        else if(r==3){
            // resposta : segredo
            return "Sou um enigma envolto em mistério. Todos me desejam, mas poucos me conhecem realmente. O que sou eu?";
        }
        else if(r==4){
            // resposta : caixão
            return "Quem me faz, me vende. Quem me compra, não me usa. Quem me usa, não sabe que me tem. O que sou eu?";
        }
        else if(r==5){
            // resposta : livro
            return "Falo sem voz, ouço sem ouvidos. Tenho corpo, mas não sou um ser vivo. O que sou eu?";
        }
            // resposta : espelho
            return "Sou uma janela para o passado, um reflexo do presente e uma visão para o futuro. O que sou eu?";   
    }
    
    public String compararResposta(){
    if(r==0 && resposta.equals("nada")){
            this.acertou = true;
        }
    else if(r==1 && resposta.equals("buraco")){
        this.acertou = true;
        }
    else if(r==2 && resposta.equals("mapa")){
        this.acertou = true;
        }
    else if(r==3 && resposta.equals("segredo")){
        this.acertou = true;
        }
    else if(r==4 && resposta.equals("caixão")){
        this.acertou = true;
        }
    else if(r==5 && resposta.equals("livro")){
        this.acertou = true;
        }
    else if(r==6 && resposta.equals("espelho")){
        this.acertou = true;
        }
    else{
        this.acertou = false;
    } 
        
        return geraResultado();
    }
    
    public String geraResultado() {
       String palavraCerta;
       // return respostaCorreta ? "Parabéns! Resposta Correta!" : "Resposta Incorreta! Tente outra Vez!";
       if(this.acertou == true){
            return "Parabens você acertou !!!";
       }
       // a partir dessa linha é porque o acertou == false
       if(r==0)
           palavraCerta = "nada";
       else if(r==1)
           palavraCerta = "buraco";
       else if(r==2)
           palavraCerta = "mapa";
       else if(r==3)
           palavraCerta = "segredo";
       else if(r==4)
           palavraCerta = "caixão";
       else if(r==5)
           palavraCerta = "livro";
       else 
           palavraCerta = "espelho";
           
       return "que pena você errou, a reposta certa era "+ palavraCerta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

   
    
    
}

