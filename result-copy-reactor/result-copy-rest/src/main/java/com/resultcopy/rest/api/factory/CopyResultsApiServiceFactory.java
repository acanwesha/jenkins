package com.resultcopy.rest.api.factory;

import com.resultcopy.rest.api.CopyResultsApiService;
import com.resultcopy.rest.api.impl.CopyResultsApiServiceImpl;

@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
    date = "2021-06-10T12:22:56.778Z[GMT]")
public class CopyResultsApiServiceFactory {
  private static final CopyResultsApiService service = new CopyResultsApiServiceImpl();

  public static CopyResultsApiService getCopyResultsApi() {
    return service;
  }
}
