package com.springopenapiexample;

import com.springopenapiexample.model.Blog;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link BlogApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-21T17:24:45.552438+05:30[Asia/Kolkata]")
public interface BlogApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /blog : Add a new blog
     *
     * @param blog Optional description in *Markdown* (required)
     * @return Created (status code 201)
     *         or Blog not found (status code 404)
     * @see BlogApi#blogPost
     */
    default ResponseEntity<Blog> blogPost(Blog blog) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdate\" : \"0027-12-12T00:00:00.000+0000\", \"blogtitle\" : \"blogtitle\", \"id\" : 0, \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /blog/{blogid} : Get the blog by title
     *
     * @param blogid  (required)
     * @return Blog not found (status code 404)
     * @see BlogApi#deleteBlog
     */
    default ResponseEntity<Void> deleteBlog(Long blogid) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /blog/{blogtitle} : Get the blog by title
     *
     * @param blogtitle  (required)
     * @return successful operation (status code 200)
     *         or Blog not found (status code 404)
     * @see BlogApi#getBlogByTitle
     */
    default ResponseEntity<List<Blog>> getBlogByTitle(String blogtitle) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdate\" : \"0027-12-12T00:00:00.000+0000\", \"blogtitle\" : \"blogtitle\", \"id\" : 0, \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /blog : update an existing blog
     *
     * @param blog Optional description in *Markdown* (required)
     * @return Created (status code 201)
     *         or Blog not found (status code 404)
     * @see BlogApi#updateBlog
     */
    default ResponseEntity<Blog> updateBlog(Blog blog) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdate\" : \"0027-12-12T00:00:00.000+0000\", \"blogtitle\" : \"blogtitle\", \"id\" : 0, \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
