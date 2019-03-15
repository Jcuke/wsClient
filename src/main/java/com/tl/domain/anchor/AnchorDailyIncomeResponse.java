package com.tl.domain.anchor;

import lombok.Data;

import java.io.Serializable;

@Data
public class AnchorDailyIncomeResponse implements Serializable{
    String date;
    Long income;
}
