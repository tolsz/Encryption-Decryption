package encryptdecrypt;

class Ascii extends Template {
    public Ascii(String text, int key, String mode) {
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
            char asciiToChar = (char) (a + key);
            output.append(asciiToChar);
        }
        return output.toString();
    }

    private String decryption() {
        StringBuilder output = new StringBuilder();
        for (char a : text.toCharArray()) {
            char asciiToChar = (char) (a - key);
            output.append(asciiToChar);
        }
        return output.toString();
    }
}
