package com.resultcopy;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

/** @author AC089545 */
/** Displays the patient details, child details, categories and result related to patient. */
@Getter
@Setter
public class PatientResultResponse {
  private PatientResponse patient = new PatientResponse();
  private List<ChildResponse> child = new ArrayList<>();
  private List<CategoryResponse> category = new ArrayList<>();
  private DateTime resultCopiedDateTime;
}
