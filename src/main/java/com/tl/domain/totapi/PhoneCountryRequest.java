package com.tl.domain.totapi;

import com.tl.base.RequestHead;
import lombok.Data;

@Data
public class PhoneCountryRequest extends RequestHead  {

    private String id;
    private String countryName;
    private String countryCode;
}
