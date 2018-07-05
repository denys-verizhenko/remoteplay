package rp.controllers;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import rp.RemotePlay;
import rp.models.User;
import rp.services.api.UserService;

import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RemotePlay.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @LocalServerPort
    private int port;
    @MockBean
    UserService userService;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    @Test
    public void testGetUsers() throws JSONException {
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        List<User> users = Collections.singletonList(new User("1", "Denys", "Verizhenko", "123", "11111111"));
        Mockito.when(userService.getUsers()).thenReturn(users);

        ResponseEntity<String> response = restTemplate.exchange(createURLWithPort("/users"),
                HttpMethod.GET, entity, String.class);

        String expected = "[{\"id\":\"1\",\"firstName\":\"Denys\",\"lastName\":\"Verizhenko\",\"phone\":\"11111111\"}]";

        JSONAssert.assertEquals(expected, response.getBody(),false);
    }

    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }

}
