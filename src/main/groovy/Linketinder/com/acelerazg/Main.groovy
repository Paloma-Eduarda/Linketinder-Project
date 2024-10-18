package Linketinder.com.acelerazg

import Linketinder.com.acelerazg.menu.MenuCandidato
import Linketinder.com.acelerazg.menu.MenuCompetencia
import Linketinder.com.acelerazg.menu.MenuEmpresa


static void main(String[] args) {

  Scanner scanner = new Scanner(System.in)
  MenuCandidato menuCandidato = new MenuCandidato()
  MenuEmpresa menuEmpresa = new MenuEmpresa()
  MenuCompetencia menuCompetencia = new MenuCompetencia()

  while (true) {
    println "\nMenu:"
    println "1. Gerenciar Empresas"
    println "2. Gerenciar Candidatos"
    println "3. Gerenciar Competências"
    println "4. Sair"
    print "Escolha uma opção: "

    String input = scanner.nextLine().trim()

    if (input.isEmpty()) {
      println "Entrada vazia! Por favor, digite um número."
      continue
    }

    try {
      def opcao = input.toInteger() // Converter a String para Integer

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
    } catch (NumberFormatException e) {
      println "Entrada inválida! Por favor, insira um número."
    }
  }
}
