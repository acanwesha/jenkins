package com.resultcopy;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/** @author AC089545 */
/** Information about the patient. */
@Getter
@Setter
public class PatientResponse implements Serializable {
  private int patientId;
  private String fin;
  private String firstName;
  private String lastName;
  private String mrn;
}
