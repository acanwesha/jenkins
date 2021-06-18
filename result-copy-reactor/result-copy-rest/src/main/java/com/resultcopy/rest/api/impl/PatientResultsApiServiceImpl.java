package com.resultcopy.rest.api.impl;

import com.resultcopy.rest.api.ApiResponseMessage;
import com.resultcopy.rest.api.NotFoundException;
import com.resultcopy.rest.api.PatientResultsApiService;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
    date = "2021-06-10T12:22:56.778Z[GMT]")
public class PatientResultsApiServiceImpl extends PatientResultsApiService {
  @Override
  public Response patientResultsPatientIdGet(String patientId, SecurityContext securityContext)
      throws NotFoundException {
    // do some magic!
    return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
