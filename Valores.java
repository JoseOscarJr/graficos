package exercicioPAPG;

import java.io.IOException;

public class Valores {
	private int a1;
	private int razao;
	private int quatElemento;
	private ProgrecaoPgPa tipo;
	
	public ProgrecaoPgPa getTipo() {
		return tipo;
	}
	public void setTipo(ProgrecaoPgPa tipo) {
		this.tipo = tipo;
	}
	public int getA1() {
		return a1;
	}
	public void setA1(int a1) {
		this.a1 = a1;
	}
	public int getRazao() {
		return razao;
	}
	public void setRazao(int razao) {
		this.razao = razao;
	}
	public int getQuatElemento() {
		return quatElemento;
	}
	public void setQuatElemento(int quatElemento) {
		this.quatElemento = quatElemento;
	}
		
		public int[] criarArray() {
			int[] arrayPg = new int[quatElemento];
			switch (tipo) {
			case PA:
				for (int i = 0; i < quatElemento; i++) {
					if(i == 0) {
						arrayPg[i] = a1;
					}else {
						arrayPg[i] += arrayPg[i-1]+razao; 
					}
				}
				break;

			case PG:
				for (int i = 0; i < quatElemento; i++) {
					if(i == 0) {
						arrayPg[i] = a1;
					}else {
						arrayPg[i] += arrayPg[i-1]*razao; 
					}
				}
				break;
				
			default:
				break;
			}
			for (int i = 0; i < arrayPg.length; i++) {
				System.out.print(arrayPg[i]+" ");
			}
			return arrayPg;
		
	}
		public double media(int[] array) {
			double cont = 0;
			for (int i = 0; i < array.length; i++) {
				cont += array[i];
			}
			return cont/array.length;
		}
		public double somatoria(int[] array) {
			double cont = 0;
			for (int i = 0; i < array.length; i++) {
				cont += array[i];
			}
			return cont;
		}
		public int quantidadeElemento(int[] array) {
			return array.length;
		}
		public double mediana(int[] array) {
			int cont = 0;
			int contAux =0;
			if( array.length % 2 == 1) {
				cont = Math.round(array.length/2);
				return array[cont];
			}else {
				cont = Math.round(array.length/2);
				contAux = cont-1;
				return (array[cont]+array[contAux])/2;
			}
		}
		public int descobrirRazao(String nomeArq, String varAux) throws IOException {
			Gson gson = new Gson();
			int[] vetor = new int[gson.ler(nomeArq).length];
			vetor = gson.ler(nomeArq);
			if(varAux.equalsIgnoreCase("PA")) {
				System.out.println(vetor[0]+ "  " +  vetor[1]);
				return vetor[1]-vetor[0];
			}else if(varAux.equalsIgnoreCase("PG")) {
				System.out.println(vetor[0]+ "  " +  vetor[1]);
				return vetor[1]/vetor[0];
			} else {
				return 0;
			}
		}
		public int descobrirA1(String nomeArq) throws IOException {
			Gson gson = new Gson();
			int[] vetor = new int[gson.ler(nomeArq).length];
			vetor = gson.ler(nomeArq);
			return vetor[0];
		}
		public String descobrirPAPG(String nomeArq) throws IOException {
			Gson gson = new Gson();
			int[] vetor = new int[gson.ler(nomeArq).length];
			vetor = gson.ler(nomeArq);
			String varPaPg;
			if((vetor[1]-vetor[0]) == (vetor[2] - vetor[1])) {
				varPaPg = "PA";
			}else if((vetor[1]/vetor[0]) == (vetor[2]/vetor[1])) { 
				varPaPg = "PG";
			}else {
				varPaPg = "Erro, O vetor tem um erro de progressao.";
			}
			return varPaPg;
		}
		public int quantNumero(String nomeArq) throws IOException {
			Gson gson = new Gson();
			int quati = gson.ler(nomeArq).length;
			return quati;
		}
		public int verificaAltera(String nomeArq) throws IOException {
			Gson gson = new Gson();
			int[] vetor = new int[gson.ler(nomeArq).length];
			vetor = gson.ler(nomeArq);
			int cont = 0;
			if(descobrirPAPG(nomeArq).equalsIgnoreCase("PA")) {
				for (int i = 0; i < vetor.length-1; i++) {
					if	(i == 0) {
						if((vetor[i+1]-getRazao()) != vetor[i]) {
							cont++;
						}
					}else if((vetor[i-1] + getRazao()) != vetor[i]){
						cont++;
					}
				}
			}else {
				for (int i = 0; i < vetor.length-1; i++) {
					if	(i == 0) {
						if((vetor[i+1]/ getRazao()) == vetor[i]) {
							cont++;
						}
					}else if((vetor[i-1] * getRazao()) == vetor[i]){
						cont++;
					}
				}
			}
			if(cont == 0) {
				return 100;
			}else {
				return ((cont * 100)/vetor.length);
			}
		}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Valores [a1=");
		builder.append(a1);
		builder.append(", razao=");
		builder.append(razao);
		builder.append(", quatElemento=");
		builder.append(quatElemento);
		builder.append("]");
		return builder.toString();
	}
	
	
}
