package Exercicios.ApplicationSeven.Exceptions;

import java.io.Serial;

public class DomainExceptionSeven extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DomainExceptionSeven(String message) {
        super(message);
    }
}
