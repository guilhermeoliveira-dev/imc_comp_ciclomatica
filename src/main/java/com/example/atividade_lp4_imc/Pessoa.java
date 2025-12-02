package com.example.atividade_lp4_imc;

public class Pessoa implements PessoaMock{

    private String sexo;

    private double altura;
    private double peso;

    public Pessoa(String sexo, double altura, double peso){
        setSexo(sexo);
        setAltura(altura);
        setPeso(peso);
    }

    public double getIMC(){
        return getPeso() / Math.pow(getAltura(), 2);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if(!(sexo.equals("Masculino") || sexo.equals("Feminino"))){
            throw new IllegalArgumentException("Sexo inválido");
        }
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0){
            throw new IllegalArgumentException("Altura inválida");
        }
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0){
            throw new IllegalArgumentException("Peso inválido");
        }
        this.peso = peso;
    }


}
