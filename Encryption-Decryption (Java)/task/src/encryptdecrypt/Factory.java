package encryptdecrypt;

class Factory {

    public static Template newInstance(String alg, String text, int key, String option) {
        if (alg.equals("unicode")) {
            return new Ascii(text, key, option);
        } else {
            return new Caesar(text, key, option);
        }
    }
}
