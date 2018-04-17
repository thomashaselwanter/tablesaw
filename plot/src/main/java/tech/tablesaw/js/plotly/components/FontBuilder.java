package tech.tablesaw.js.plotly.components;

import com.google.common.base.Preconditions;

public class FontBuilder {

    Font.Family fontFamily = Font.Family.OPEN_SANS;

    int size = 12; // number greater than or equal to 1

    String color = "#444";

    public FontBuilder size(int size) {
        Preconditions.checkArgument(size >= 1);
        this.size = size;
        return this;
    }

    public FontBuilder color(String color) {
        this.color = color;
        return this;
    }

    public FontBuilder family(Font.Family family) {
        this.fontFamily = family;
        return this;
    }

    public Font build() {
        return new Font(this);
    }
}
