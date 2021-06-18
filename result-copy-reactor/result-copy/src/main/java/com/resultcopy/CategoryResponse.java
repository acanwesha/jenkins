package com.resultcopy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/** @author AC089545 */
/** List of categories available as a part of patient reports. */
@Getter
@Setter
public class CategoryResponse implements Serializable {
  private int id;
  private String displayName;
  private List<ResultResponse> result = new ArrayList<>();
}
