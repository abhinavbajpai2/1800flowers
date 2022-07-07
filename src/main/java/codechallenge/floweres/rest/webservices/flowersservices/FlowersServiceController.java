package codechallenge.floweres.rest.webservices.flowersservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import codechallenge.floweres.rest.webservices.flowersservices.bean.UniqueUserCount;
import codechallenge.floweres.rest.webservices.flowersservices.bean.UserInfo;
import codechallenge.floweres.rest.webservices.flowersservices.service.FlowerService;

@RestController
public class FlowersServiceController {

	@Autowired
	private FlowerService service;
	
	@GetMapping(path = "/getUniqueUsersCount")
	public UniqueUserCount getUniqueUsersCount() {
		UniqueUserCount count = service.getUniqueCountService();
		
		return count;
}
	
	@GetMapping(path = "/retrieveUpdatedUser/{param}")
	public UserInfo updateUser(@PathVariable String param) {
		UserInfo userInfoRes = service.retrieveUpdatedUser(param);
		
		return userInfoRes;
}
}