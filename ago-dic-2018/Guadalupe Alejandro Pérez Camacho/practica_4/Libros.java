package javaapplication5;

public class Libros {
    private String titulo;
    private int pages;
    public Libros(String s, int x){
        titulo=s;
        pages=x;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
}
