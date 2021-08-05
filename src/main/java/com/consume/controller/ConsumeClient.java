package com.consume.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name = "consumeWS")
@FeignClient(name="consume", url="http://styrk-vinneren.us-east-1.elasticbeanstalk.com:8093")
public interface ConsumeClient {

	//@GetMapping("http://styrk-vinneren.us-east-1.elasticbeanstalk.com:8093/styrk/api/status/info")
	@RequestMapping(method = RequestMethod.GET, value = "/styrk/api/status/info")
	public String consumneWS();
}
