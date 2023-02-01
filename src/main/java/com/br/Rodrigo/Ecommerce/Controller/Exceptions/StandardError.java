package com.br.Rodrigo.Ecommerce.Controller.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StandardError implements Serializable {
    private Integer timeStamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

}