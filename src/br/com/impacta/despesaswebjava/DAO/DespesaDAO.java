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
	  despesas.add(new Despesa("Combust�vel", CategoriaDespesa.VEICULO, LocalDate.now(), 80));
	  despesas.add(new Despesa("T�nis", CategoriaDespesa.VESTUARIO, LocalDate.now(), 237));
	  despesas.add(new Despesa("Almo�o", CategoriaDespesa.ALIMENTACAO, LocalDate.now(), 30));
	  despesas.add(new Despesa("Conta de Energia", CategoriaDespesa.MORADIA, LocalDate.now(), 170));
	  despesas.add(new Despesa("P�s Gradua��o", CategoriaDespesa.EDUCACAO, LocalDate.now(), 850));
	  despesas.add(new Despesa("Plano de Sa�de", CategoriaDespesa.SAUDE, LocalDate.now(), 360));
	  
	  return despesas;
	}
	
}
