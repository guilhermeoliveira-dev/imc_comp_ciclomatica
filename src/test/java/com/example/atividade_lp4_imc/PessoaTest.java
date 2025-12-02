package com.example.atividade_lp4_imc;

import org.easymock.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {


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

    @Test
    void imc_valido(){

        Pessoa pessoa = new Pessoa("Feminino", 1.0d, 20.0d);

        double imc = pessoa.getIMC();

        Assertions.assertEquals(20.0d, imc);

    }

}
