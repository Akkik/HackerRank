package DataStructures;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class md5 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		MessageDigest md = MessageDigest.getInstance("SHA-256"); 
		byte[] digest = md.digest("test".getBytes());
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
	}

}
