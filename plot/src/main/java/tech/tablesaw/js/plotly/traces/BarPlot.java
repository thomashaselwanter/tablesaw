package tech.tablesaw.js.plotly.traces;

import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;
import tech.tablesaw.js.plotly.components.AbstractTrace;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

public class BarPlot extends AbstractTrace {

    public enum Orientation {
        VERTICAL("v"),
        HORIZONTAL("h");

        String value;

        Orientation(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    private Object[] x;
    private double[] y;
    private Orientation orientation;

    BarPlot(BarBuilder builder) {
        super(builder);
        this.orientation = builder.orientation;
        this.x = builder.x;
        this.y = builder.y;
    }

    public static BarBuilder builder(Object[] x, double[] y) {
        return new BarBuilder(x, y);
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

    private Map<String, Object> getContext(int i) {

        Map<String, Object> context = super.getContext();
        context.put("variableName", "trace" + i);
        if (orientation == Orientation.HORIZONTAL) {
            context.put("x", dataAsString(y));
            context.put("y", dataAsString(x));
        } else {
            context.put("y", dataAsString(y));
            context.put("x", dataAsString(x));
        }
        context.put("orientation", orientation.value);
        return context;
    }
}
