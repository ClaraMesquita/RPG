import java.util.Random;
public class Arqueiro extends Personagem{

	public static Random rand = new Random();
	
	
	public Arqueiro() {
		super();
		
	}


	void setQualidades() {
		vigor = rand.nextInt(41)+30;
		inteligencia = rand.nextInt(41)+30;
		if(vigor>inteligencia){
			agilidade = vigor + rand.nextInt(30)+1;
		}else{
			agilidade = inteligencia + rand.nextInt(30)+1;
		}
		
		
	}

	
	int getVigor() {
		
		return vigor;
	}

	
	int getAgilidade() {
		
		return agilidade;
	}

	
	int getInteligencia() {
		
		return inteligencia;
	}

	
	void setNome(String nome) {
		this.nome=nome;
		
	}

	
	String getNome() {
		
		return nome;
	}

	
	
	void setVida(double vigor, double agilidade, double inteligencia) {
		vida = 35 * (1 + (vigor / 50) + (agilidade / 100) + (inteligencia / 75));

		
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
		if(rand.nextInt(101) < 15){
			System.out.println("Tiro certeiro foi ativado\n");
			habilidade1 = true;
		}else
			habilidade1 = false;
		
	}


	
	void setHabilidade2() {
		if(rand.nextInt(101) < 3){
			System.out.println("Camuflagem foi ativada\n");
			habilidade1 = true;
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
		dano = 12 * (agilidade / 50) * (1 + (randmin+(randmax-randmin)*rand.nextDouble()));
		if(habilidade1 == true )
			dano = dano*1.25;
		else ;

	}
	public double getDano(){
		return dano;
		
	}
	

	void setNovaVida(double vida, double dano) {
		if(habilidade2 == true )
		this.vida=vida;
		else this.vida=vida-dano;
		
	}


	
	double getNovaVida() {
		
		return vida;
	}



}
