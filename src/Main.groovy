
import com.acelerazg.menu.MenuCandidato


static void main(String[] args) {

  def scanner = new Scanner(System.in)
  def menuCandidato = new MenuCandidato()
  while (true) {
    println "\nMenu:"
    println "1. Gerenciar Empresas"
    println "2. Gerenciar Candidatos"
    println "3. Sair"
    print "Escolha uma opção: "

    def opcao = scanner.nextLine().toInteger()

    switch(opcao) {
      case 1:
        println "\nEmpresas cadastradas:"
        break
      case 2:
        println "\nCandidatos cadastradas:"
        menuCandidato.gerenciarCandidato()
        break
      case 3:
        println "Saindo do programa..."
        System.exit(0)
      default:
        println "Opção inválida! Por favor, escolha uma opção válida."
    }
  }
}