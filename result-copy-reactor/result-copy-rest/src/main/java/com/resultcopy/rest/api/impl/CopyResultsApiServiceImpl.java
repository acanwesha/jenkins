package com.resultcopy.rest.api.impl;

import com.resultcopy.rest.api.ApiResponseMessage;
import com.resultcopy.rest.api.CopyResultsApiService;
import com.resultcopy.rest.api.NotFoundException;
import com.resultcopy.rest.model.BabyResult;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
    date = "2021-06-10T12:22:56.778Z[GMT]")
public class CopyResultsApiServiceImpl extends CopyResultsApiService {
  @Override
  public Response copyResultsPost(BabyResult body, SecurityContext securityContext)
      throws NotFoundException {
    // do some magic!
    return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
