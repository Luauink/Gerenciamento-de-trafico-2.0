package br.com.fiap.trafego;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("dev") // Adicione esta linha para ativar o perfil 'dev'
@SpringBootTest
class AcidenteApplicationTests {

   AcidenteApplicationTests() {
   }

   @Test
   void contextLoads() {
   }
}