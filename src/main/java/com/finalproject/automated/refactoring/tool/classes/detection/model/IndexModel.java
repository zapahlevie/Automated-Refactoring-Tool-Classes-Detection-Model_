package com.finalproject.automated.refactoring.tool.classes.detection.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IndexModel {

    private Integer start;

    private Integer end;
}
