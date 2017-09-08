/**
 * Esta clase representa objetos circulo con un radio
 * @author Fernando Granja 
 * @version 1.0 (8-septiembre-2017)
 */

public class Circulo extends Figura{

        private float radio;
        
        public Circulo(float unRadio){
            radio=unRadio;
        }
        
        /**
         * para usar el numero se le agrega una f para que lo vea como float
         */
        @Override       //avisa si no se hizo bien la sobreescritura
        public void calcularArea(){
            area= 3.14f * radio * radio;
        
        }
}
