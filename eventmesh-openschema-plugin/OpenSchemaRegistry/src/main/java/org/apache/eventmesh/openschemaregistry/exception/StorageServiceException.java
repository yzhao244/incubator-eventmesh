package org.apache.eventmesh.openschemaregistry.exception;

import org.springframework.http.HttpStatus;

public class StorageServiceException extends OpenSchemaException{
    public StorageServiceException(HttpStatus err_status, String err_code, String err_message) {
        super(err_status, err_code, err_message);
    }
}
