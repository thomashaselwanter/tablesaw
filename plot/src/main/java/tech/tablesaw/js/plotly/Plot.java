package tech.tablesaw.js.plotly;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;
import tech.tablesaw.api.Table;
import tech.tablesaw.columns.Column;
import tech.tablesaw.js.display.Browser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Plot {

    private final Table table;
    private final Column[] columns;
    private final File outputFile;

    private final String type;
    private final String chartTitle;
    private final String windowTitle;
    private final String yLabel;
    private final String xLabel;
    private PebbleEngine engine;
    private final String mode;

    Plot(PlotBuilder builder) throws PebbleException {
        engine = new PebbleEngine.Builder().build();

        this.mode = builder.mode();
        this.table = builder.table();
        this.type = builder.type();
        this.windowTitle = builder.windowTitle();
        this.columns = builder.columns();
        outputFile = Paths.get("../output.html").toFile();

        this.chartTitle = builder.title();
        this.yLabel = builder.yLable();
        this.xLabel = builder.xLabel();
    }

    public void show() throws IOException, PebbleException {
        Writer writer = new StringWriter();
        PebbleTemplate compiledTemplate = engine.getTemplate("../plot/src/main/resources/template.html");

        Map<String, Object> context = new HashMap<>();
        context.put("windowTitle", windowTitle);
        context.put("title", chartTitle);
        context.put("type", type);
        context.put("mode", mode);

        compiledTemplate.evaluate(writer, context);
        String output = writer.toString();

        try (FileWriter fileWriter = new FileWriter(outputFile)) {

          fileWriter.write(output);
        }
        new Browser().browse(outputFile);
    }

    private String getHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html>" +
                "<head>" +
                "<chartTitle>Tablesaw Charts</chartTitle>\n" +
                "\t<script src=\"plotly-latest.min.js\"></script>\n" +
                "\t<script src=\"https://cdn.plot.ly/plotly-latest.min.js\"></script>\n" +
                "</head>\n" +
                "<body>" +
                "<div id=\"tester\" style=\"width:600px;height:250px;\"></div>" +  // put the plot here
                "<script>\n" +
                "\tTESTER = document.getElementById('tester');\n" +
                "\tPlotly.plot( TESTER, [{\n" +
                "\tx: [1, 2, 3, 4, 5],\n" +
                "\ty: [1, 2, 4, 8, 16] }], {\n" +
                "\tmargin: { t: 0 } } );\n" +
                "</script>" +
                "</body>" +
                "</html>");
        return builder.toString();
    }

}
