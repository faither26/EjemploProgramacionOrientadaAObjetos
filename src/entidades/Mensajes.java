package entidades;

public enum Mensajes 
{
    MENSAJE_PETICION_HORAS("INGRESA LAS HORAS TRABAJADAS"), MENSAJE_PETICION_VALOR_HORA("INGRESA EL VALOR DE LA HORA TRABAJADA"),
    MENSAJE_SALARIO_PAGAR("El salario a pagar es: $");

    private String mensaje;
    Mensajes(String s)
    {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
