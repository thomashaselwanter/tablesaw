package tech.tablesaw.js.plotly.traces;

import org.junit.Test;
import tech.tablesaw.js.plotly.Plot;
import tech.tablesaw.js.plotly.components.Figure;

import java.io.File;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class HistogramTest {

    private final double[] y = {1, 4, 9, 16, 11, 4, -1, 20, 4, 7, 9, 12, 8, 6};

    @Test
    public void testAsJavascript() throws Exception {
        Histogram trace = Histogram.builder(y)
                .build();

        System.out.println(trace.asJavascript(1));
    }

    @Test
    public void show() throws Exception {

        Histogram trace = Histogram.builder(y).build();

        Figure figure = new Figure(trace);
        File outputFile = Paths.get("../testoutput/output.html").toFile();

        Plot.plot(figure, "target", outputFile);
    }

}