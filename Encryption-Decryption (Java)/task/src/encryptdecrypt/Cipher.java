package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Cipher {
    String[] args;

    public Cipher(String[] args) {
        this.args = args;
    }

    public void code() {
        String option = "";
        String plainText = "";
        int key = 0;
        String inFileName = "";
        String outFileName = "";
        String alg = "shift";
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-mode" -> option = args[i + 1];
                case "-key" -> key = Integer.parseInt(args[i + 1]);
                case "-data" -> plainText = args[i + 1];
                case "-in" -> inFileName = args[i + 1];
                case "-out" -> outFileName = args[i + 1];
                case "-alg" -> alg = args[i + 1];
            }
        }

        if (!inFileName.equals("")) {
            try {
                plainText = Files.readString(Paths.get(inFileName));
            } catch (IOException e) {
                System.out.println("Error");
            }
        }

        Template choices = Factory.newInstance(alg, plainText, key, option);
        String output = choices.method();

        if (!outFileName.equals("")) {
            File file = new File(outFileName);
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(output);
            } catch (IOException e) {
                System.out.println("Error");
            }
        } else {
            System.out.println(output);
        }
    }
}
