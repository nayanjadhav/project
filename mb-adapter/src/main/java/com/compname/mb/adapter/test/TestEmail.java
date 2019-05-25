package com.compname.mb.adapter.test;

import com.compname.mb.adapter.config.Config;
import com.compname.mb.adapter.config.EmailConfig;
import com.compname.mb.adapter.email.EmailAdapter;
import com.compname.mb.adapter.model.EmailAdapterResponse;

public class TestEmail {

	static String key = "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";
	
	
	public static void main(String[] args) {
		
			EmailConfig config = new EmailConfig();
			config.setApiKey(key);
		try {
			EmailAdapter adapter = new EmailAdapter(config);
			EmailAdapterResponse res = adapter.setBody("Hello").setFrom("nayan.cryptos@gmail.com")
			.setSubject("sendGridTes").setTo("nayan.trimax@gmail.com")
			.send();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	
	
	
}
