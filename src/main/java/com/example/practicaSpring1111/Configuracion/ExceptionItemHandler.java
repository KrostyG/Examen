package com.example.practicaSpring1111.Configuracion;


import com.example.practicaSpring1111.Controller.ItemExistentException;
import com.example.practicaSpring1111.Controller.nonexistentItemException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionItemHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler({nonexistentItemException.class})
    protected ResponseEntity<Object> handleNotFound(
            Exception ex, WebRequest request){
        return handleExceptionInternal(ex,"Este item No existe",
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
    @ExceptionHandler({ ItemExistentException.class })
    protected ResponseEntity<Object> itemExistente(
            Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, "Este Item ya existe",
                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
}
