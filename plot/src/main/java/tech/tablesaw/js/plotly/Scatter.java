package tech.tablesaw.js.plotly;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;
import tech.tablesaw.js.display.Browser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Scatter {

    private final File outputFile;

    private final String type;
    private final String yLabel;
    private final String xLabel;
    private PebbleEngine engine;
    private final String mode;

    Scatter(ScattterBuilder builder) throws PebbleException {
        engine = new PebbleEngine.Builder().build();

        this.mode = builder.mode();
        this.type = builder.type();
        outputFile = Paths.get("../testoutput/output.html").toFile();

        this.yLabel = builder.yLable();
        this.xLabel = builder.xLabel();
    }

    public void show() throws IOException, PebbleException {
        Writer writer = new StringWriter();
        PebbleTemplate compiledTemplate = engine.getTemplate("../plot/src/main/resources/template.html");

        Map<String, Object> context = new HashMap<>();
        context.put("type", type);
        context.put("mode", mode);

        compiledTemplate.evaluate(writer, context);
        String output = writer.toString();

        try (FileWriter fileWriter = new FileWriter(outputFile)) {

          fileWriter.write(output);
        }
        new Browser().browse(outputFile);
    }
}
