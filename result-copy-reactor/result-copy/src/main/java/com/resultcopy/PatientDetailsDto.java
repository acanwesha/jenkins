package com.resultcopy;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/** @author AC089545 */
/** Demographic Information */
@Setter
@Getter
public class PatientDetailsDto {
  private Integer id;
  private String firstName;
  private String lastName;
  private String mrn;
  private String fin;
  private Date resultCopiedDateTime;
}
