package com.example.atividade_lp4_imc;

public class Pessoa {

    private String sexo;

    private double altura;
    private double peso;

    public String getSexo() {
        return sexo;
    }

    public Pessoa(String sexo, double altura, double peso){
        setSexo(sexo);
        setAltura(altura);
        setPeso(peso);
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

    public String calcularIMC(){

        double imc = peso / Math.pow(altura, 2);

        if(sexo.equals("Masculino")){
            if(imc < 20.7f){
                return "Abaixo do Peso";
            }
            else if(imc < 26.4f){
                return "No peso normal";
            }
            else if(imc < 27.8f){
                return "Marginalmente acima do peso";
            }
            else if(imc < 31.1f){
                return "Acima do peso ideal";
            }
            else{
                return "Obeso";
            }
        }
        else{
            if(imc < 19.1f){
                return "Abaixo do Peso";
            }
            else if(imc < 25.8f){
                return "No peso normal";
            }
            else if(imc < 27.3f){
                return "Marginalmente acima do peso";
            }
            else if(imc < 32.3f){
                return "Acima do peso ideal";
            }
            else{
                return "Obeso";
            }
        }
    }

}
