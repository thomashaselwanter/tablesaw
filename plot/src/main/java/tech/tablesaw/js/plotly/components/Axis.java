package tech.tablesaw.js.plotly.components;

import static tech.tablesaw.js.plotly.components.Axis.AutoRange.TRUE;

public abstract class Axis {

    public enum Type {
        LINEAR,
        LOG,
        DATE,
        CATEGORY,
        DEFAULT;
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
    private Type type = Type.DEFAULT;
    private AutoRange autoRange = TRUE;
    private double[] range;
    private boolean fixedRange = true;  // true means the axis cannot be zoomed



}
