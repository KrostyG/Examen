package com.example.practicaSpring1111.Configuracion;

import com.example.practicaSpring1111.Controller.nonexistentClientException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class ExceptionClienteHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler({nonexistentClientException.class})
    protected ResponseEntity<Object> handleNotFound2(
            Exception ex, WebRequest request){
        return handleExceptionInternal(ex,"No se encuentra el cliente",
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}
