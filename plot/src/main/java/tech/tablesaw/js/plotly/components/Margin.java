package tech.tablesaw.js.plotly.components;

import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * The margin for the plot
 */
public class Margin extends Component {

    /**
     * The left margin, in px
     */
    private int left = 80;

    /**
     * The right margin, in px
     */
    private int right = 80;

    /**
     * The top margin, in px
     */
    private int top = 100;


    /**
     * The bottom margin, in px
     */
    private int bottom = 80;

    /**
     * The amount of padding between the plotting area and the axis lines, in px
     */
    private int pad = 0;

    private boolean autoExpand = true;

    public static MarginBuilder builder() {
        return new MarginBuilder();
    }

    Margin(MarginBuilder builder) {
        this.left = builder.left;
        this.right = builder.right;
        this.top = builder.top;
        this.bottom = builder.bottom;
        this.pad = builder.pad;
        this.autoExpand = builder.autoExpand;
    }

    String asJavascript() {
        Writer writer = new StringWriter();
        PebbleTemplate compiledTemplate;

        try {
            compiledTemplate = engine.getTemplate("../plot/src/main/resources/margin_template.html");
            compiledTemplate.evaluate(writer, getContext());
        } catch (PebbleException | IOException e) {
            e.printStackTrace();
        }
        return writer.toString();
    }

    private Map<String, Object> getContext() {
        Map<String, Object> context = new HashMap<>();
        context.put("top", top);
        context.put("bottom", bottom);
        context.put("right", right);
        context.put("left", left);
        context.put("pad", pad);
        context.put("autoExpand", autoExpand);
        return context;
    }

}
