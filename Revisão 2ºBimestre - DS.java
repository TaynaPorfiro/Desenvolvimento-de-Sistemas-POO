public class PessoaRevisao {
	private String nome;
	private String altura;
	
	public PessoaRevisao(String nome, String altura) {
		this.nome = nome;
		this.altura = altura;
	}
	
	public PessoaRevisao() {
		
	}

	//Nome
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	//Altura
	public String getAltura() {
		return altura;
	}
	
	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	public void apresentarPessoa() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Altura: " + this.getAltura());
		
	}
}



import javax.swing.JOptionPane;

public class ImprimirPessoa {
	public static void main(String[] args) {
		PessoaRevisao p = new PessoaRevisao();
		StringBuilder frase = new StringBuilder();
		
        int answer;	
		
		do {
			p.setNome(JOptionPane.showInputDialog("Seu Nome:"));
			p.setAltura(JOptionPane.showInputDialog("Sua Altura:"));
			
			answer = JOptionPane.showConfirmDialog(
					null,
					"Essas informações estão corretas?" + 
					System.lineSeparator() + "Nome: " + p.getNome() + 
					System.lineSeparator() + "Altura: " + p.getAltura() 
					
	        );
			
			frase.append("Bem-vindo(a)!");
			JOptionPane.showMessageDialog(null, frase);
			
			}while(answer == 1);
		if(answer == 2) {

		}else {
			p.apresentarPessoa();
		}	
	}
}