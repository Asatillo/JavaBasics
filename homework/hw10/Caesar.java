import java.util.Scanner;
 
public class Caesar{
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public int shift;

    public Caesar(int shift){
        if (shift >= 1 && shift <= 25){
            this.shift = shift;
        }else{
            throw new IllegalArgumentException();
        }
    }
    
    public String cipher(String plainText)
    {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
        {
            if(ALPHABET.contains(Character.toString(plainText.charAt(i)))){
                int charPosition = ALPHABET.indexOf(plainText.charAt(i));
                int keyVal = (shift + charPosition) % 26;
                char replaceVal = ALPHABET.charAt(keyVal);
                cipherText += replaceVal;
            }else{
                throw new IllegalArgumentException();
            }
        }
        return cipherText;
    }
 
    public String decipher(String cipherText)
    {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - shift) % 26;
            if (keyVal < 0)
            {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            plainText += replaceVal;
        }
        return plainText;
    }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Caesar caesar = new Caesar(5);
        System.out.println("Enter the String for Encryption: ");
        String message = new String();
        message = sc.next();
        System.out.println(caesar.cipher(message));
        System.out.println(caesar.decipher(caesar.cipher(message)));
        sc.close();
    }
}