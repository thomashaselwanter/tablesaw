package tech.tablesaw.js.plotly;

import org.junit.Test;
import tech.tablesaw.js.plotly.components.Figure;
import tech.tablesaw.js.plotly.traces.BoxPlot;

import java.io.File;
import java.nio.file.Paths;

public class BoxTest {

    private final Object[] x = {"sheep", "cows", "fish", "tree sloths", "sheep", "cows", "fish", "tree sloths", "sheep", "cows", "fish", "tree sloths"};
    private final double[] y = {1, 4, 9, 16, 3, 6, 8, 8, 2, 4, 7, 11};

    @Test
    public void testAsJavascript() throws Exception {
        BoxPlot trace = BoxPlot.builder(x, y)
                .build();

        System.out.println(trace.asJavascript(1));
    }

    @Test
    public void show() throws Exception {

        BoxPlot trace = BoxPlot.builder(x, y).build();

        Figure figure = new Figure(trace);
        File outputFile = Paths.get("../testoutput/output.html").toFile();

        Plot.plot(figure, "target", outputFile);
    }
}