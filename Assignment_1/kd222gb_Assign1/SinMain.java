package kd222gb_Assign1;

import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SinMain {

            public static void main(String[] args) throws Exception {
                //using x-chart to create and customize chart
                XYChart graph = new XYChartBuilder().width(600).height(400).build();
                graph.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Scatter);
                graph.getStyler().setChartTitleVisible(false);
                graph.getStyler().setLegendPosition(Styler.LegendPosition.InsideSW);
                graph.getStyler().setMarkerSize(5);
                // Prints the data
               
                Random rand = new Random();
                ArrayList xData = new ArrayList();
                List yData = new ArrayList();
                int size = 1000;
                for (double n = 0; n <= 2 * Math.PI; n=n+0.01) {
                    xData.add(n);
                    double x = n;
                    yData.add((1 + x/Math.PI)*Math.cos(x)*Math.cos(x));


                }
                // Display scatter plot
                graph.addSeries("Slope", xData, yData);
                new SwingWrapper(graph).displayChart();

            }
}
