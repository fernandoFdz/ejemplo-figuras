/**
 * Esta clase representa objetos circulo con un radio
 * @author Fernando Granja 
 * @version 1.0 (10-septiembre-2017)
 */

public class Cuadrado extends Figura{

        private float lado;
        private float perimetro;
        public Cuadrado(float unLado){
            lado=unLado;
        }
        
        
        @Override       //avisa si no se hizo bien la sobreescritura
        public void calcularArea(){
            area= lado * lado;
        
        }
        
        @Override
        public void calcularPerimetro(){
            perimetro= lado + lado + lado + lado;
        }
}
