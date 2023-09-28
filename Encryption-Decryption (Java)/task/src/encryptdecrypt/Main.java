package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        Cipher cipher = new Cipher(args);
        cipher.code();
    }
}