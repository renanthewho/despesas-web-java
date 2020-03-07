package br.com.impacta.despesaswebjava.DAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.impacta.despesaswebjava.models.CategoriaDespesa;
import br.com.impacta.despesaswebjava.models.Despesa;

public class DespesaDAO {

	private List<Despesa> despesas;
	
	public List<Despesa> getDespesas(){
		
		if (this.despesas==null) {
			despesas = new ArrayList<>();
		}
		
	  despesas.add(new Despesa("Restaurante",CategoriaDespesa.ALIMENTACAO, LocalDate.now(),89.95));
	  despesas.add(new Despesa("Corte de Cabelo", CategoriaDespesa.CUIDADOS_PESSOAIS, LocalDate.now(), 45));
	  despesas.add(new Despesa("Combustível", CategoriaDespesa.VEICULO, LocalDate.now(), 80));
	  despesas.add(new Despesa("Tênis", CategoriaDespesa.VESTUARIO, LocalDate.now(), 237));
	  despesas.add(new Despesa("Almoço", CategoriaDespesa.ALIMENTACAO, LocalDate.now(), 30));
	  despesas.add(new Despesa("Conta de Energia", CategoriaDespesa.MORADIA, LocalDate.now(), 170));
	  despesas.add(new Despesa("Pós Graduação", CategoriaDespesa.EDUCACAO, LocalDate.now(), 850));
	  despesas.add(new Despesa("Plano de Saúde", CategoriaDespesa.SAUDE, LocalDate.now(), 360));
	  
	  return despesas;
	}
	
}
