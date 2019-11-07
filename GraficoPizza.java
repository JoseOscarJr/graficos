package exercicioPAPG;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GraficoPizza {

		
		public void teste(int[] Array) throws IOException{
		
		 FileWriter arq = new FileWriter("Google.HTML");
		 PrintWriter gravarArq = new PrintWriter(arq);
		 
		    gravarArq.printf("<html>\n" + 
		    		"  <head>\n" + 
		    		"    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n" + 
		    		"    <script type=\"text/javascript\">\n" + 
		    		"      google.charts.load('current', {'packages':['corechart']});\n" + 
		    		"      google.charts.setOnLoadCallback(drawChart);\n" + 
		    		"\n" + 
		    		"      function drawChart() {\n" + 
		    		"\n" + 
		    		"        var data = google.visualization.arrayToDataTable([\n" + 
		    		"          ['Task', 'Hours per Day'],"); 
		    		for (int i = 0; i < Array.length; i++) {
						gravarArq.printf("['"+Array[i]+"', "+Array[i]+"],\r\n");
						System.out.println();
		   
		    		}
		    		gravarArq.printf("]);\n" + 
		    				"\n" + 
		    				"        var options = {\n" + 
		    				"          title: 'My Daily Activities'\n" + 
		    				"        };\n" + 
		    				"\n" + 
		    				"        var chart = new google.visualization.PieChart(document.getElementById('piechart'));\n" + 
		    				"\n" + 
		    				"        chart.draw(data, options);\n" + 
		    				"      }\n" + 
		    				"    </script>\n" + 
		    				"  </head>\n" + 
		    				"  <body>\n" + 
		    				"    <div id=\"piechart\" style=\"width: 900px; height: 500px;\"></div>\n" + 
		    				"  </body>\n" + 
		    				"</html>");
		    arq.close();

	}
	
}
