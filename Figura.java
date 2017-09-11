/**
 * esta es una super clase para representar las caracteristicas comunes 
 * de muchas figuras
 * 
 * @author Fernando Granja 
 * @version 1.0 (10-septiembre-2017)
 */
public class Figura{
    protected float area;   //area de cada figura
    protected float perimetro;
    /**
     * constructor de la clase figura 
     */
    public Figura(){
        area=0;
        perimetro=0;
    }
    
    public void calcularArea(){
        System.out.println("no se como calcular el area porque no se de que figura se tratre");
    }
    
    public void calcularPerimetro(){
        System.out.println("no se como calcular el perimetro porque no se de que figura se trata");
    }
    
    public void imprimirArea(){
        System.out.println("el area es: "+area);
    }
    
    public void imprimirPerimetro(){
        System.out.println("el perimetro es:"+perimetro);
    }
}