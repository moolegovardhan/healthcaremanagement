package com.cgs.pro94tek.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cgs.pro94tek.healthcare.controller.InventorySetup;
import com.cgs.pro94tek.healthcare.exeception.PMSException;

public class CommonUtils {
	
	private static final Logger logger = LoggerFactory.getLogger(InventorySetup.class);
	
	private static final String algorithm = "SHA-256";
	private static final String IV = "CGSHEALTHSYSTEM1";
	private static final String encryptionKey = "PAVANPROTEKHEALT";
	
	public InventoryRequestResponse  createResponseData(String comments,String responseMessage,String status,String recordCount,Object data){
	
		InventoryRequestResponse response = new InventoryRequestResponse();
		
		response.setComments(comments);
		response.setData(data);
		response.setRecordCount(recordCount);
		response.setResponseMessage(responseMessage);
		response.setStatus(status);
		
		return response;
	}
	
	public static byte[] tokenGenerator(String date,String username,String profession,String officeid) throws Exception{
		String message= date+username+profession+officeid;
		System.out.println(date);
		 message = date+"PROTEK";
		byte[] cipher = encrypt(message, encryptionKey);
	   return cipher;
	}
	
	public String decryptToken(byte[] token) throws Exception{
		
		String decrypted = decrypt(token, encryptionKey);
		
		return decrypted;
	}
	
	public static byte[] encrypt(String plainText, String encryptionKey) throws Exception {
	    Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
	    SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
	    cipher.init(Cipher.ENCRYPT_MODE, key,new IvParameterSpec(IV.getBytes("UTF-8")));
	    return cipher.doFinal(plainText.getBytes("UTF-8"));
	  }

	  public static String decrypt(byte[] cipherText, String encryptionKey) throws Exception{
	    Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
	    SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
	    cipher.init(Cipher.DECRYPT_MODE, key,new IvParameterSpec(IV.getBytes("UTF-8")));
	    return new String(cipher.doFinal(cipherText),"UTF-8");
	  }
	  
	  
/*
  public static void main(String[] args) throws Exception {
		
		User user = new User();
		UserModal userModal = new UserModal();
		CommonUtils dds = new CommonUtils();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String finalDate = dateFormat.format(new Date());
		System.out.println(finalDate);
		System.out.println(dds.fetchUserPassword("callcenter","hanuman"));

	}
  */
	  
  public static String fetchUserPassword(String username,String password) throws PMSException{
	  
	  try {

			URL url = new URL("http://cgshealthcare.com/HealthCareSystem/validateUserIdandPassword/"+username+"/"+password);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;String outgoing = null;
			//System.out.println("Helooooooooooooo");
			while ((output = br.readLine()) != null) {
				logger.debug("CommonUtils : Password from Rest Call : "+output);
				outgoing = output;
				//System.out.println(output);
			}

			conn.disconnect();
			return outgoing;
		  } catch (MalformedURLException e) {

			e.printStackTrace();
			throw new PMSException(10, e.getMessage());

		  } catch (IOException e) {

			e.printStackTrace();
			throw new PMSException(10, e.getMessage());

		  }
	  
	  
  }


}
