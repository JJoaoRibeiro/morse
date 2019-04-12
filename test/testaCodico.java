

import morse.Morse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class testaCodico {
public Morse x;

 @Before
public void inicializar(){
  x = new Morse();


}
   @Test 
public void testarOK(){
    x.setMensagem("OK");
      assertEquals("--- -*-", x.codifica());

}
    @Test
public void testarTabela(){
  x.setMensagem("HERTON");
    assertEquals("**** * *-* - --- -*", x.codifica());
 
   }
}
