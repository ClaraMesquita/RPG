import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {

	public static  void main(String[] args) {
		
		ArrayList<Personagem> equipe1 = new ArrayList<Personagem>();
		ArrayList<Personagem> personagem = new ArrayList<Personagem>();
		ArrayList<Personagem> equipe2 = new ArrayList<Personagem>();
		
		Scanner in = new Scanner(System.in);
		int a = 5;
		int i;
		
		Personagem [] mago = new Mago[a]; 
		Personagem [] arqueiro = new Arqueiro[a];
		Personagem [] guerreiro = new Guerreiro[a];
		
//Criar personagens
		System.out.println("###BEM VINDO AO PC COMBATE###\n");
		System.out.println("\nNesse jogo acontecerá uma batalha épica entre magos, guerreiros e arqueiros. \n\n Aproveite essa nova aventura!\n\nPara iniciar esse jornada você deverá escolher entre os três diferentes tipos de lutadores: \n\n Guerreiro: especialista em combate corpo a corpo; seu principal atributo é Vigor.\n\n Arqueiro: especialista em combate de longa distância; seu principal atributo é a Agilidade. \n\n Mago: especialista em combate em média distância; seu principal atributo é a Inteligência.");
		System.out.println("\n\n\n## Instruções: ## \n#Para escolher um lutador deve-se digitar seu códido.\n# Após isso, escolhe-se a ordem da luta, formando assim sua equipe.\n# As incriveis e emocionantes batalhas são até a morte e quando o lutador de uma equipe morre ele é automaticamente substituido pelo seu parceiro.\n# Além disso, poderes magicos poderão ser ativados a qualquer momento, mudando completamente a logica da batalha!\n# O jogador que tiver seus dois lutadores mortos perde o jogo.");
		System.out.println("\n\n#As habilidades especiais são:\nGuerreiro: Adrenalina: 8% de chance de ocorrer - Bônus: aumenta o dano na batalha em 40% | Heroísmo: 6% de chance de ocorrer - Bônus: diminui em 50% o dano recebido durante a batalha\nArqueiro: Tiro certeiro: 15% de chance de ocorrer - Bônus: aumenta o dano na batalha em 25% | Camuflagem: 3% de chance de ocorrer - Bônus: diminui em 100% o dano recebido durante a batalha\nMago: Cura: 5% de chance de ocorrer - Bônus: restaurar todos os pontos de vida | Conflagar: 10% de chance de ocorrer | Bônus: aumentar o dano na batalha em 55%");
		System.out.println("\n\n\n#  Os lutadores disponiveis são: #");
		for (i=0;i<a;i++){
			
			mago[i] = new Mago();
			arqueiro [i] = new Arqueiro();
			guerreiro [i] = new Guerreiro();
			
			mago[i].setQualidades();
			arqueiro[i].setQualidades();
			guerreiro[i].setQualidades();
			
			mago[i].setVida(mago[i].getVigor(),mago[i].getAgilidade(),mago[i].getInteligencia());
			arqueiro[i].setVida(arqueiro[i].getVigor(),arqueiro[i].getAgilidade(),arqueiro[i].getInteligencia());
			guerreiro[i].setVida(guerreiro[i].getVigor(),guerreiro[i].getAgilidade(),guerreiro[i].getInteligencia());
			
			mago[i].setNome("Mago:"+(i+1));
			arqueiro[i].setNome("Arqueiro: "+(i+1));
			guerreiro[i].setNome("Guerreiro: "+(i+1));
			
		}
		
//Escolher equipes
		
		
		for (i=0;i<a;i++){
			personagem.add(mago[i]);
			personagem.add(arqueiro[i]);
			personagem.add(guerreiro[i]);
		}
		
		/*for (i=0;i<personagem.size();i++){
			personagem.get(i).imprimir();
			System.out.println("Código do personagem: "+(i+1));
		}*/
		
		//b é igual ao número de personagens por equipe
		int b = 2;
		for (int j=0;j<b;j++){

		//equipe 1
			boolean flag = false;
			for (i=0;i<personagem.size();i++){
			
				personagem.get(i).imprimir();
				System.out.println("Código do personagem: "+(i+1));}
			do{	System.out.println("\nJogador 1 : Entre com o código do lutador que você deseja colocar na sua equipe");		
			try{
				int codigo = in.nextInt();
				equipe1.add(personagem.get(codigo-1));
				personagem.remove(codigo-1);
				flag = true;
			}

			catch(java.lang.IndexOutOfBoundsException e){
				System.out.println("Entrada inválida");
				flag = false;
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Entrada inválida");
				flag = false;
				in.nextLine();
			}
			}while(flag==false);
			
			
			//Nomear personagem
			
			System.out.println("De um nome para o personagem escolhido:");
			in.nextLine();
			String nome = in.nextLine();
			equipe1.get(j).setNome(nome);
			
		//equipe 2			
			
			
			for (i=0;i<personagem.size();i++){
				personagem.get(i).imprimir();
				System.out.println("Código do personagem: "+(i+1));
			}
			do{
				System.out.println("\nJogador 2: Entre com o código do lutador que você deseja colocar na sua equipe");
				try{
					int codigo2 = in.nextInt();
					equipe2.add(personagem.get(codigo2-1));
					personagem.remove(codigo2-1);
					flag=true;
				}catch(java.lang.IndexOutOfBoundsException e){
					System.out.println("Entrada inválida");	
					flag=false;
				}catch(java.util.InputMismatchException e){
					System.out.println("Entrada inválida");
					flag = false;
					in.nextLine();
				}
			}while(flag==false);			


			//Nomear personagem
			
			System.out.println("De um nome para o personagem escolhido:");
			in.nextLine();
			String nome1 = in.nextLine();
			equipe2.get(j).setNome(nome1);
			
		}
		
//Imprimir equipes
		
		System.out.println("\n\nAs equipes são:");
		System.out.println("# Jogador 1:");
		for (i=0;i<equipe1.size();i++){
			equipe1.get(i).imprimir();
		}
		System.out.println("# Jogador 2:");
		for (i=0;i<equipe2.size();i++){
			equipe2.get(i).imprimir();
		}
		
//Ordem de jogo
	//jogador 1
		System.out.println("\n##  Jogador 1,seus personagens são: ##");
		for (i=0;i<equipe1.size();i++){
			System.out.println(equipe1.get(i).getNome());
			System.out.println("Código:"+(i+1));
		}
		boolean flag = false;
		do{
			System.out.println("\nJogador 1, escolha seu primeiro personagem");
		try {
		int ordem = in.nextInt();
		switch(ordem){
		case 1:
			break;
		case 2:
			Collections.reverse(equipe2);
			break;
		default: 
			throw new IllegalArgumentException();
		}
		flag=true;
		}
		catch (IllegalArgumentException e){
			System.out.println("Opção invalidada");
			flag=false;
		}
		catch (java.util.InputMismatchException e) {
			System.out.println("Opção invalidada");
			flag=false;
			in.nextLine();
		}
		
		}while (flag==false);
		
		
		
	//jogador 2
		System.out.println("\n## Jogador 2, seus personagens são:  ##");
		for (i=0;i<equipe2.size();i++){
			System.out.println(equipe2.get(i).getNome());
			System.out.println("Código:"+(i+1));
		}
		do{
			System.out.println("\nJogador 2, escolha seu primeiro personagem");
		try {
		int ordem1 = in.nextInt();
		switch(ordem1){
		case 1:
			break;
		case 2:
			Collections.reverse(equipe2);
			break;
		default: 
			throw new IllegalArgumentException();
		}
		flag=true;
		}
		catch (IllegalArgumentException e){
			System.out.println("Opção invalidada");
			flag=false;
		}
		catch(java.util.InputMismatchException e){
			System.out.println("Entrada inválida");
			flag = false;
			in.nextLine();
		}
		}while (flag==false);
		
//Imprimir equipes
		
		System.out.println("\nOrdem de batalha:");
		System.out.println("\nAs equipes são:");
		System.out.println("Jogador 1:");
		for (i=0;i<equipe1.size();i++){
			equipe1.get(i).imprimir();
		}
		System.out.println("Jogador 2:");
		for (i=0;i<equipe2.size();i++){
			equipe2.get(i).imprimir();
		}
		
//Batalha
		
		do{
	//preparação	
		//jodador 1
		if(equipe1.get(0) instanceof Guerreiro){
			do{
				System.out.println("Jogador 1:");
			
			System.out.println("Escolha sua habilidade:\n1-Adrenalina\n2-Heroísmo");
			try{
			int hab = in.nextInt();
			switch(hab){
			case 1:
				equipe1.get(0).setHabilidade1();
				break;
			case 2:
				equipe1.get(0).setHabilidade2();
				break;
			default: 
				throw new IllegalArgumentException();
				
			}
			flag = true;
			}
			catch (IllegalArgumentException e){
				System.out.println("Opção invalidada");
				flag=false;
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Entrada inválida");
				flag = false;
				in.nextLine();
			}
			}
			
		
			while(flag==false);		
		}
		
		
		if(equipe1.get(0) instanceof Arqueiro){
			do{
			System.out.println("Jogador 1:");
			
			System.out.println("Escolha sua habilidade:\n1-Tiro certeiro\n2-Camuflagem");
			try{
				int hab = in.nextInt();
				switch(hab){
				case 1:
					equipe1.get(0).setHabilidade1();
					break;
				case 2:
					equipe1.get(0).setHabilidade2();
					break;
				default: 
					throw new IllegalArgumentException();
				}
				flag = true;
				}
				catch (IllegalArgumentException e){
					System.out.println("Opção invalidada");
					flag=false;
				}
			catch(java.util.InputMismatchException e){
				System.out.println("Entrada inválida");
				flag = false;
				in.nextLine();
			}
			}
				while(flag==false);		
			}
		
		if(equipe1.get(0) instanceof Mago){
			do{
			System.out.println("Jogador 1:");
			System.out.println("Escolha sua habilidade:\n1-Cura\n2-Conflagar");
			try{
				int hab = in.nextInt();
				switch(hab){
				case 1:
					equipe1.get(0).setHabilidade2();
					break;
				case 2:
					equipe1.get(0).setHabilidade1();
					break;
				default: 
					throw new IllegalArgumentException();
				}
				flag = true;
				}
				catch (IllegalArgumentException e){
					System.out.println("Opção invalidada");
					flag=false;
				}
			catch(java.util.InputMismatchException e){
				System.out.println("Entrada inválida");
				flag = false;
				in.nextLine();
			}
			}
				while(flag==false);		
			}
		//jogador 2
		
		if(equipe2.get(0) instanceof Guerreiro){
			do{
			System.out.println("Jogador 2:");
			System.out.println("Escolha sua habilidade:\n1-Adrenalina\n2-Heroísmo");
			try{
				int hab = in.nextInt();
				switch(hab){
				case 1:
					equipe2.get(0).setHabilidade1();
					break;
				case 2:
					equipe2.get(0).setHabilidade2();
					break;
				default: 
					throw new IllegalArgumentException();
				}
				flag = true;
				}
				catch (IllegalArgumentException e){
					System.out.println("Opção invalidada");
					flag=false;
				}
			catch(java.util.InputMismatchException e){
				System.out.println("Entrada inválida");
				flag = false;
				in.nextLine();
			}
			}
				while(flag==false);		
			}
		
		if(equipe2.get(0) instanceof Arqueiro){
			do{
			System.out.println("Jogador 2:");
			System.out.println("Escolha sua habilidade:\n1-Tiro certeiro\n2-Camuflagem");
			try{
				int hab = in.nextInt();
				switch(hab){
				case 1:
					equipe2.get(0).setHabilidade1();
					break;
				case 2:
					equipe2.get(0).setHabilidade2();
					break;
				default: 
					throw new IllegalArgumentException();
				}
				flag = true;
				}
				catch (IllegalArgumentException e){
					System.out.println("Opção invalidada");
					flag=false;
				}
			catch(java.util.InputMismatchException e){
				System.out.println("Entrada inválida");
				flag = false;
				in.nextLine();
			}
			}
				while(flag==false);		
			}
		if(equipe2.get(0) instanceof Mago){
			do{
			System.out.println("Jogador 2:");
			System.out.println("Escolha sua habilidade:\n1-Cura\n2-Conflagar");
			try{
				int hab = in.nextInt();
				switch(hab){
				case 1:
					equipe2.get(0).setHabilidade2();
					break;
				case 2:
					equipe2.get(0).setHabilidade1();
					break;
				default: 
					throw new IllegalArgumentException();
				}
				flag = true;
				}
				catch (IllegalArgumentException e){
					System.out.println("Opção invalidada");
					flag=false;
				}
			catch(java.util.InputMismatchException e){
				System.out.println("Entrada inválida");
				flag = false;
				in.nextLine();
			}
			}
				while(flag==false);		
			}
			
			
			
			
	//Ataque	
			
		System.out.println(equipe1.get(0).getNome()+" e "+equipe2.get(0).getNome()+" estão batalhando");
		
		
		equipe1.get(0).dano(equipe1.get(0).getVigor(),equipe1.get(0).getAgilidade(),equipe1.get(0).getInteligencia());
		equipe2.get(0).dano(equipe2.get(0).getVigor(),equipe2.get(0).getAgilidade(),equipe2.get(0).getInteligencia());
		
		equipe1.get(0).setNovaVida(equipe1.get(0).getVida(),equipe2.get(0).getDano());
		equipe2.get(0).setNovaVida(equipe2.get(0).getVida(),equipe1.get(0).getDano());
		
		
		System.out.println("Ataque do "+equipe1.get(0).getNome()+" do jogador 1:"+equipe1.get(0).getDano()+"\nAtaque do "+equipe2.get(0).getNome()+" do jogador 2:"+equipe2.get(0).getDano()+"\n");
		System.out.println("Nova vida do "+equipe1.get(0).getNome()+" do jogador 1:"+equipe1.get(0).getNovaVida()+"\nNova vida do "+equipe2.get(0).getNome()+" do jogador 2:"+equipe2.get(0).getNovaVida());

		//morte do personagem
		if(equipe1.get(0).getNovaVida()<=0){
			System.out.println(equipe1.get(0).getNome()+" do jogador 1 morreu\n");
			equipe1.remove(0);
		}if(equipe2.get(0).getNovaVida()<=0){
			System.out.println(equipe2.get(0).getNome()+" do jogador 2 morreu\n");
			equipe2.remove(0);
		}else{
			System.out.println("A batalha continua!\n");
		}
		//fim do jogo
		if (equipe1.size()== 0){
			System.out.println("Parabéns jogador 2, você ganhou!* Brilhou *");
			
		}
		if(equipe2.size()== 0){
			System.out.println("Parabéns jogador 1, você ganhou!* Brilhou *");
			
		}
		else if(equipe1.size()==0 && equipe2.size()==0){
			System.out.println("Parabéns a todos, foi uma boa luta!");
		}
		
		}while(equipe1.size()>0 && equipe2.size()>0);
		
		
	}

}

