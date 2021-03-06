public class Cipher {

    public Cipher(){}

    String encrypt(int offset, String message){

        StringBuilder encryptedMessage = new StringBuilder();
        StringBuilder str = new StringBuilder(message);
        String alfabet=new String("AaĄąBbCcĆćDdEeFfGgHhIiJjKkLlŁłMmNnOoPpRrSsTtUuVvWwYyXxZzŹźŻż");
        for (int i=0;i<str.length();i++){
            char znak= str.charAt(i);

            int idx = alfabet.indexOf(String.valueOf(znak));

            idx=(idx+(offset+alfabet.length())*2)%alfabet.length();

            znak=alfabet.charAt(idx);

            encryptedMessage.append(znak);

        }
        return encryptedMessage.toString();
    }

    String decrypt(int offset, String message) {
        int decryptedOffset = offset *(-1);
        return encrypt(decryptedOffset,message);
    }
}
