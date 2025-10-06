package com.example.atividade_lp4_imc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @BeforeEach
    void setUp(){

    }

    @Test
    void Masculino_Abaixo_do_Peso(){
        Pessoa pessoa = new Pessoa("Masculino", 1.0f, 20.6f);
        String imc = pessoa.calcularIMC();
        Assertions.assertEquals("Abaixo do Peso", imc);
    }

    @Test
    void Masculino_No_peso_normal(){
        Pessoa pessoa = new Pessoa("Masculino", 1.0f, 26.3f);
        String imc = pessoa.calcularIMC();
        Assertions.assertEquals("No peso normal", imc);
    }

    @Test
    void Masculino_Marginalmente_acima_do_peso(){
        Pessoa pessoa = new Pessoa("Masculino", 1.0f, 27.7);
        String imc = pessoa.calcularIMC();
        Assertions.assertEquals("Marginalmente acima do peso", imc);
    }

    @Test
    void Masculino_Acima_do_peso_ideal(){
        Pessoa pessoa = new Pessoa("Masculino", 1.0f, 31.0f);
        String imc = pessoa.calcularIMC();
        Assertions.assertEquals("Acima do peso ideal", imc);
    }

    @Test
    void Masculino_Obeso(){
        Pessoa pessoa = new Pessoa("Masculino", 1.0f, 31.1f);
        String imc = pessoa.calcularIMC();
        Assertions.assertEquals("Obeso", imc);
    }

    @Test
    void Feminino_Abaixo_do_Peso(){
        Pessoa pessoa = new Pessoa("Feminino", 1.0f, 19.0f);
        String imc = pessoa.calcularIMC();
        Assertions.assertEquals("Abaixo do Peso", imc);
    }

    @Test
    void Feminino_No_peso_normal(){
        Pessoa pessoa = new Pessoa("Feminino", 1.0f, 25.7f);
        String imc = pessoa.calcularIMC();
        Assertions.assertEquals("No peso normal", imc);
    }

    @Test
    void Feminino_Marginalmente_acima_do_peso(){
        Pessoa pessoa = new Pessoa("Feminino", 1.0f, 27.2);
        String imc = pessoa.calcularIMC();
        Assertions.assertEquals("Marginalmente acima do peso", imc);
    }

    @Test
    void Feminino_Acima_do_peso_ideal(){
        Pessoa pessoa = new Pessoa("Feminino", 1.0f, 32.2f);
        String imc = pessoa.calcularIMC();
        Assertions.assertEquals("Acima do peso ideal", imc);
    }

    @Test
    void Feminino_Obeso(){
        Pessoa pessoa = new Pessoa("Feminino", 1.0f, 32.3f);
        String imc = pessoa.calcularIMC();
        Assertions.assertEquals("Obeso", imc);
    }

    @Test
    void altura_invalida(){
        try{
            Pessoa pessoa = new Pessoa("Feminino", 0.0f, 20.0f);
            Assertions.fail("A altura inválida deveria ter causado uma exceção.");
        } catch(IllegalArgumentException e){
            Assertions.assertEquals("Altura inválida", e.getMessage());
        }
    }

    @Test
    void altura_valida(){
        try{
            Pessoa pessoa = new Pessoa("Feminino", 1.0f, 20.0f);
            Assertions.assertEquals(1.0f, pessoa.getAltura());
        } catch(IllegalArgumentException e){
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    void peso_invalido(){
        try{
            Pessoa pessoa = new Pessoa("Feminino", 1.0f, 0.0f);
            Assertions.fail("O peso inválido deveria ter causado uma exceção.");
        }catch (IllegalArgumentException e){
            Assertions.assertEquals("Peso inválido", e.getMessage());
        }
    }

    @Test
    void peso_valido(){
        try{
            Pessoa pessoa = new Pessoa("Feminino", 1.0f, 20.0f);
            Assertions.assertEquals(20.0f, pessoa.getPeso());
        }catch (IllegalArgumentException e){
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    void sexo_invalido(){
        try{
            Pessoa pessoa = new Pessoa("", 1.0f, 20.0f);
            Assertions.fail("O sexo inválido deveria ter causado uma exceção.");
        }catch (IllegalArgumentException e){
            Assertions.assertEquals("Sexo inválido", e.getMessage());
        }
    }

    @Test
    void sexo_valido(){
        try{
            Pessoa pessoa = new Pessoa("Feminino", 1.0f, 20.0f);
            Assertions.assertEquals("Feminino", pessoa.getSexo());
        }catch (IllegalArgumentException e){
            Assertions.fail(e.getMessage());
        }
    }

}
