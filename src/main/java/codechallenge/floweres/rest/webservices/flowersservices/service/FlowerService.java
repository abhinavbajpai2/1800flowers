package codechallenge.floweres.rest.webservices.flowersservices.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import codechallenge.floweres.rest.webservices.flowersservices.bean.UniqueUserCount;
import codechallenge.floweres.rest.webservices.flowersservices.bean.UserInfo;

@Component
public class FlowerService {

	@Autowired
	 RestTemplate restTemplate;
	 
	public UniqueUserCount getUniqueCountService() {
		List<UserInfo> userInfoList = null;
		UniqueUserCount uniqueUserCount = null;
	      userInfoList  =  retrieveJsonAsList();
	      uniqueUserCount = new UniqueUserCount(userInfoList.stream().map(UserInfo::getUserId).distinct().collect(Collectors.toList()).size());
			return  uniqueUserCount;
		}
	
	public UserInfo retrieveUpdatedUser(String param) {
		ArrayList<UserInfo> userInfoList = null;
	      userInfoList  =  retrieveJsonAsList();
	      UserInfo userInfo = userInfoList.get(3);
	      userInfo.setBody(param);
	      userInfo.setTitle(param);
			return  userInfo;
		}
	
	public  ArrayList<UserInfo> retrieveJsonAsList() {
		
		HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<String> entity = new HttpEntity<String>(headers);
	      
	      ResponseEntity<UserInfo[]> response = restTemplate.exchange("http://jsonplaceholder.typicode.com/posts", HttpMethod.GET, entity, UserInfo[].class);
	      return new ArrayList(Arrays.asList(response.getBody()));
	}
}