package exercicioPAPG;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GraficoLinha {
	public void teste(int[] Array) throws IOException{
		 FileWriter arq = new FileWriter("graficoLinha.HTML");
		PrintWriter gravarArqq = new PrintWriter(arq);
		 
		    gravarArqq.printf("<html>\r\n" + 
		    		"	  <head>\n" + 
		    		"	    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n" + 
		    		"	    <script type=\"text/javascript\">\n" + 
		    		"	      google.charts.load('current', {'packages':['corechart']});\n" + 
		    		"	      google.charts.setOnLoadCallback(drawChart);\n" + 
		    		"\n" + 
		    		"	      function drawChart() {\n" + 
		    		"	        var data = google.visualization.arrayToDataTable([\n" + 
		    		"	 ['Year', 'Progressao'],\n" ); 
		    for (int i = 0; i < Array.length; i++) {
		    	gravarArqq.printf("['"+Array[i]+"',"+Array[i]+"],\n");
			}
		   gravarArqq.printf("	        ]);\n" + 
		    		"\n" + 
		    		"	        var options = {\n" + 
		    		"	          title: 'Company Performance',\n" + 
		    		"	          curveType: 'function',\n" + 
		    		"	          legend: { position: 'bottom' }\n" + 
		    		"	        };\n" + 
		    		"\n" + 
		    		"	        var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));\n" + 
		    		"\n" + 
		    		"	        chart.draw(data, options);\n" + 
		    		"	      }\n" + 
		    		"	    </script>\n" + 
		    		"	  </head>\n" + 
		    		"	  <body>\n" + 
		    		"	    <div id=\"curve_chart\" style=\"width: 900px; height: 500px\"></div>\n" + 
		    		"	  </body>"+
		    		"     </html>");
		   
		   arq.close();
		
	  }
	
}
