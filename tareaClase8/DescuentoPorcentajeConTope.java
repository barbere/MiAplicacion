package tareaClase8;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje{
private float tope;
	
	public DescuentoPorcentajeConTope(float tope) {
		super(0);
		this.tope = tope;
		
	
	}

	public float getTope() {
		return this.tope;
	}

	public void setTope(float nuevoValor)throws ValorCeroException,TotalNegativoException {
		this.tope = nuevoValor;
	}
public void setValorDesc(float valor) {
	if(valor>this.tope) {
		super.setValorDesc(0);
		System.out.println("no se puede poner ese valor porque supero el tope");
	}else {
		super.setValorDesc(valor);
	}
}
}
