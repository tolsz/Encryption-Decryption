package encryptdecrypt;

abstract class Template {
    String text;
    int key;
    String mode;

    public Template(String text, int key, String mode) {
        this.text = text;
        this.key = key;
        this.mode = mode;
    }

    abstract String method();
}
