package exercicioPAPG;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GraficoBarra {
	
	public void teste(int[] Array) throws IOException{
		FileWriter arq = new FileWriter("graficoBarra.HTML");
		PrintWriter gravarArqq = new PrintWriter(arq);
		 
		    gravarArqq.printf("<html>\n" + 
		    		"  <head>\n" + 
		    		"    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n" + 
		    		"    <script type=\"text/javascript\">\n" + 
		    		"      google.charts.load('current', {'packages':['bar']});\n" + 
		    		"      google.charts.setOnLoadCallback(drawChart);\n" + 
		    		"\n" + 
		    		"      function drawChart() {\n" + 
		    		"        var data = google.visualization.arrayToDataTable([\n" + 
		    		"          ['Year', 'progressao']," ); 
		    for (int i = 0; i < Array.length; i++) {
		    	gravarArqq.printf("['"+Array[i]+"',"+Array[i]+"],\n");
			}
		   gravarArqq.printf("]);\n" + 
		   		"\n" + 
		   		"        var options = {\n" + 
		   		"          chart: {\n" + 
		   		"            title: 'Company Performance',\n" + 
		   		"            subtitle: 'Sales, Expenses, and Profit: 2014-2017',\n" + 
		   		"          },\n" + 
		   		"          bars: 'horizontal' // Required for Material Bar Charts.\n" + 
		   		"        };\n" + 
		   		"\n" + 
		   		"        var chart = new google.charts.Bar(document.getElementById('barchart_material'));\n" + 
		   		"\n" + 
		   		"        chart.draw(data, google.charts.Bar.convertOptions(options));\n" + 
		   		"      }\n" + 
		   		"    </script>\n" + 
		   		"  </head>\n" + 
		   		"  <body>\n" + 
		   		"    <div id=\"barchart_material\" style=\"width: 900px; height: 500px;\"></div>\n" + 
		   		"  </body>\n" + 
		   		"</html>");
		   
		   arq.close();
		
	  }
}
