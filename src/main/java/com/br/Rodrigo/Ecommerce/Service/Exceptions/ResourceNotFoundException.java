package com.br.Rodrigo.Ecommerce.Service.Exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Object id){
        super("Resource Not Found id:" + id);
    }
}