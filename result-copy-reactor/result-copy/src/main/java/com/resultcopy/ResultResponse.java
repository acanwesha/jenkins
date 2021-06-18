package com.resultcopy;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/** @author AC089545 */
/** List of result details documented for the mother patient. */
@Getter
@Setter
public class ResultResponse implements Serializable {
  private Integer resultId;
  private String resultName;
  private String value;
}
