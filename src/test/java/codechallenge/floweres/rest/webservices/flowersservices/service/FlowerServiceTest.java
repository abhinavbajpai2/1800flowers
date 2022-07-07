package codechallenge.floweres.rest.webservices.flowersservices.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import codechallenge.floweres.rest.webservices.flowersservices.bean.UniqueUserCount;
import codechallenge.floweres.rest.webservices.flowersservices.bean.UserInfo;
@SpringBootTest
public class FlowerServiceTest {

	@Mock
	FlowerService flowerService;
	@Autowired
	FlowerService flowerServiceObj;

	@MockBean
	UserInfo userInfo;
	
	
	
	@Test
	public void getUniqueUsersCountTest() {
		UniqueUserCount uniqueUserCount = new UniqueUserCount(10);
		
		when(flowerService.retrieveJsonAsList()).thenReturn(getJsonObjects());
		assertEquals(10, flowerServiceObj.getUniqueCountService().getUniqueUserCount());
		
	}
	
	@Test
	public void retrieveUpdatedUserTest() {
		String param = "1800Flowers";
		when(flowerService.retrieveJsonAsList()).thenReturn(getJsonObjects());
		assertEquals(param, flowerServiceObj.retrieveUpdatedUser(param).getTitle());
		assertEquals(param, flowerServiceObj.retrieveUpdatedUser(param).getBody());
	}
	
	public ArrayList getJsonObjects() {
		ArrayList<UserInfo>  userInfoList = new ArrayList<>();
		
		UserInfo userInfo1 = new UserInfo();
		userInfo1.setId(1);
		userInfo1.setUserId(1);
		userInfo1.setTitle("sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
		userInfo1.setBody("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
		
		UserInfo userInfo2 = new UserInfo();
		userInfo1.setId(2);
		userInfo1.setUserId(2);
		userInfo1.setTitle("qui est esse");
		userInfo1.setBody("est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla");
		
		UserInfo userInfo3 = new UserInfo();
		userInfo1.setId(3);
		userInfo1.setUserId(3);
		userInfo1.setTitle("sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
		userInfo1.setBody("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
		
		UserInfo userInfo4 = new UserInfo();
		userInfo1.setId(4);
		userInfo1.setUserId(4);
		userInfo1.setTitle("eum et est occaecati");
		userInfo1.setBody("ullam et saepe reiciendis voluptatem adipisci\nsit amet autem assumenda provident rerum culpa\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\nquis sunt voluptatem rerum illo velit");
		
		UserInfo userInfo5 = new UserInfo();
		userInfo1.setId(12);
		userInfo1.setUserId(5);
		userInfo1.setTitle("in quibusdam tempore odit est dolorem");
		userInfo1.setBody("itaque id aut magnam\npraesentium quia et ea odit et ea voluptas et\nsapiente quia nihil amet occaecati quia id voluptatem\nincidunt ea est distinctio odio");
		
		UserInfo userInfo6 = new UserInfo();
		userInfo1.setId(21);
		userInfo1.setUserId(9);
		userInfo1.setTitle("asperiores ea ipsam voluptatibus modi minima quia sint");
		userInfo1.setBody("repellat aliquid praesentium dolorem quo\nsed totam minus non itaque\nnihil labore molestiae sunt dolor eveniet hic recusandae veniam\ntempora et tenetur expedita sunt");
		
		UserInfo userInfo7 = new UserInfo();
		userInfo1.setId(31);
		userInfo1.setUserId(10);
		userInfo1.setTitle("ullam ut quidem id aut vel consequuntur");
		userInfo1.setBody("debitis eius sed quibusdam non quis consectetur vitae\nimpedit ut qui consequatur sed aut in\nquidem sit nostrum et maiores adipisci atque\nquaerat voluptatem adipisci repudiandae");
		
		UserInfo userInfo8 = new UserInfo();
		userInfo1.setId(41);
		userInfo1.setUserId(8);
		userInfo1.setTitle("non est facere");
		userInfo1.setBody("molestias id nostrum\\nexcepturi molestiae dolore omnis repellendus quaerat saepe\\nconsectetur iste quaerat tenetur asperiores accusamus ex ut\\nnam quidem est ducimus sunt debitis saepe");
		
		UserInfo userInfo9 = new UserInfo();
		userInfo1.setId(51);
		userInfo1.setUserId(6);
		userInfo1.setTitle("soluta aliquam aperiam consequatur illo quis voluptas");
		userInfo1.setBody("sunt dolores aut doloribus\\ndolore doloribus voluptates tempora et\\ndoloremque et quo\\ncum asperiores sit consectetur dolorem");
		
		UserInfo userInfo10 = new UserInfo();
		userInfo1.setId(61);
		userInfo1.setUserId(7);
		userInfo1.setTitle("voluptatem doloribus consectetur est ut ducimus");
		userInfo1.setBody("ab nemo optio odio\\ndelectus tenetur corporis similique nobis repellendus rerum omnis facilis\\nvero blanditiis debitis in nesciunt doloribus dicta dolores\\nmagnam minus velit");
		
		UserInfo userInfo11 = new UserInfo();
		userInfo1.setId(71);
		userInfo1.setUserId(8);
		userInfo1.setTitle("sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
		userInfo1.setBody("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
		
		
		userInfoList.add(userInfo1);
		userInfoList.add(userInfo2);
		userInfoList.add(userInfo3);
		userInfoList.add(userInfo4);
		userInfoList.add(userInfo5);
		userInfoList.add(userInfo6);
		userInfoList.add(userInfo7);
		userInfoList.add(userInfo8);
		userInfoList.add(userInfo9);
		userInfoList.add(userInfo10);
		userInfoList.add(userInfo11);
		
		return userInfoList;
	}
	
	
}
