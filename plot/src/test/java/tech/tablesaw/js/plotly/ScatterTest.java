package tech.tablesaw.js.plotly;

import org.junit.Test;
import tech.tablesaw.js.plotly.components.Figure;
import tech.tablesaw.js.plotly.traces.Scatter;

import java.io.File;
import java.nio.file.Paths;

public class ScatterTest {

    @Test
    public void testAsJavascript() {
        Scatter trace = Scatter.builder()
                .xLabel("foo")
                .yLabel("bar")
                .build();

        System.out.println(trace.asJavascript(1));
    }

    @Test
    public void show() throws Exception {

        Scatter trace = Scatter.builder()
                .mode("markers")
                .xLabel("foo")
                .yLabel("bar")
                .build();

        Figure figure = new Figure(trace);
        File outputFile = Paths.get("../testoutput/output.html").toFile();

        Plot.plot(figure, "target", outputFile);
    }
}