package br.edu.univas.si6.projeto_escolar.view;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class EstadosView {	

    private Map<String,String> ufs = new HashMap<String, String>();
	
    @PostConstruct
    public void init(){
    	ufs = new HashMap<String, String>();
    	
    	ufs.put("Acre", "Acre");
    	ufs.put("Alagoas","Alagoas");
    	ufs.put("Amapá","Amapá");
    	ufs.put("Amazonas","Amazonas");
        ufs.put("Bahia","Bahia");
        ufs.put("Ceará","Ceará");
        ufs.put("Distrito Federal","Distrito Federal");
        ufs.put("Espírito Santo","Espírito Santo");
        ufs.put("Goiás","Goiás");
        ufs.put("Maranhão","Maranhão");
        ufs.put("Mato Grosso","Mato Grosso");
        ufs.put("Mato Grosso do Sul","Mato Grosso do Sul");
        ufs.put("Minas Gerais","Minas Gerais");
        ufs.put("Pará","Pará");
        ufs.put("Paraíba","Paraíba");
        ufs.put("Paraná","Paraná");
        ufs.put("Pernambuco","Pernambuco");
        ufs.put("Piauí","Piauí");
        ufs.put("Rio de Janeiro","Rio de Janeiro");
        ufs.put("Rio Grande do Norte","Rio Grande do Norte");
        ufs.put("Rio Grande do Sul","Rio Grande do Sul");
        ufs.put("Rondônia","Rondônia");
        ufs.put("Roraima","Roraima");
        ufs.put("Roraima","Roraima");
        ufs.put("São Paulo","São Paulo");
        ufs.put("Sergipe","Sergipe");
        ufs.put("Tocantins","Tocantins");
    }

	public Map<String, String> getUfs() {
		return ufs;
	}

	public void setUfs(Map<String, String> ufs) {
		this.ufs = ufs;
	}

}
