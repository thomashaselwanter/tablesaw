package tech.tablesaw.js.plotly.components;

import static tech.tablesaw.js.plotly.components.Axis.AutoRange.TRUE;

public class AxisBuilder {

    public Font titleFont;
    String title = "";
    boolean visible = true;
    String color = "#444";
    Font font;
    Axis.Type type = Axis.Type.DEFAULT;
    Axis.AutoRange autoRange = TRUE;
    double[] range;
    boolean fixedRange = true;  // true means the axis cannot be zoomed

    public AxisBuilder title(String title) {
        this.title = title;
        return this;
    }

    public AxisBuilder titleFont(Font titleFont) {
        this.titleFont = titleFont;
        return this;
    }

    public AxisBuilder type(Axis.Type type) {
        this.type = type;
        return this;
    }

    public AxisBuilder visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public Axis build() {
        return new Axis(this);
    }
}
