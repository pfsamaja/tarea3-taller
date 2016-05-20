/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.calculadora;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author GSamaja
 */
@WebService(serviceName = "Calculadora")
public class Calculadora {

    /**
     * This is a sample web service operation
     * @param op1
     * @param op2
     * @return 
     */
    @WebMethod(operationName = "sumar")
    public double sumar (@WebParam(name = "op1") double op1, @WebParam(name = "op2") double op2 ) {
        return op1 + op2;
    }
}
