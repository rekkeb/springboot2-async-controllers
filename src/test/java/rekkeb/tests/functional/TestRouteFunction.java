package rekkeb.tests.functional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import rekkeb.controller.HelloController;
import rekkeb.functional.Router;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestRouteFunction {

    @Autowired
    private WebTestClient webClient;


    @Test
    public void testRoute() {
        webClient.get()
            .uri("/route")
            .accept(MediaType.APPLICATION_JSON_UTF8)
            .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
                .expectBody()
                    .jsonPath("$.name").isEqualTo("route");
    }
}
