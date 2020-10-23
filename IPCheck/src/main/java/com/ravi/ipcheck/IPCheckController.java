package com.ravi.ipcheck;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IPCheckController {
	
	private ServiceChecker checker;

	public IPCheckController(ServiceChecker checker) {
		this.checker = checker;
	}
	
	 @RequestMapping(method = RequestMethod.POST,value = "/ipCheck")
	  public SubscriberData roamingValidator(@RequestBody SubscriberData sd)
	  {
		  return checker.ipCheck(sd);
	  } 
}
