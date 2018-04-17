package tech.tablesaw.js.plotly.components;

import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import static tech.tablesaw.js.plotly.components.Axis.AutoRange.TRUE;

public class Axis extends Component {

    public enum Type {
        LINEAR("linear"),
        LOG("log"),
        DATE("date"),
        CATEGORY("category"),
        DEFAULT("-");

        private String value;

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum AutoRange {
        TRUE,
        FALSE,
        REVERSED;
    }

    public enum RangeMode {
        ENUMERATED,
        NORMAL,
        TO_ZERO,
        NON_NEGATIVE;
    }

    private String title = "";
    private boolean visible = true;
    private String color = "#444";
    private Font font;
    private Font titleFont;
    private Type type = Type.DEFAULT;
    private AutoRange autoRange = TRUE;
    private double[] range;
    private boolean fixedRange = true;  // true means the axis cannot be zoomed

    public static AxisBuilder builder() {
        return new AxisBuilder();
    }

    Axis(AxisBuilder builder) {
        this.title = builder.title;
        this.titleFont = builder.titleFont;
        this.type = builder.type;
        this.visible = builder.visible;
    }

    public String asJavascript() {
        Writer writer = new StringWriter();
        PebbleTemplate compiledTemplate;

        try {
            compiledTemplate = engine.getTemplate("../plot/src/main/resources/axis_template.html");
            compiledTemplate.evaluate(writer, getContext());
        } catch (PebbleException | IOException e) {
            e.printStackTrace();
        }
        return writer.toString();
    }


    private Map<String, Object> getContext() {
        Map<String, Object> context = new HashMap<>();
        context.put("title", title);
        context.put("titleFont", titleFont);
        context.put("visible", visible);
        context.put("type", type);
        return context;
    }
}
