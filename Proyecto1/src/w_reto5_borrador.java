public class w_reto5_borrador {
    public class Producto{
        // Atributos
        private int id, cantidad;
        private String nombre, categoria;
        double precio;

        public Producto(){}

        public Producto(int id, int cantidad, String nombre, String categoria, double precio) {
            this.cantidad = cantidad;
            this.nombre = nombre;
            this.categoria = categoria;
            this.precio = precio;
        }

        // Metodos

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }
    }
}
