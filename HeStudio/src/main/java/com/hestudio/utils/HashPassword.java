package com.hestudio.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HashPassword {

	public static String hashPassword(final String password) {
		try {
			final MessageDigest md = MessageDigest.getInstance("SHA-256");
			return convertByteArrayToHexString(md.digest(password
					.getBytes("UTF-8")));
		} catch (final NoSuchAlgorithmException e) {
			log.error("Error while hashing password", e);
		} catch (final UnsupportedEncodingException e) {
			log.error("Error while hashing password", e);
		}
		return "";
	}

	private static String convertByteArrayToHexString(final byte[] arrayBytes) {
		final StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < arrayBytes.length; i++) {
			stringBuffer.append(Integer.toString(
					(arrayBytes[i] & 0xff) + 0x100, 16).substring(1));
		}
		return stringBuffer.toString();
	}

}
