package com.example.demo.services;

import com.example.demo.models.MyErrorMsg;
import com.example.demo.models.Until;

public interface UntilService {

  Until sum (Until until);
  Until factorial (Until until);

  MyErrorMsg getMyErrorMsg (String errorText);
}
