/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ArticleRes;
import org.openapitools.model.CreateArticleDto;
import org.openapitools.model.EditArticleDto;
import org.openapitools.model.KeyValue;
import org.openapitools.model.ResultListArticleRes;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-14T14:09:29.012Z[Etc/UTC]")

@Validated
@Api(value = "article", description = "the article API")
public interface ArticleApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "articleCreate", notes = "", response = ArticleRes.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ArticleRes.class) })
    @RequestMapping(value = "/article/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<ArticleRes> articleCreate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreateArticleDto entry) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"template\" : \"template\",  \"author\" : \"author\",  \"disable\" : true,  \"meta\" : \"meta\",  \"name\" : \"name\",  \"description\" : \"description\",  \"id\" : \"id\",  \"sort\" : 0.8008281904610115,  \"title\" : \"title\",  \"category\" : \"category\",  \"picture\" : \"picture\",  \"content\" : \"content\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "articleFindOne", notes = "", response = ArticleRes.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ArticleRes.class) })
    @RequestMapping(value = "/article/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ArticleRes> articleFindOne(@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"template\" : \"template\",  \"author\" : \"author\",  \"disable\" : true,  \"meta\" : \"meta\",  \"name\" : \"name\",  \"description\" : \"description\",  \"id\" : \"id\",  \"sort\" : 0.8008281904610115,  \"title\" : \"title\",  \"category\" : \"category\",  \"picture\" : \"picture\",  \"content\" : \"content\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "articleQuery", notes = "", response = ResultListArticleRes.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ResultListArticleRes.class) })
    @RequestMapping(value = "/article/query",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ResultListArticleRes> articleQuery(@ApiParam(value = "") @Valid @RequestParam(value = "keyword", required = false) String keyword,@ApiParam(value = "", defaultValue = "1.0d") @Valid @RequestParam(value = "page", required = false, defaultValue="1.0d") Double page,@ApiParam(value = "", defaultValue = "10.0d") @Valid @RequestParam(value = "size", required = false, defaultValue="10.0d") Double size,@ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"query\" : {    \"size\" : 6.027456183070403,    \"page\" : 1.4658129805029452  },  \"count\" : 0.8008281904610115,  \"list\" : [ {    \"template\" : \"template\",    \"author\" : \"author\",    \"disable\" : true,    \"meta\" : \"meta\",    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"sort\" : 0.8008281904610115,    \"title\" : \"title\",    \"category\" : \"category\",    \"picture\" : \"picture\",    \"content\" : \"content\"  }, {    \"template\" : \"template\",    \"author\" : \"author\",    \"disable\" : true,    \"meta\" : \"meta\",    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"sort\" : 0.8008281904610115,    \"title\" : \"title\",    \"category\" : \"category\",    \"picture\" : \"picture\",    \"content\" : \"content\"  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "articleRemove", notes = "", response = Boolean.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Boolean.class) })
    @RequestMapping(value = "/article/{id}",
        produces = { "text/html" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<Boolean> articleRemove(@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "articleSearch", notes = "", response = KeyValue.class, responseContainer = "List", tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = KeyValue.class, responseContainer = "List") })
    @RequestMapping(value = "/article/search",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<KeyValue>> articleSearch(@ApiParam(value = "") @Valid @RequestParam(value = "keyword", required = false) String keyword,@ApiParam(value = "") @Valid @RequestParam(value = "value", required = false) String value) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"label\" : \"label\",  \"value\" : \"value\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "articleUpdate", notes = "", response = ArticleRes.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ArticleRes.class) })
    @RequestMapping(value = "/article/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<ArticleRes> articleUpdate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody EditArticleDto entry) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"template\" : \"template\",  \"author\" : \"author\",  \"disable\" : true,  \"meta\" : \"meta\",  \"name\" : \"name\",  \"description\" : \"description\",  \"id\" : \"id\",  \"sort\" : 0.8008281904610115,  \"title\" : \"title\",  \"category\" : \"category\",  \"picture\" : \"picture\",  \"content\" : \"content\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
