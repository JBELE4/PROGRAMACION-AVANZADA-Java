class Fraccion {

	private float numerador;
	private float denominador;

	public Fraccion(){
		this(0.0f,0.0f);
	}
	
	public Fraccion(float numerador, float denominador){
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public String toString(){
		return this.numerador+"/"+this.denominador;
	}
	
	public boolean igual(Fraccion fraccion){
		return (this.numerador == fraccion.numerador) && 
			(this.denominador == fraccion.denominador);
	}
	
	public boolean equivalente(Fraccion fraccion){
		return this.numerador / this.denominador == 
			fraccion.numerador / fraccion.denominador;
	}

    public void recogerTeclado(){
    	java.util.Scanner s = new java.util.Scanner(System.in);

		System.out.print("Dame el numerador: ");
		this.numerador = s.nextInt();
		
		System.out.print("Dame el denominador: ");
		this.denominador = s.nextInt();
    }


}