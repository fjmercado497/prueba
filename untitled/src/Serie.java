import java.net.ServerSocket;

public class Serie {
    private  int codigo ;
    private String descripcion;
public Serie (int codi,String desc){
    codigo=codi;
    descripcion=desc;
}
    public int getCodigo_() {
        return codigo;
    }

    public void setCodigo_(int codigo_) {
        this.codigo = codigo_;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
