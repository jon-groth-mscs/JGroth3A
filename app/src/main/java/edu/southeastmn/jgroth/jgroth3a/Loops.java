package edu.southeastmn.jgroth.jgroth3a;
import java.text.DecimalFormat;
/**
 * Created by tripl on 4/16/2017.
 */

public class Loops {
    private int max;

    public Loops(int max) {
        this.max = max;
    }

    public String whileLoop() {
        DecimalFormat fmt = new DecimalFormat("  00");
        StringBuilder output = new StringBuilder("While Loop\nCount\tSum\n=====\t=====\n");
        int total = 0, a = 1;

        while (a < max)
        {
            total += a;
            output.append(fmt.format(a)); output.append('\t');
            output.append(fmt.format(total)); output.append('\n');
            a++;
        }

        return output.toString();

    }

    public String doWhileLoop() {
        DecimalFormat fmt = new DecimalFormat("  00");
        StringBuilder output = new StringBuilder("Do While Loop\nCount\tSum\n=====\t=====\n");
        int total = 0, a = 1;

        do
        {
            total += a;
            output.append(fmt.format(a)); output.append('\t');
            output.append(fmt.format(total)); output.append('\n');
            a++;
        } while (a < max);

        return output.toString();

    }

    public String forLoop() {
        DecimalFormat fmt = new DecimalFormat("  00");
        StringBuilder output = new StringBuilder("For Loop\nCount\tSum\n=====\t=====\n");
        int total = 0, a;

        for (a = 1; a < max; a++)
        {
            total += a;
            output.append(fmt.format(a)); output.append('\t');
            output.append(fmt.format(total)); output.append('\n');
        }

        return output.toString();

    }
}

