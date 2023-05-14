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
    private String respostaCorreta;
    private String respostaIncorreta;

    public UserCapitalBean() {
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

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(String respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    public String getRespostaIncorreta() {
        return respostaIncorreta;
    }

    public void setRespostaIncorreta(String respostaIncorreta) {
        this.respostaIncorreta = respostaIncorreta;
    }
    

//</editor-fold>
    
    public String verificarResposta(){
        if("brasil".equals(paisSelecionado) && "brasilia".equals(capitalSelecionada)){
           resposta = "Resposta Correta!";
        }else if("eua".equals(paisSelecionado) && "washington".equals(capitalSelecionada)){
            resposta = "Resposta Correta!";
        }else if("franca".equals(paisSelecionado) && "paris".equals(capitalSelecionada)){
            resposta = "Resposta Correta!";
        }else if("japao".equals(paisSelecionado) && "toquio".equals(capitalSelecionada)){
            resposta = "Resposta Correta!";
        }else if("australia".equals(paisSelecionado) && "sidney".equals(capitalSelecionada)){
            resposta = "Resposta Correta!";
        }else if("argentina".equals(paisSelecionado) && "buenos aires".equals(capitalSelecionada)){
            resposta = "Resposta Correta!";
        }else if("belgica".equals(paisSelecionado) && "bruxelas".equals(capitalSelecionada)){
            resposta = "Resposta Correta!";
        }else if("canada".equals(paisSelecionado) && "otava".equals(capitalSelecionada)){
            resposta = "Resposta Correta!";
        }else if("china".equals(paisSelecionado) && "pequim".equals(capitalSelecionada)){
            resposta = "Resposta Correta!";
        }else{
            resposta = "Resposta Incorreta!";
        }
        
        
        return "resultado";
    }
    
        public String imprimeResposta() {
        if ("Resposta Correta!".equals(resposta)) {
            return "Resposta Correta!";
        } else {
            return "Resposta Incorreta!";
        }
    }
    
}
