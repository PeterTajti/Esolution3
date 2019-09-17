package com.example.demo.services;

import com.example.demo.models.MyErrorMsg;
import com.example.demo.models.Until;
import org.springframework.stereotype.Service;

@Service
public class UntilServiceImpl implements UntilService {

// private MyErrorMsg myErrorMsg;
//
//  @Autowired
//  public UntilServiceImpl(MyErrorMsg myErrorMsg) {
//    this.myErrorMsg = myErrorMsg;
//  }

  @Override
  public Until sum(Until until) {
    int tempNumber = 0;
    for (int i = 0; i <= until.getUntil(); i++) {
      tempNumber = tempNumber + i;
      until.setResult(tempNumber);
    }
    return until;
  }

  @Override
  public Until factorial(Until until) {
    int tempNumber = 1;
    for (int i = 1; i <= until.getUntil(); i++) {
      tempNumber = tempNumber * i;
      until.setResult(tempNumber);
    }
    return until;
  }

  @Override
  public MyErrorMsg getMyErrorMsg(String errorText) {

    return null;
  }
}
