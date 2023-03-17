import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;


public class Encryption {
    public static void main(String[] args) throws  Exception {
        Signature sign=Signature.getInstance("SHA256withRSA");
        KeyPairGenerator keyPair=KeyPairGenerator.getInstance("RSA");
        keyPair.initialize(2048);
        KeyPair pair=keyPair.generateKeyPair();
        Cipher cipher=Cipher.getInstance("RSA/ECB/PKCS1Padding");

        cipher.init(Cipher.ENCRYPT_MODE,pair.getPublic());
       // Scanner scanner =new Scanner(System.in);
       // System.out.println("Enter a string to be c");
        byte[] arr="MIN TUMHIN MAAR DONGQA".getBytes();

       cipher.update(arr);
       byte[] reverse=cipher.doFinal();
         cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());
         byte[] wapis=cipher.doFinal(reverse);

        System.out.println(new String(reverse,"UTF8"));
        System.out.println("\n\t\tDecryption");
        System.out.println(new String(wapis));
    }
}
