import java.util.Random;


abstract class Personagem {
	protected double vida;
	protected boolean habilidade1,habilidade2;
	protected String nome;
	protected int vigor,agilidade,inteligencia;
	Random rand = new Random();
	double randmax = 0.1;
	double randmin = 0.8;
	double dano=0;
	
	abstract void setQualidades();
	abstract int getVigor();
	abstract int getAgilidade();
	abstract int getInteligencia();
	abstract void setNome(String nome);
	abstract String getNome();
	abstract void setVida(double vigor,double agilidade,double inteligencia);
	abstract double getVida();
	abstract void imprimir();
	abstract void setHabilidade1();
	abstract void setHabilidade2();
	abstract boolean getHabilidade1();
	abstract boolean getHabilidade2();
	abstract void dano(double vigor,double agilidade,double inteligencia);
	abstract double getDano();
	abstract void setNovaVida(double vida,double dano);
	abstract double getNovaVida();

	
}
