package com.ravi.ipcheck;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServiceChecker {

	static final List<String> IPLIST = Arrays.asList("200.142.3.123", "201.34.100.1", "202.142.4.15", "203.6.100.77");

	public SubscriberData ipCheck(SubscriberData sd) {
		String inpIP = sd.getIpAddress();
		if (IPLIST.contains(inpIP)) {
			sd.setIpAddress("HOME");
		} else {
			sd.setIpAddress("ROAMING");
		}
		return sd;
	}
}
