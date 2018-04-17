package tech.tablesaw.js.plotly;

import tech.tablesaw.js.display.Browser;
import tech.tablesaw.js.plotly.components.Figure;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Plot {

    public static void plot(Figure figure, String divName, File outputFile) {
        try {
            show(figure, divName, outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void show(Figure figure, String divName, File outputFile) throws IOException {
        String output = figure.asJavascript(divName);

        try (FileWriter fileWriter = new FileWriter(outputFile)) {

            fileWriter.write(output);
        }
        new Browser().browse(outputFile);
    }


}
