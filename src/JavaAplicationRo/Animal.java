package JavaAplicationRo;

abstract class Animal {
    protected String baba;
    private String cola;
  public abstract void animalSound();  // implementacion 
  public abstract void animalSound(String sonido,int duracion);  

// IMPORTANTE -> METODO ABSTRACTO => no se implementa en la clase abstracta pero si en la clases hijas
  public void animalSound(String x)
  {    System.out.println("hace ruido tomando aire");    }
  // Regular method
  public void sleep() {    System.out.println("Zzz");  }
}
// Subclass (inherit from Animal)
class Pig extends Animal {
 @Override
 public void animalSound() {
     //The body of animalSound() is provided here
     System.out.println("The pig says: wee wee");
   }
 @Override
 public void animalSound(String sonido,int duracion)
{ 
	}
 
}

