package com.compname.mb.adapter.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;

import com.compname.mb.adapter.config.StorageConfig;
import com.compname.mb.adapter.exception.MBAdapterException;
import com.compname.mb.adapter.model.StorageAdapterResponse;
import com.compname.mb.adapter.storage.StorageAdapter;

public class TestStorage {

	static String acck = "AKIA4TQNY7QRROXKQ4XF";
	static String seck = "xCnJSy9av8OIEZaEMZLhOKDnawim3L5Q/IRgWWNK";
	
	public static void main(String[] args) {
		
		StorageConfig config = new StorageConfig();
		config.setAccessKey(acck);
		config.setSecretKey(seck);
		
		try {
			StorageAdapter adapter = new StorageAdapter(config);
			StorageAdapterResponse ge = adapter.getObject("test-st-ad", "IP Hacker Wallpapers.jpg");
			InputStream in = ge.getFileInputStream();
			FileUtils.copyInputStreamToFile(in, new File("E:\\Desktop\\MyApplication5\\ip.jpg"));
		} catch (MBAdapterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
