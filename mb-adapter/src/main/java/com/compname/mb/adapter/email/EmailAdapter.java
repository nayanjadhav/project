package com.compname.mb.adapter.email;

import com.compname.mb.adapter.MBAdapter;
import com.compname.mb.adapter.config.Config;
import com.compname.mb.adapter.config.EmailConfig;
import com.compname.mb.adapter.exception.MBAdapterException;
import com.compname.mb.adapter.model.MBAdapterResponse;

public class EmailAdapter implements MBAdapter {


	public EmailAdapter(Config config) throws Exception{
		if(!(config instanceof EmailConfig))
			throw new MBAdapterException("EmailConfig Not Found");
	}
	
	private EmailConfig config;
	private String from;
	private String to;
	private String subject;
	private String body;

	public String getFrom() {
		return from;
	}

	public EmailAdapter setFrom(String from) {
		this.from = from;
		return this;
	}

	public String getTo() {
		return to;
	}

	public EmailAdapter setTo(String to) {
		this.to = to;
		return this;
	}

	public String getSubject() {
		return subject;
	}

	public EmailAdapter setSubject(String subject) {
		this.subject = subject;
		return this;
	}

	public String getBody() {
		return body;
	}

	public EmailAdapter setBody(String body) {
		this.body = body;
		return this;
	}

	@Override
	public MBAdapterResponse send() {
		// TODO Auto-generated method stub
		return null;
	}

}
