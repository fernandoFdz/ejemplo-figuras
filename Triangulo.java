/**
 * Esta clase representa objetos circulo con un radio
 * @author Fernando Granja 
 * @version 1.0 (8-septiembre-2017)
 */

public class Triangulo extends Figura{

        private float base;
        private float altura;
        
        public Triangulo(float unaBase, float unaAltura){
            base=unaBase;
            altura=unaAltura;
        }
        
        /**
         * para usar el numero se le agrega una f para que lo vea como float
         */
        @Override       //avisa si no se hizo bien la sobreescritura
        public void calcularArea(){
            area= base * altura;
        
        }
}
