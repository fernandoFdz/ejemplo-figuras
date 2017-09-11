/**
 * Esta clase representa objetos circulo con un radio
 * @author Fernando Granja 
 * @version 1.0 (10-septiembre-2017)
 */

public class Triangulo extends Figura{

        private float base;
        private float altura;
        private float perimetro;
        
        public Triangulo(float unaBase, float unaAltura){
            base=unaBase;
            altura=unaAltura;
            perimetro=0;
        }
        
        /**
         * para usar el numero se le agrega una f para que lo vea como float
         */
        @Override       //avisa si no se hizo bien la sobreescritura
        public void calcularArea(){
            area= base * altura;
        
        }
        
        @Override
        public void calcularPerimetro(){
            perimetro=(2 * altura) + base;
        }
}
