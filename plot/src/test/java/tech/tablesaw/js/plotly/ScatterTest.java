package tech.tablesaw.js.plotly;

import org.junit.Test;
import tech.tablesaw.js.plotly.components.Figure;
import tech.tablesaw.js.plotly.traces.Scatter;

import java.io.File;
import java.nio.file.Paths;

public class ScatterTest {

    double[] x = {1, 2, 3, 4};
    double[] y = {1, 4, 9, 16};

    @Test
    public void testAsJavascript() {
        Scatter trace = Scatter.builder(x, y)
                .build();

        System.out.println(trace.asJavascript(1));
    }

    @Test
    public void show() throws Exception {

        Scatter trace = Scatter.builder(x, y)
                .mode("markers")
                .build();

        Figure figure = new Figure(trace);
        File outputFile = Paths.get("../testoutput/output.html").toFile();

        Plot.plot(figure, "target", outputFile);
    }
}