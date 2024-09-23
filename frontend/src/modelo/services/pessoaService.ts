export default interface PessoaService {
    nome: string
    email: string
    estato:string
    cep: string //Pensar sobre o tipo
    descricao: string
    competencias: any

    cadastrar<T>(): T
}