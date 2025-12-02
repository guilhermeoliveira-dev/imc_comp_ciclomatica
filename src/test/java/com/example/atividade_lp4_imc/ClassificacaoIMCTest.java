package com.example.atividade_lp4_imc;

import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

class ClassificacaoIMCTest extends EasyMockSupport {

    @Mock
    private PessoaMock mock;


    @BeforeEach
    void setUp() {
        mock = createMock(PessoaMock.class);
    }

    @Test
    void Masculino_Abaixo_do_Peso() {
        expect(mock.getIMC()).andReturn(20.6d);
        expect(mock.getSexo()).andReturn("Masculino");
        replay(mock);
        String imc = ClassificacaoIMC.classificarIMC(mock);
        Assertions.assertEquals("Abaixo do Peso", imc);
    }

    @Test
    void Masculino_No_peso_normal() {
        expect(mock.getIMC()).andReturn(26.3d);
        expect(mock.getSexo()).andReturn("Masculino");
        replay(mock);
        String imc = ClassificacaoIMC.classificarIMC(mock);
        Assertions.assertEquals("No peso normal", imc);
    }

    @Test
    void Masculino_Marginalmente_acima_do_peso() {
//        Pessoa pessoa = new Pessoa("Masculino", 1.0f, 27.7);
        expect(mock.getIMC()).andReturn(27.7d);
        expect(mock.getSexo()).andReturn("Masculino");
        replay(mock);
        String imc = ClassificacaoIMC.classificarIMC(mock);
        Assertions.assertEquals("Marginalmente acima do peso", imc);
    }

    @Test
    void Masculino_Acima_do_peso_ideal() {
//        Pessoa pessoa = new Pessoa("Masculino", 1.0f, 31.0f);
        expect(mock.getIMC()).andReturn(31.0d);
        expect(mock.getSexo()).andReturn("Masculino");
        replay(mock);
        String imc = ClassificacaoIMC.classificarIMC(mock);
        Assertions.assertEquals("Acima do peso ideal", imc);
    }

    @Test
    void Masculino_Obeso() {
//        Pessoa pessoa = new Pessoa("Masculino", 1.0f, 31.1f);
        expect(mock.getIMC()).andReturn(31.1d);
        expect(mock.getSexo()).andReturn("Masculino");
        replay(mock);
        String imc = ClassificacaoIMC.classificarIMC(mock);
        Assertions.assertEquals("Obeso", imc);
    }

    @Test
    void Feminino_Abaixo_do_Peso() {
//        Pessoa pessoa = new Pessoa("Feminino", 1.0f, 19.0f);
        expect(mock.getIMC()).andReturn(19.0d);
        expect(mock.getSexo()).andReturn("Feminimo");
        replay(mock);
        String imc = ClassificacaoIMC.classificarIMC(mock);
        Assertions.assertEquals("Abaixo do Peso", imc);
    }

    @Test
    void Feminino_No_peso_normal() {
//        Pessoa pessoa = new Pessoa("Feminino", 1.0f, 25.7f);
        expect(mock.getIMC()).andReturn(25.7d);
        expect(mock.getSexo()).andReturn("Feminimo");
        replay(mock);
        String imc = ClassificacaoIMC.classificarIMC(mock);
        Assertions.assertEquals("No peso normal", imc);
    }

    @Test
    void Feminino_Marginalmente_acima_do_peso() {
//        Pessoa pessoa = new Pessoa("Feminino", 1.0f, 27.2);
        expect(mock.getIMC()).andReturn(27.2d);
        expect(mock.getSexo()).andReturn("Feminimo");
        replay(mock);
        String imc = ClassificacaoIMC.classificarIMC(mock);
        Assertions.assertEquals("Marginalmente acima do peso", imc);
    }

    @Test
    void Feminino_Acima_do_peso_ideal() {
//        Pessoa pessoa = new Pessoa("Feminino", 1.0f, 32.2f);
        expect(mock.getIMC()).andReturn(32.2d);
        expect(mock.getSexo()).andReturn("Feminimo");
        replay(mock);
        String imc = ClassificacaoIMC.classificarIMC(mock);
        Assertions.assertEquals("Acima do peso ideal", imc);
    }

    @Test
    void Feminino_Obeso() {
//        Pessoa pessoa = new Pessoa("Feminino", 1.0f, 32.3f);
        expect(mock.getIMC()).andReturn(32.3d);
        expect(mock.getSexo()).andReturn("Feminimo");
        replay(mock);
        String imc = ClassificacaoIMC.classificarIMC(mock);
        Assertions.assertEquals("Obeso", imc);
    }

}