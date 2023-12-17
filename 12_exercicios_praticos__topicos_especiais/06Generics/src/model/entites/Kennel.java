/*-------------------- packages section --------------------*/
package model.entites;

/*-------------------- class Kennel --------------------*/
public class Kennel<E> {
	
	/*-------------------- attributes section --------------------*/
	private E animal;

	/*-------------------- getters and setters section --------------------*/
	public E getAnimal() {
		return this.animal;
	}

	public void setAnimal(E animal) {
		this.animal = animal;
	}
}
