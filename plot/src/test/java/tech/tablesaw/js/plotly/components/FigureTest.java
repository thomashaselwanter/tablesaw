package tech.tablesaw.js.plotly.components;

import org.junit.Test;
import tech.tablesaw.js.plotly.Plot;
import tech.tablesaw.js.plotly.traces.Scatter;

import java.io.File;
import java.nio.file.Paths;

public class FigureTest {

    private String divName = "target";
    private File outputFile = Paths.get("../testoutput/output.html").toFile();

    private double[] x = {1, 2, 3, 4, 5};
    private double[] y = {1, 4, 9, 16, 25};

    @Test
    public void asJavascript() {

        Trace trace = Scatter.builder(x, y).build();
        Figure figure = new Figure(trace);

        System.out.println(figure.asJavascript(divName));
    }

    @Test
    public void asJavascript2() {

        Trace trace = Scatter.builder(x, y)
                .build();

        Layout layout = Layout.builder()
                .title("A test title")
                .xAxis(
                        Axis.builder()
                                .title("the x axis")
                                .build())
                .build();

        Figure figure = new Figure(layout, trace);

        System.out.println(figure.asJavascript(divName));
    }

    @Test
    public void show2()  {
        Trace trace = Scatter.builder(x, y)
                .build();

        Layout layout = Layout.builder()
                .title("A test title")
                .xAxis(
                        Axis.builder()
                                .title("the x axis").build()
                ).build();

        Figure figure = new Figure(layout, trace);

        Plot.plot(figure, divName, outputFile);
    }
    @Test
    public void show()  {
        Trace trace = Scatter.builder(x, y).build();

        Figure figure = new Figure(trace);

        Plot.plot(figure, divName, outputFile);
    }
}