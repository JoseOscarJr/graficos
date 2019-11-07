package exercicioPAPG;
import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;


public class Gson {
		public boolean gravar(int[] lista, String nomeArq) throws IOException {
			FileWriter writer = new FileWriter(nomeArq+".json");
			GsonBuilder builder = new GsonBuilder();
		    com.google.gson.Gson gson = builder.create();
		    writer.write(gson.toJson(lista));
		    writer.close();
			return false;
		}
		public int[] ler(String nomeArq) throws IOException {
			Valores valores = new Valores();
		    GsonBuilder builder = new GsonBuilder();
		    com.google.gson.Gson gson = builder.create();
		    builder = new GsonBuilder();
		    gson = builder.create();
		    BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArq+".json"));

		    String linha =bufferedReader.readLine();
		    
		    linha =linha.replace("[", "");
		    linha = linha.replace("]", "");
		    String[] vetor = linha.split(",");
		    int[] vetorInt = new int[vetor.length];
		    for (int i = 0; i < vetor.length; i++) {
				vetorInt[i] = Integer.parseInt(vetor[i]);
			}
		    return vetorInt;
		}

}

