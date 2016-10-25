package es.indracompany.carros.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import es.indracompany.carros.dao.CarroDAO;
import es.indracompany.carros.entidade.Carro;

@ManagedBean
@SessionScoped
public class CarroBean {
	
	private Carro carro = new Carro();
	private List<Carro> carros = new ArrayList<>();
	
	public void adicionar(){
		carros.add(carro);
		new CarroDAO().salvar(carro);
		carro = new Carro();
	}

	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public List<Carro> getCarros() {
		return carros;
	}
	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
	
	
	
}
