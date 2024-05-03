package com.alura.model;

public abstract  class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;
    private String sinopsis;
    private int tiempoDeDuracionEnMinutos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    public abstract String obtenerTipo();

    public void muestraFichaTecnica(){
        System.out.println("****FICHA TÉCNICA****");
        System.out.println("Nombre del título: " + nombre);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Incluido en el plan básico: " + incluidoEnElPlanBasico);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Tiempo de duración: " + getTiempoDeDuracionEnMinutos() + " minutos");
    }
}