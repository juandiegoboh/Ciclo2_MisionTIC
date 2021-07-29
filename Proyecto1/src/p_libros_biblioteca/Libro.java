package p_libros_biblioteca;

public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int ejemplares, prestados;

    // Constructor
    public Libro(){}

    public Libro(String titulo, String autor, int ejemplares, int prestados){
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return this.ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return this.prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public boolean prestamo(){
        // Incrementa el atributo cada vez que se realice un préstamo del libro
        boolean prest;
        if (this.ejemplares > this.prestados){
            this.prestados ++;
            prest = true;
        } else {
            prest = false;
        }

        return prest; // Asignar el valor correcto
    }

    public boolean devolucion(){
        // Decrece el atributo cada vez que se devuelva un libro. No se pueden devolver libros que no fueron prestados
        boolean dev;
        if(this.prestados > 0){
            this.prestados--;
            dev = true;
        } else {
            dev = false;
        }

        return dev; // Asignar el valor correcto
    }

    public String informacion(){
        // Devuelve la inforamción de los libros
        return "Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nNumero de ejemplares: " + this.ejemplares
                + "\nEjemplares prestados: " + this.prestados;

    }
}
