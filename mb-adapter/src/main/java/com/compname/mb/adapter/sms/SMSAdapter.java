package com.compname.mb.adapter.sms;

import com.compname.mb.adapter.MBAdapter;
import com.compname.mb.adapter.config.Config;
import com.compname.mb.adapter.config.SMSConfig;
import com.compname.mb.adapter.exception.MBAdapterException;
import com.compname.mb.adapter.model.MBAdapterResponse;

public class SMSAdapter implements MBAdapter {

	private Config config;
	private String to;
	private String message;

	public SMSAdapter(Config config) throws MBAdapterException {
		if (!(config instanceof SMSConfig))
			throw new MBAdapterException("SMSConfig Not Found");
	}

	@Override
	public MBAdapterResponse send() {
		// TODO Auto-generated method stub
		return null;
	}

}
