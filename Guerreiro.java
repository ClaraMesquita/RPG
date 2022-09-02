import java.util.Random;
public class Guerreiro extends Personagem{
	public static Random rand = new Random();
	
	
	public Guerreiro() {
		super();
		
	}


	void setQualidades() {
		inteligencia = rand.nextInt(41)+30;
		agilidade = rand.nextInt(41)+30;
		if(inteligencia>agilidade){
			vigor = inteligencia + rand.nextInt(30)+1;
		}else{
			vigor = agilidade + rand.nextInt(30)+1;
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


	void setVida(double vigor,double agilidade,double inteligencia) {
		vida = 50 * (1 + (vigor / 25) + (agilidade / 100));

		
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
		if(rand.nextInt(101) < 8){
			System.out.println("Adrenalina foi ativada\n");
			habilidade1 = true;
		}else
			habilidade1 = false;
		
	}


	
	void setHabilidade2() {
		if(rand.nextInt(101) < 6){
			System.out.println("Heroísmo foi ativado\n");
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
		dano = 10 * (vigor/100) * (1 + (randmin+(randmax-randmin)*rand.nextDouble()));
		if(habilidade1 == true )
			dano = dano*1.4;
		else ;

	}
	public double getDano(){
		return dano;
		
	}


	
	void setNovaVida(double vida, double dano) {
		if(habilidade2 == true )
		this.vida=vida-dano*0.5;
		else this.vida=vida-dano;
		
	}


	
	double getNovaVida() {
		
		return vida;
	}




}

