package uaslp.objetos.escuela;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }

    @Test
    public void dependenciasIguales(){
        Dependencia1 dependencia1 = null;
        Dependencia2 dependencia2 = null;
        Dependencia3 dependencia3 = null;

        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);
        Assertions.assertEquals(dependencia1, algoritmoX.getDependencia1());
        Assertions.assertEquals(dependencia2, algoritmoX.getDependencia2());
        Assertions.assertEquals(dependencia3, algoritmoX.getDependencia3());

    }

    @Test
    public void testSaveDependencia1(){
        Saver saver = new Saver();
        Impresora impresora = new Impresora();
        Sender sender = new Sender();

        AlgoritmoX algoritmoX = new AlgoritmoX(saver, impresora, sender);

        assertTrue(algoritmoX.algoritmoACubrir(1,1,"Hello"));

    }

    @Test
    public void testprintDependencia2(){
        Saver saver = new Saver();
        Impresora impresora = new Impresora();
        Sender sender = new Sender();

        AlgoritmoX algoritmoX = new AlgoritmoX(saver, impresora, sender);

        assertTrue(algoritmoX.algoritmoACubrir(1,2,"Hello"));

    }

    @Test
    public void testSendDependencia3(){
        Saver saver = new Saver();
        Impresora impresora = new Impresora();
        Sender sender = new Sender();

        AlgoritmoX algoritmoX = new AlgoritmoX(saver, impresora, sender);

        assertTrue(algoritmoX.algoritmoACubrir(2,1,"Hello"));

    }
}