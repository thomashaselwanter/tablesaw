package tech.tablesaw.js.plotly.traces;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;
import tech.tablesaw.js.plotly.components.AbstractTrace;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Map;

public class Scatter extends AbstractTrace {

    private final PebbleEngine engine = new PebbleEngine.Builder().build();

    private final double[] y;
    private final double[] x;
    private final String mode;

    public static ScatterBuilder builder(double[] x, double[] y) {
        return new ScatterBuilder(x, y);
    }

    Scatter(ScatterBuilder builder) {
        super(builder);
        this.mode = builder.mode;
        this.y = builder.y;
        this.x = builder.x;
    }

    private Map<String, Object> getContext(int i) {

        Map<String, Object> context = super.getContext();
        context.put("variableName", "trace" + i);
        context.put("mode", mode);
        context.put("y", dataAsString(y));
        context.put("x", dataAsString(x));
        return context;
    }

    @Override
    public String asJavascript(int i) {
        Writer writer = new StringWriter();
        PebbleTemplate compiledTemplate;

        try {
            compiledTemplate = engine.getTemplate("../plot/src/main/resources/trace_template.html");
            compiledTemplate.evaluate(writer, getContext(i));
        } catch (PebbleException | IOException e) {
            e.printStackTrace();
        }
        return writer.toString();
    }

    private String dataAsString(double[] data) {
        return Arrays.toString(data);
    }
}
