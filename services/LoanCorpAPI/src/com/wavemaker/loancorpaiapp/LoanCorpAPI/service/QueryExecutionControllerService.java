package com.wavemaker.loancorpaiapp.LoanCorpAPI.service;


import com.wavemaker.loancorpaiapp.LoanCorpAPI.model.*;
import com.wavemaker.loancorpaiapp.LoanCorpAPI.model.IntegerWrapper;
import com.wavemaker.loancorpaiapp.LoanCorpAPI.model.MarkOverdueEmisRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface QueryExecutionControllerService {

  /**
   * 
   * markOverdueEmis
    * @param body  (required)
   * @return IntegerWrapper
   */
  @RequestLine("PUT /loancorp/queryExecutor/queries/markOverdueEmis")
  @Headers({
    "Content-Type: */*",
    "Accept: */*",  })
  IntegerWrapper queryExecutionControllerExecuteMarkOverdueEmis(MarkOverdueEmisRequest body);

}
