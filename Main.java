package exercicioPAPG;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Valores valores = new Valores();
		
		/*valores.setA1(5);
		valores.setTipo(ProgrecaoPgPa.PA);
		valores.setQuatElemento(8);
		valores.setRazao(2);*/
		Gson gson = new Gson();
		//gson.gravar(valores.criarArray(), "PA");
		//System.out.println(json.ler("PA"));
		/*System.out.println("Media "+valores.media(valores.criarArray()));
		System.out.println("Mediana "+valores.mediana(valores.criarArray()));
		System.out.println("somatoria "+valores.somatoria(valores.criarArray()));
		System.out.println("Quantidade Elementos "+valores.quantidadeElemento(valores.criarArray()));*/
		int[] vetor = new int[gson.ler("PA").length];
		vetor = gson.ler("PA");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		GraficoPizza graficoPizza = new GraficoPizza();
		graficoPizza.teste(vetor);
		valores.setRazao(valores.descobrirRazao("PA", "PA"));
		System.out.println(valores.getRazao()+"    "+valores.verificaAltera("PA")+"%");
		GraficoLinha graficoLinha = new GraficoLinha();
		graficoLinha.teste(vetor);
		GraficoBarra graficoBarra = new GraficoBarra();
		graficoBarra.teste(vetor);
	}

}
