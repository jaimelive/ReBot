package org.powertrip.rebot.common.utils;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

/**
 * Created by Jaime on 03/01/2016.
 * 05:44
 */
public class SerializationUtils {
	public static String ObjectToJson(Object obj) {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		try {
			return ow.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			return "{}";
		}
	}

	public static <T> T JsonToObject(String value, Class<T> tClass) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(value, tClass);
		} catch (IOException e) {
			return null;
		}
	}

	public static byte[] serialize(Object object) throws IOException {
		byte[] result;
		ByteOutputStream byteOutputStream = new ByteOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteOutputStream);
		objectOutputStream.writeObject(object);
		objectOutputStream.close();
		result = byteOutputStream.getBytes();
		byteOutputStream.close();
		return result;
	}

	public static <T> T deserialize(byte[] bytes, Class<T> tClass) throws ClassNotFoundException, IOException {
		Object object;
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
		ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
		byteArrayInputStream.close();
		object = objectInputStream.readObject();
		objectInputStream.close();
		return (T) object;
	}

	public static byte[] encodeForJSON(Object object) throws IOException {
		return Base64.getEncoder().encode(serialize(object));
	}

	public static <T> T decodeForJSON(byte[] bytes, Class<T> tClass) throws IOException, ClassNotFoundException {
		return SerializationUtils.deserialize(
				Base64.getDecoder().decode(bytes),
				tClass
		);
	}
}
