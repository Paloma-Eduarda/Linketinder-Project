import com.acelerazg.classes.Candidato
import com.acelerazg.classes.Empresa
import com.acelerazg.service.CandidatoService
import com.acelerazg.service.EmpresaService

static void main(String[] args) {

  Candidato p1 = new Candidato(
          nome:"Paloma Eduarda",
          email:"paloma@gmail.com",
          cpf: "000.000.000-00",
          idade: 22,
          estado:"RN",
          cep:"590-000",
          descricao:"Estudande de Análise e Desenvolvimento de Sistemas")

  Candidato p2 = new Candidato(
          nome:"João Carlos",
          email:"joao@gmail.com",
          cpf: "111.111.111-11",
          idade: 28,
          estado:"SP",
          cep:"0001-0000",
          descricao:"Engenheiro civil experiente, sempre em busca de novos desafios. ")

  Candidato p3 = new Candidato(
          nome:"Maria Fernanda",
          email:"fernanda@gmail.com",
          cpf: "222.222.222-22",
          idade: 33,
          estado:"RJ",
          cep:"20000-000",
          descricao:"Professora de inglês e amante de literatura.")

  Candidato p4 = new Candidato(
          nome:"Ana Beatriz",
          email:"beatriz@gmail.com",
          cpf: "333.333.333-33",
          idade: 25,
          estado:"BA",
          cep:"40000-000",
          descricao:"Estudante de design gráfico, com interesse em arte digital e fotografia")

  Candidato p5 = new Candidato(
          nome:"Rafael",
          email:"rafael@gmail.com",
          cpf: "444.444.444-44",
          idade: 45,
          estado:"PA",
          cep:"80000-000",
          descricao:"Advogado especializado em direito empresarial. ")

  Empresa empresa1 = new Empresa(
          nome:"Tech Solutions Ltda",
          email:"contato@techsolutions.com.br",
          cnpj:"12.345.678/0001-99",
          estado: "São Paulo",
          pais:"Brasil",
          cep:"01100-000",
          descricao: "Empresa de desenvolvimento de software, especializada em soluções personalizadas para o setor financeiro.")

  Empresa empresa2 = new Empresa(
          nome: "Green Energy Corp",
          email: "contato@greenenergy.com",
          cnpj: "23.456.789/0001-88",
          estado: "Rio de Janeiro",
          pais: "Brasil",
          cep: "22000-000",
          descricao: "Empresa dedicada à pesquisa e implementação de energias renováveis, com foco em energia solar e eólica."
  )

  Empresa empresa3 = new Empresa(
          nome: "EducaOnline S.A.",
          email: "contato@educaonline.com.br",
          cnpj: "34.567.890/0001-77",
          estado: "Minas Gerais",
          pais: "Brasil",
          cep: "30100-000",
          descricao: "Plataforma de ensino à distância, oferecendo cursos em diversas áreas, como tecnologia, negócios e idiomas."
  )

  Empresa empresa4 = new Empresa(
          nome: "AgroMais Ltda",
          email: "contato@agromais.com.br",
          cnpj: "45.678.901/0001-66",
          estado: "Goiás",
          pais: "Brasil",
          cep: "74000-000",
          descricao: "Empresa especializada em agronegócio, fornecendo insumos agrícolas e soluções tecnológicas para o campo."
  )

  Empresa empresa5 = new Empresa(
          nome: "FastDelivery Express",
          email: "contato@fastdelivery.com",
          cnpj: "56.789.012/0001-55",
          estado: "Paraná",
          pais: "Brasil",
          cep: "80000-001",
          descricao: "Empresa de logística e transporte rápido, oferecendo serviços de entrega expressa em todo o território nacional."
  )
  CandidatoService ps = new CandidatoService()
  ps.cadastrar(p1)
  ps.cadastrar(p2)
  ps.cadastrar(p3)
  ps.cadastrar(p4)
  ps.cadastrar(p5)

  EmpresaService pj = new EmpresaService()
  pj.cadastrar(empresa1)
  pj.cadastrar(empresa2)
  pj.cadastrar(empresa3)
  pj.cadastrar(empresa4)
  pj.cadastrar(empresa5)

  def scanner = new Scanner(System.in)

  while (true) {
    println "\nMenu:"
    println "1. Listar Empresas"
    println "2. Listar Pessoas"
    println "3. Sair"
    print "Escolha uma opção: "

    def opcao = scanner.nextLine().toInteger()

    switch(opcao) {
      case 1:
        println "\nEmpresas cadastradas:"
        println pj.listar()
        break
      case 2:
        println "\nPessoas cadastradas:"
        println ps.listar()
        break
      case 3:
        println "Saindo do programa..."
        System.exit(0)
      default:
        println "Opção inválida! Por favor, escolha uma opção válida."
    }
  }
}