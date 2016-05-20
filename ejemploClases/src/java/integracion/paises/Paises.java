/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion.paises;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;
import net.webservicex.Airport;
import net.webservicex.AirportSoap;


/**
 *
 * @author GSamaja
 */
@WebService(serviceName = "Paises")
public class Paises {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "obtenerData")
    public String[] obtenerCiudades(@WebParam(name = "name") String pais) {
        String[] arreglo = new String[2];
        GlobalWeather gw = new GlobalWeather();
        GlobalWeatherSoap gwSoap = gw.getGlobalWeatherSoap();
        String cities = gwSoap.getCitiesByCountry(pais);
        arreglo[0] = cities;
        Airport ap = new Airport();
        AirportSoap apSoap = ap.getAirportSoap();
        String aeropuertos = apSoap.getAirportInformationByCountry(pais);
        arreglo[1] = aeropuertos;
        return arreglo;
    }
}
