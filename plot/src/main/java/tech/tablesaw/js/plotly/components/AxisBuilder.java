package tech.tablesaw.js.plotly.components;

import static tech.tablesaw.js.plotly.components.Axis.AutoRange.TRUE;

public class AxisBuilder {

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

    public Axis build() {
        return new Axis(this);
    }
}
