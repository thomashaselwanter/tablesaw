package tech.tablesaw.js.plotly.components;

import org.junit.Test;
import tech.tablesaw.js.plotly.Plot;
import tech.tablesaw.js.plotly.traces.Scatter;

import java.io.File;
import java.nio.file.Paths;

public class FigureTest {

    @Test
    public void asJavascript() {

        String divName = "target";
        Trace trace = Scatter.builder().build();
        Figure figure = new Figure(trace);

        System.out.println(figure.asJavascript(divName));

    }

    @Test
    public void show()  {
        String divName = "target";
        Trace trace = Scatter.builder().build();
        Figure figure = new Figure(trace);

        File outputFile = Paths.get("../testoutput/output.html").toFile();
        Plot.plot(figure, divName, outputFile);
    }
}