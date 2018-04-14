package tech.tablesaw.js.plotly;

import tech.tablesaw.api.Table;
import tech.tablesaw.columns.Column;
import tech.tablesaw.js.display.Browser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class Plot {

    private final Table table;
    private final Column[] columns;
    private final File outputFile;

    private final String kind;
    private final String title;
    private final String yLabel;
    private final String xLabel;

    Plot(PlotBuilder builder) {
        this.table = builder.table();
        this.kind = builder.kind();
        this.columns = builder.columns();
        outputFile = Paths.get("../output.html").toFile();

        this.title = builder.title();
        this.yLabel = builder.yLable();
        this.xLabel = builder.xLabel();
    }

    public void show() throws IOException {

        try (FileWriter writer = new FileWriter(outputFile)) {
          writer.write(getHtml());
        }
        new Browser().browse(outputFile);
    }

    private String getHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html>" +
                "<head>" +
                "<title>Tablesaw Charts</title>" +
                "</head>" +
                "<body>" +
                "<h1>Hello World</h1>" +
                "<div></div>" +  // put the plot here
                "</body>" +
                "</html>");
        return builder.toString();
    }

}
