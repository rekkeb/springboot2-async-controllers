package rekkeb.functional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
public class Router {

    @Bean
    public RouterFunction<ServerResponse> routingFunction() {
        return route(path("/route"),
                     req -> ok()
                         .contentType(MediaType.APPLICATION_JSON_UTF8)
                         .body(BodyInserters.fromObject("{\"name\" : \"route\"}"))
        );
    }

}
