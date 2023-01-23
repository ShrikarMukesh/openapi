package com.springopenapiexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-21T17:24:45.552438+05:30[Asia/Kolkata]")
@Controller
@RequestMapping("${openapi.springOpenApiExample.base-path:}")
public class BlogApiController implements BlogApi {

    private final BlogApiDelegate delegate;

    public BlogApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) BlogApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new BlogApiDelegate() {});
    }

    @Override
    public BlogApiDelegate getDelegate() {
        return delegate;
    }

}
