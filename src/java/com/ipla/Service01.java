/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipla;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author a05816a
 */
@WebService(serviceName = "Service01")
public class Service01 {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Division")
    public Integer Division(@WebParam(name = "value1") int value1, @WebParam(name = "value2") int value2) {
        //TODO write your implementation code here:
        return value1 / value2;
    }
}
