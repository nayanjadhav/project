package com.compname.mb.adapter.model;

import java.io.InputStream;

public class StorageAdapterResponse extends MBAdapterResponse{
	
	private String versionId;
	private InputStream fileInputStream;
	
	public String getVersionId() {
		return versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public InputStream getFileInputStream() {
		return fileInputStream;
	}

	public void setFileInputStream(InputStream fileInputStream) {
		this.fileInputStream = fileInputStream;
	}
	
	

}
