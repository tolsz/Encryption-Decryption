package encryptdecrypt;

class Caesar extends Template {
    public Caesar(String text, int key, String mode) {
        super(text, key, mode);
    }
    @Override
    String method() {
        if (mode.equals("dec")) {
            return decryption();
        } else {
            return encryption();
        }
    }

    private String encryption() {
        StringBuilder output = new StringBuilder();
        for (char a : text.toCharArray()) {
            char asciiToChar = a;
            if (Character.isUpperCase(a)) {
                int ascii = (a - 65 + key) % 26;
                asciiToChar = (char) (65 + ascii);
            } else if (Character.isLowerCase(a)) {
                int ascii = (a - 97 + key) % 26;
                asciiToChar = (char) (97 + ascii);
            }
            output.append(asciiToChar);
        }
        return output.toString();
    }

    private String decryption() {
        StringBuilder output = new StringBuilder();
        for (char a : text.toCharArray()) {
            char asciiToChar = a;
            if (Character.isUpperCase(a)) {
                int ascii = (a - 65 - key) % 26;
                if (ascii < 0) ascii = 26 + ascii;
                asciiToChar = (char) (65 + ascii);
            } else if (Character.isLowerCase(a)) {
                int ascii = (a - 97 - key) % 26;
                if (ascii < 0) ascii = 26 + ascii;
                asciiToChar = (char) (97 + ascii);
            }
            output.append(asciiToChar);
        }
        return output.toString();
    }
}
