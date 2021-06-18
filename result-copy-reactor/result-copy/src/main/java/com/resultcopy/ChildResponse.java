package com.resultcopy;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/** @author AC089545 */
/** Information about the child. */
@Getter
@Setter
public class ChildResponse implements Serializable {
  private List<PatientDetailsDto> childDetails = new ArrayList<>();

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
  private Date resultCopiedDateTime;
}
