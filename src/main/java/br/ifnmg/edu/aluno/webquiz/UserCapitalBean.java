package br.ifnmg.edu.aluno.webquiz;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Hudson Rikelme <hudson.rikelme at ifnmg.edu.br>
 */
@Named
@SessionScoped
public class UserCapitalBean implements Serializable {

    private String paisSelecionado;
    private String capitalSelecionada;
    private String resposta;

    public UserCapitalBean(String paisSelecionado, String capitalSelecionada, String resposta) {
        this.paisSelecionado = paisSelecionado;
        this.capitalSelecionada = capitalSelecionada;
        this.resposta = resposta;
    }

    
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getPaisSelecionado() {
        return paisSelecionado;
    }

    public void setPaisSelecionado(String paisSelecionado) {
        this.paisSelecionado = paisSelecionado;
    }

    public String getCapitalSelecionada() {
        return capitalSelecionada;
    }

    public void setCapitalSelecionada(String capitalSelecionada) {
        this.capitalSelecionada = capitalSelecionada;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

//</editor-fold>
    
    public String verificarResposta(){
        if("brasil".equals(paisSelecionado) && "brasilia".equals(capitalSelecionada)){
           resposta = "Resposta Correta!";
        }
        
        
        
        return "resultado";
    }
    
    
}
