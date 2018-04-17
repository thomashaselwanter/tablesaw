package tech.tablesaw.js.plotly.components;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractTrace implements Trace {

    private final PebbleEngine engine = new PebbleEngine.Builder().build();

    public enum Visibility {
        TRUE,
        FALSE,
        LEGEND_ONLY
    }

    protected final String type;

    private final Visibility visible;

    private final double[] x;

    private final double[] y;

    /**
     * Determines whether or not an item corresponding to this trace is shown in the legend.
     */
    private final boolean showLegend;

    /**
     * Sets the legend group for this trace. Traces part of the same legend group hide/show at the same time
     * when toggling legend items.
     */
    private final String legendGroup;

    /**
     * Sets the opacity of the trace.
     */
    private final double opacity; // number between or equal to 0 and 1


    /**
     * Sets the trace name. The trace name appear as the legend item and on hover.
     */
    private final String name;

    /**
     * Assigns id labels to each datum. These ids for object constancy of data points during animation.
     * Should be an array of strings, not numbers or any other type.
     */
    private final String[] ids;

    private final HoverLabel hoverLabel;

    public AbstractTrace(TraceBuilder builder) {
        this.type = builder.getType();
        this.name = builder.name;
        this.showLegend = builder.showLegend;
        this.legendGroup = builder.legendGroup;
        this.visible = builder.visible;
        this.ids = builder.ids;
        this.hoverLabel = builder.hoverLabel;
        this.opacity = builder.opacity;
        this.x = builder.x;
        this.y = builder.y;
    }

    @Override
    public String toString() {
        Writer writer = new StringWriter();
        PebbleTemplate compiledTemplate;

        try {
            compiledTemplate = engine.getTemplate("../plot/src/main/resources/trace_template.html");
            compiledTemplate.evaluate(writer, getContext());
        } catch (PebbleException | IOException e) {
            e.printStackTrace();
        }
        return writer.toString();
    }

    protected Map<String, Object> getContext() {
        Map<String, Object> context = new HashMap<>();
        context.put("type", type);
        context.put("name", name);
        context.put("showLegend", showLegend);
        context.put("legendGroup", legendGroup);
        context.put("visible", visible);
        context.put("ids", ids);
        context.put("hoverLable", hoverLabel);
        context.put("opacity", opacity);
        return context;
    }
}
