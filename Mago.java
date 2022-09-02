import java.util.Random;
public class Mago extends Personagem{
	public static Random rand = new Random();
	
	


	public Mago() {
		super();
		
		
	}


	void setQualidades() {
		vigor = rand.nextInt(41)+20;
		agilidade = rand.nextInt(41)+20;
		if(vigor>agilidade){
			inteligencia = vigor + rand.nextInt(40)+1;
		}else{
			inteligencia = agilidade + rand.nextInt(40)+1;
		}
		
	}

	
	int getVigor() {
		
		return vigor ;
	}
	
	public int getAgilidade(){
		
		return agilidade;
	}
	
	public int getInteligencia(){
		
		return inteligencia;
	}

	
	void setNome(String nome) {
		this.nome=nome;
		
	}

	
	String getNome() {
		
		return nome;
	}

	

	
	void setVida(double vigor,double agilidade,double inteligencia) {
		vida = 25 * (1 + (vigor / 75) + (inteligencia / 75));
		
	}



	double getVida() {

		return vida;
	}


	
	void imprimir() {
		System.out.println("\n"+getNome());
		System.out.println("\nVigor: "+getVigor()+" \nAgilidade:"+getAgilidade()+" \ninteligência :"+getInteligencia());
		System.out.println("Vida: "+getVida());
		
	}



	void setHabilidade1() {
		if(rand.nextInt(101) < 10){
			System.out.println("Conflagar foi ativado\n");
			habilidade1 = true;
		}else
			habilidade1 = false;
		
	}


	
	void setHabilidade2() {
		if(rand.nextInt(101) < 5){
			habilidade1 = true;
			System.out.println("Cura foi ativada\n");			
		}else
			habilidade1 = false;
		
		
	}




	boolean getHabilidade1() {
		return habilidade1;
		
	}


	
	boolean getHabilidade2() {
		return habilidade2;
		
	}
	
	public void dano(double vigor,double agilidade,double inteligencia){
		dano = 15 * (inteligencia / 25) * (1 + (randmin+(randmax-randmin)*rand.nextDouble()));
		if(habilidade1 == true )
			dano = dano*1.55;
		else ;
	}
	
	public double getDano(){
		return dano;
		
	}


	void setNovaVida(double vida, double dano) {
		if(habilidade2 == true ){
			vida = 25 * (1 + (vigor / 75) + (inteligencia / 75));;
		}else this.vida=vida-dano;
		
	}


	
	double getNovaVida() {
		
		return vida;
	}

}
