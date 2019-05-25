package com.compname.mb.adapter;

import java.io.File;

import com.compname.mb.adapter.model.MBAdapterResponse;

public abstract class AbstractStorageAdapter implements MBAdapter {

	@Override
	public MBAdapterResponse send() {
		return null;
	}

	
	
	public abstract MBAdapterResponse getObject(String bucketName, String canonicalFilepath);
	
	public abstract MBAdapterResponse putObject(String bucketName, String path, File file);
	
}
