package com.example.parkinglot.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.expression.spel.ast.Operator;

@Getter
@Setter
public class Gate {
    private int id;
    private int number;
   // private GateType gateStatus;
    private Operator operator;
  //  private GateType gateType;
}


