package Linketinder.com.acelerazg
import Linketinder.com.acelerazg.View.CandidatoView
import Linketinder.com.acelerazg.View.CompetenciaView
import Linketinder.com.acelerazg.View.EmpresaView


static void main(String[] args) {

  Scanner scanner = new Scanner(System.in)

  EmpresaView menuEmpresa = new EmpresaView()
  CompetenciaView menuCompetencia = new CompetenciaView()
  CandidatoView menuCandidato = new CandidatoView()


  while (true) {
    println "\nMenu:"
    println "1. Gerenciar Empresas"
    println "2. Gerenciar Candidatos"
    println "3. Gerenciar Competências"
    println "4. Sair"
    print "Escolha uma opção: "

    int opcao = scanner.nextInt()
    scanner.nextLine()

    if (!opcao) {
      println "Entrada vazia! Por favor, digite um número."
      continue
    }

    try {
      switch(opcao) {
        case 1:
          println "\nEmpresas cadastradas:"
          menuEmpresa.gerenciarEmpresa()
          break
        case 2:
          println "\nCandidatos cadastrados:"
          menuCandidato.gerenciarCandidato()
          break
        case 3:
          println "\nCompetências cadastradas:"
         menuCompetencia.gerenciarCompetencia()
          break
        case 4:
          println "Saindo do programa..."
          return
        default:
          println "Opção inválida! Por favor, escolha uma opção válida."
      }
    } catch (NumberFormatException exception) {
      println "Entrada inválida! Por favor, insira um número. ${exception}"
    }
  }
}
