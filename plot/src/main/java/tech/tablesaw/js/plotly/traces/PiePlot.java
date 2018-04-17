package tech.tablesaw.js.plotly.traces;

import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;
import tech.tablesaw.js.plotly.components.AbstractTrace;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

public class PiePlot extends AbstractTrace {

    private Object[] x;
    private double[] y;

    PiePlot(PieBuilder builder) {
        super(builder);
        this.x = builder.x;
        this.y = builder.y;
    }

    public static PieBuilder builder(Object[] x, double[] y) {
        return new PieBuilder(x, y);
    }

    @Override
    public String asJavascript(int i) {
        Writer writer = new StringWriter();
        PebbleTemplate compiledTemplate;

        try {
            compiledTemplate = engine.getTemplate("../plot/src/main/resources/pie_trace_template.html");
            compiledTemplate.evaluate(writer, getContext(i));
        } catch (PebbleException | IOException e) {
            e.printStackTrace();
        }
        return writer.toString();
    }

    private Map<String, Object> getContext(int i) {

        Map<String, Object> context = super.getContext();
        context.put("variableName", "trace" + i);
        context.put("values", dataAsString(y));
        context.put("labels", dataAsString(x));
        return context;
    }
}
