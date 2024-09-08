import com.acelerazg.classes.PessoaFisica
import com.acelerazg.classes.PessoaJuridica

static void main(String[] args) {

  PessoaFisica p1 = new PessoaFisica(
          nome:"Paloma Eduarda",
          email:"paloma@gmail.com",
          cpf: "000.000.000-00",
          idade: 22,
          estado:"RN",
          cep:"590-000",
          descricao:"Estudande de Análise e Desenvolvimento de Sistemas")

  PessoaFisica p2 = new PessoaFisica(
          nome:"João Carlos",
          email:"joao@gmail.com",
          cpf: "111.111.111-11",
          idade: 28,
          estado:"SP",
          cep:"0001-0000",
          descricao:"Engenheiro civil experiente, sempre em busca de novos desafios. ")

  PessoaFisica p3 = new PessoaFisica(
          nome:"Maria Fernanda",
          email:"fernanda@gmail.com",
          cpf: "222.222.222-22",
          idade: 33,
          estado:"RJ",
          cep:"20000-000",
          descricao:"Professora de inglês e amante de literatura.")

  PessoaFisica p4 = new PessoaFisica(
          nome:"Ana Beatriz",
          email:"beatriz@gmail.com",
          cpf: "333.333.333-33",
          idade: 25,
          estado:"BA",
          cep:"40000-000",
          descricao:"Estudante de design gráfico, com interesse em arte digital e fotografia")

  PessoaFisica p5 = new PessoaFisica(
          nome:"Rafael",
          email:"rafael@gmail.com",
          cpf: "444.444.444-44",
          idade: 45,
          estado:"PA",
          cep:"80000-000",
          descricao:"Advogado especializado em direito empresarial. ")

  PessoaJuridica empresa1 = new PessoaJuridica(
          nome:"Tech Solutions Ltda",
          email:"contato@techsolutions.com.br",
          cnpj:"12.345.678/0001-99",
          estado: "São Paulo",
          pais:"Brasil",
          cep:"01100-000",
          descricao: "Empresa de desenvolvimento de software, especializada em soluções personalizadas para o setor financeiro.")

  PessoaJuridica empresa2 = new PessoaJuridica(
          nome: "Green Energy Corp",
          email: "contato@greenenergy.com",
          cnpj: "23.456.789/0001-88",
          estado: "Rio de Janeiro",
          pais: "Brasil",
          cep: "22000-000",
          descricao: "Empresa dedicada à pesquisa e implementação de energias renováveis, com foco em energia solar e eólica."
  )

  PessoaJuridica empresa3 = new PessoaJuridica(
          nome: "EducaOnline S.A.",
          email: "contato@educaonline.com.br",
          cnpj: "34.567.890/0001-77",
          estado: "Minas Gerais",
          pais: "Brasil",
          cep: "30100-000",
          descricao: "Plataforma de ensino à distância, oferecendo cursos em diversas áreas, como tecnologia, negócios e idiomas."
  )

  PessoaJuridica empresa4 = new PessoaJuridica(
          nome: "AgroMais Ltda",
          email: "contato@agromais.com.br",
          cnpj: "45.678.901/0001-66",
          estado: "Goiás",
          pais: "Brasil",
          cep: "74000-000",
          descricao: "Empresa especializada em agronegócio, fornecendo insumos agrícolas e soluções tecnológicas para o campo."
  )

  PessoaJuridica empresa5 = new PessoaJuridica(
          nome: "FastDelivery Express",
          email: "contato@fastdelivery.com",
          cnpj: "56.789.012/0001-55",
          estado: "Paraná",
          pais: "Brasil",
          cep: "80000-001",
          descricao: "Empresa de logística e transporte rápido, oferecendo serviços de entrega expressa em todo o território nacional."
  )

  println p1.email
  print "---------Menu----------"
  print'''
[1] - Listar empresas
[2] - Listar candidatos'''

}