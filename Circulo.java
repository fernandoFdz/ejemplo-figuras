/**
 * Esta clase representa objetos circulo con un radio
 * @author Fernando Granja 
 * @version 1.0 (8-septiembre-2017)
 */

public class Circulo extends Figura{

        private float radio;
        private float perimetro;
        
        public Circulo(float unRadio){
            radio=unRadio;
            perimetro=0;
        }
        
        /**
         * para usar el numero se le agrega una f para que lo vea como float
         */
        @Override       //avisa si no se hizo bien la sobreescritura
        public void calcularArea(){
            area= 3.14f * radio * radio;
        
        }
        
        /**
         * metodo que saca el perimetro y tambien se hace por herencia xd
         */
        @Override
        public void calcularPerimetro(){
            perimetro= 2 * 3.1416f * radio;
        }
}
