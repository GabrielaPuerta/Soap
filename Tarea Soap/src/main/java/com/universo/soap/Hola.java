package com.universo.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
// http://localhost:8080/WebserviceSoapApp/ws/hola
@WebService
@SOAPBinding(style = Style.RPC)
public class Hola {
 
    @WebMethod
    public String ciao (String nombre) {
        return String.format("Ciao %s", nombre);
    }
}

