/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.CreateRoleReq;
import org.openapitools.model.EditRoleReq;
import org.openapitools.model.KeyValueDto;
import org.openapitools.model.ResultListRole;
import org.openapitools.model.Role;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-21T15:04:16.680Z[Etc/UTC]")

@Validated
@Api(value = "role", description = "the role API")
public interface RoleApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "rolesCreate", notes = "", tags={ "core", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content") })
    @RequestMapping(value = "/role/",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> rolesCreate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreateRoleReq createRoleReq) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "rolesFindOne", notes = "", response = Role.class, tags={ "core", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Role.class) })
    @RequestMapping(value = "/role/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Role> rolesFindOne(@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"role\" : \"role\",  \"permissions\" : [ \"permissions\", \"permissions\" ],  \"name\" : \"name\",  \"description\" : \"description\",  \"id\" : \"id\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "rolesQuery", notes = "", response = ResultListRole.class, tags={ "core", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ResultListRole.class) })
    @RequestMapping(value = "/role/query",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ResultListRole> rolesQuery(@ApiParam(value = "") @Valid @RequestParam(value = "keyword", required = false) String keyword,@ApiParam(value = "", defaultValue = "1.0d") @Valid @RequestParam(value = "page", required = false, defaultValue="1.0d") Double page,@ApiParam(value = "", defaultValue = "10.0d") @Valid @RequestParam(value = "size", required = false, defaultValue="10.0d") Double size,@ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"query\" : {    \"size\" : 6.02745618307040320615897144307382404804229736328125,    \"page\" : 1.46581298050294517310021547018550336360931396484375  },  \"count\" : 0.80082819046101150206595775671303272247314453125,  \"list\" : [ {    \"role\" : \"role\",    \"permissions\" : [ \"permissions\", \"permissions\" ],    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\"  }, {    \"role\" : \"role\",    \"permissions\" : [ \"permissions\", \"permissions\" ],    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\"  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "rolesSearch", notes = "", response = KeyValueDto.class, responseContainer = "List", tags={ "core", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = KeyValueDto.class, responseContainer = "List") })
    @RequestMapping(value = "/role/search",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<KeyValueDto>> rolesSearch(@ApiParam(value = "") @Valid @RequestParam(value = "keyword", required = false) String keyword,@ApiParam(value = "") @Valid @RequestParam(value = "value", required = false) String value) {
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


    @ApiOperation(value = "", nickname = "rolesUpdate", notes = "", response = Role.class, tags={ "core", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Role.class) })
    @RequestMapping(value = "/role/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Role> rolesUpdate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody EditRoleReq editRoleReq) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"role\" : \"role\",  \"permissions\" : [ \"permissions\", \"permissions\" ],  \"name\" : \"name\",  \"description\" : \"description\",  \"id\" : \"id\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
