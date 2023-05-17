package br.ifnmg.edu.aluno.webquiz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;



/**
 *
 * @author Lucas Flavio<lucasfgm at ifnmg.edu.br>
 */

@Named(value = "userGravBean")
@SessionScoped
public class UserGravBean implements Serializable {

   
    private String resposta;
    private List<SelectItem> respostaList;

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    public List<SelectItem> getRespostaList() {
        if( respostaList == null || respostaList.isEmpty() ){
            respostaList = new ArrayList<SelectItem>();
            respostaList.add(new SelectItem("A resposta está correta", "Isaac Newton"));
            respostaList.add(new SelectItem("A resposta correta é Isaac Newton", " Albert Einstein"));
            respostaList.add(new SelectItem("A resposta correta é Isaac Newton", "Galileu Galilei"));
            respostaList.add(new SelectItem("A resposta correta é Isaac Newton", "Nikola Tesla"));
        }
        return respostaList;
    }

    public void setRespostaList(List<SelectItem> respostaList) {
        this.respostaList = respostaList;
    }
    
}
