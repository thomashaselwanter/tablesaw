package tech.tablesaw.js.plotly.components;

public class Figure {

    private Trace[] data;
    private Layout layout;

    public Figure(Layout layout, Trace... traces) {
        this.data = traces;
        this.layout = layout;
    }

    public Figure(Trace... traces) {
        this.data = traces;
        this.layout = null;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        if (layout != null) {
            builder.append(layout.toString());
        }
        builder.append(dataToString());
        return builder.toString();
    }

    private String dataToString() {
        StringBuilder builder = new StringBuilder();
        if (data.length == 0) {
            return builder.toString();
        } else {
            for (int i = 0; i < data.length; i++) {
                builder.append("trace")
                        .append(i)
                        .append(" = ")
                        .append(data[i]);
                if (i < data.length - 1) {
                    builder.append(", ");
                }
                builder.append('\n');
            }
        }

        builder.append('\n');
        builder.append("data = [");

        for (int i = 0; i < data.length; i++) {
            builder.append("trace");
            builder.append(i);
            if (i < data.length - 1) {
                builder.append(", ");
            }
        }
        builder.append("]\n");
        return builder.toString();
    }
}
