package batchFile;

import java.io.UnsupportedEncodingException;

public class EUCKRvsMS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		byte[] b1 = "a".getBytes("UTF-8");
		byte[] b2 = "a".getBytes("MS949");
		System.out.println(b1.length);
		System.out.println(b2.length);
		System.out.println(new String(b1, "EUC-KR"));
		System.out.println(new String(b2, "MS949"));
		System.out.println();
		byte[] b3 = "가".getBytes("UTF-8");
		byte[] b4 = "가".getBytes("MS949");
		System.out.println(b3.length);
		System.out.println(b4.length);
		System.out.println(new String(b3, "EUC-KR"));
		System.out.println(new String(b4, "MS949"));
		System.out.println();
		byte[] b5 = "뷁".getBytes("UTF-8");
		byte[] b6 = "뷁".getBytes("MS949");
		System.out.println(b5.length);
		System.out.println(b6.length);
		System.out.println(new String(b5, "UTF-8"));
		System.out.println(new String(b6, "MS949"));
		System.out.println();
		
		byte[] array1 = "안녕".getBytes();
        System.out.println(array1.length);
	}

}
