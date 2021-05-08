package org.dl;

import java.io.IOException;
import tech.tablesaw.api.Table;
//import tech.tablesaw.plotly.plot;
import tech.tablesaw.plotly.*;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.BoxTrace;
import tech.tablesaw.plotly.traces.HistogramTrace;

public class Visualization {
	public static void main(String args[]) {
		System.out.println("data Visualization");
		try {
		Table clean_data=Table.read().csv("C:\\Users\\dell\\eclipse-workspace\\org.dl\\src\\main\\java\\org\\dl\\clean_data.csv");
		System.out.println(clean_data.structure());
		System.out.println(clean_data.shape());
		System.out.println(clean_data.first(7));
		System.out.println(clean_data.summary());
		//box_plot
		/*
		* Layout layout2=Layout.builder().title("income by people").build(); BoxTrace
		* trace2=BoxTrace.builder(bank_data.categoricalColumn("pep"),bank_data.nCol(
		* "income")).build(); Plot.show(new Figure(layout2,trace2)); 
		*/
		//histogram of Location
		Layout layout1=Layout.builder().title("Distribution of Location").build();
		HistogramTrace trace1=HistogramTrace.builder(clean_data.nCol("Location")).build();
		Plot.show(new Figure(layout1,trace1));

		//year
		Layout l2=Layout.builder().title("Distribution of Year").build();
		HistogramTrace t2=HistogramTrace.builder(clean_data.nCol("Year")).build();
		Plot.show(new Figure(l2,t2));

		//kilometers driven
		Layout l3=Layout.builder().title("Distribution of Kilometers Driven").build();
		HistogramTrace t3=HistogramTrace.builder(clean_data.nCol("Kilometers_Driven")).build();
		Plot.show(new Figure(l3,t3));

		//Fuel_Type
		Layout l4=Layout.builder().title("Distribution of Fuel Type").build();
		HistogramTrace t4=HistogramTrace.builder(clean_data.nCol("Fuel_Type")).build();
		Plot.show(new Figure(l4,t4));

		//Mileage
		Layout l5=Layout.builder().title("Distribution of Mileage").build();
		HistogramTrace t5=HistogramTrace.builder(clean_data.nCol("Mileage")).build();
		Plot.show(new Figure(l5,t5));

		//Engine
		Layout l6=Layout.builder().title("Distribution of Engine").build();
		HistogramTrace t6=HistogramTrace.builder(clean_data.nCol("Engine")).build();
		Plot.show(new Figure(l6,t6));

		//Power
		Layout l7=Layout.builder().title("Distribution of Power").build();
		HistogramTrace t7=HistogramTrace.builder(clean_data.nCol("Power")).build();
		Plot.show(new Figure(l7,t7));

		//Seats
		Layout l8=Layout.builder().title("Distribution of Seats").build();
		HistogramTrace t8=HistogramTrace.builder(clean_data.nCol("Seats")).build();
		Plot.show(new Figure(l8,t8));

		//Price
		Layout l9=Layout.builder().title("Distribution of Price").build();
		HistogramTrace t9=HistogramTrace.builder(clean_data.nCol("Price")).build();
		Plot.show(new Figure(l9,t9));
		}
		catch(IOException e){
		e.printStackTrace();
		}
		}
}
