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
    private Boolean respostaCorreta;

//    public UserCapitalBean() {
//        this.paisSelecionado = paisSelecionado;
//        this.capitalSelecionada = capitalSelecionada;
//        this.resposta = resposta;
//    }

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

    public Boolean getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(Boolean respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

//</editor-fold>
    public String verificarResposta() {
        if ("brasil".equals(paisSelecionado) && "brasilia".equals(capitalSelecionada)) {
            respostaCorreta = true;
        } else if ("eua".equals(paisSelecionado) && "washington".equals(capitalSelecionada)) {
            respostaCorreta = true;
        } else if ("franca".equals(paisSelecionado) && "paris".equals(capitalSelecionada)) {
            respostaCorreta = true;
        } else if ("japao".equals(paisSelecionado) && "toquio".equals(capitalSelecionada)) {
            respostaCorreta = true;
        } else if ("australia".equals(paisSelecionado) && "sidney".equals(capitalSelecionada)) {
            respostaCorreta = true;
        } else if ("argentina".equals(paisSelecionado) && "buenos aires".equals(capitalSelecionada)) {
            respostaCorreta = true;
        } else if ("belgica".equals(paisSelecionado) && "bruxelas".equals(capitalSelecionada)) {
            respostaCorreta = true;
        } else if ("canada".equals(paisSelecionado) && "otava".equals(capitalSelecionada)) {
            respostaCorreta = true;
        } else if ("china".equals(paisSelecionado) && "pequim".equals(capitalSelecionada)) {
            respostaCorreta = true;
        } else {
            respostaCorreta = false;
        }

        return geraResultado();
    }

    public String geraResultado() {
        return respostaCorreta ? "Parabéns! Resposta Correta!" : "Resposta Incorreta! Tente outra Vez!";
    }

}
