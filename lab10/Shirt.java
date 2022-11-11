package lab10;

import java.util.Arrays;

public class Shirt {
    String[] shirts;

    public Shirt(String[] shirts) {
        this.shirts = shirts;
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();

        builder.append("Shirt class");

        for (int i = 0; i < shirts.length; i++) {
            builder.append("\nshirt[")
                    .append(i)
                    .append("] = \"")
                    .append(shirts[i])
                    .append("\";");
        }
        return builder.toString();
    }
}
