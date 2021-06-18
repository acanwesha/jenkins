package com.resultcopy;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/** @author AC089545 */
/** Baby result information that is to be copied and be linked to the baby. */
@Getter
@Setter
public class BabyResultResponse {
  private Integer childId;
  private String value;
  private String categoryName;
  private String resultName;
  private Date dateTime;
}
