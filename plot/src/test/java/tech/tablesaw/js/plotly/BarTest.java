package tech.tablesaw.js.plotly;

import org.junit.Test;
import tech.tablesaw.js.plotly.components.Figure;
import tech.tablesaw.js.plotly.traces.BarPlot;

import java.io.File;
import java.nio.file.Paths;

public class BarTest {

    private final Object[] x = {"sheep", "cows", "fish", "tree sloths"};
    private final double[] y = {1, 4, 9, 16};

    @Test
    public void testAsJavascript() throws Exception {
        BarPlot trace = BarPlot.builder(x, y)
                .build();

        System.out.println(trace.asJavascript(1));
    }

    @Test
    public void show() throws Exception {

        BarPlot trace = BarPlot.builder(x, y).build();

        Figure figure = new Figure(trace);
        File outputFile = Paths.get("../testoutput/output.html").toFile();

        Plot.plot(figure, "target", outputFile);
    }
}