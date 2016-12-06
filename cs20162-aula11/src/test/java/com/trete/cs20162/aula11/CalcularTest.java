/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trete.cs20162.aula11;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
  *Classe que testa o método calcular da classe Calcular.
 */
public class CalcularTest {
   @Test (expected = RuntimeException.class)
   public void expressaoInvalida() {
       Calcular.calcular("asdfdsa");
   }

   @Test (expected = RuntimeException.class)
   public void expressaoInvalidaPorExcessoDeTermos() {
       Calcular.calcular("5*598-26195");
   }

   @Test
   public void teste1() {
       assertEquals(96, Calcular.calcular("30+66"));
   }

   @Test
   public void teste2() {
       assertEquals(20, Calcular.calcular("36-56"));
   }

   @Test
   public void teste3() {
       assertEquals(1200, Calcular.calcular("30*40"));
   }

   @Test
   public void teste4() {
       assertEquals(20, Calcular.calcular("8000/400"));
   }

}
