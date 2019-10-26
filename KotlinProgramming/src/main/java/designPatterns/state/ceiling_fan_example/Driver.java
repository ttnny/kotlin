package designPatterns.state.ceiling_fan_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {
    public static void main(String[] args) {
        PullChain chain = new PullChain();

        while (true) {
            System.out.println("Press Enter");
            getInput();
            chain.pull();
            System.out.println();
        }
    }

    public static String getInput() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String input = null;
        try {
            input = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return input;
    }
}
