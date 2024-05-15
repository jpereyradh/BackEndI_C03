package model;

public class Medicamento {
    //atributos
    private Integer id;
    private Integer codigo;
    private String nombre;
    private String laboratorio;
    private Integer cantidad;
    private Double precio;

    public Medicamento(Integer id, Integer codigo, String nombre, String laboratorio, Integer cantidad, Double precio) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Double getPrecio() {
        return precio;
    }
}
