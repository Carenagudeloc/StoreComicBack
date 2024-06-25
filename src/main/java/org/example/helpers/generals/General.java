package org.example.helpers.generals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class General {


    //funcion generica que revisa que una cadena coincida con un patron
    //o expresion regular
    public boolean validarRegex(String regex, String cadena){
        Pattern patron = Pattern.compile(regex);
        Matcher coincidencia = patron.matcher(cadena);

        if(!coincidencia.matches()){
            return false;
        }
        else {
            return true;
        }
    }
}
