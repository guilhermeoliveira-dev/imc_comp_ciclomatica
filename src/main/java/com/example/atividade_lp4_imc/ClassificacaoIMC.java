package com.example.atividade_lp4_imc;

public class ClassificacaoIMC {

    public static String classificarIMC(PessoaMock pessoa){

        double imc = pessoa.getIMC();

        if(pessoa.getSexo().equals("Masculino")){
            if(imc < 20.7d){
                return "Abaixo do Peso";
            }
            else if(imc < 26.4d){
                return "No peso normal";
            }
            else if(imc < 27.8d){
                return "Marginalmente acima do peso";
            }
            else if(imc < 31.1d){
                return "Acima do peso ideal";
            }
            else{
                return "Obeso";
            }
        }
        else{
            if(imc < 19.1d){
                return "Abaixo do Peso";
            }
            else if(imc < 25.8d){
                return "No peso normal";
            }
            else if(imc < 27.3d){
                return "Marginalmente acima do peso";
            }
            else if(imc < 32.3d){
                return "Acima do peso ideal";
            }
            else{
                return "Obeso";
            }
        }
    }

}
