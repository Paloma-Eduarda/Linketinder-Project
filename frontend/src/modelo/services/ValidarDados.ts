export function validaNome(nome:string): boolean{

    const regex_nome = /^[A-zÁ-ú]{2,}$/g
    const  match:boolean = regex_nome.test(nome)

    if(!match){
        alert('Nome invalido')
    }
    return match
}
export function validaEmail(email:string): boolean{
    const regex_email = /\S+@\w+\.\w{2,6}(\.\w{2})?/g

    const  match:boolean = regex_email.test(email)

    if(!match){
        alert('Email invalido')
    }
    return match

}
export function validaCpf(cpf:string): boolean{
    const regex_cpf = /^\d{3}\.?\d{3}\.?\d{3}-?\d{2}$/g
    const match:boolean = regex_cpf.test(cpf)

    if(!match){
        alert('CPF invalido')
    }
    return match
}
export function validaCep(cep: string): boolean{
    const regex_cep = /^\d{5}-?\d{3}$/g
    const match:boolean = regex_cep.test(cep)

    if(!match){
        alert('CEP invalido')
    }
    return match
}

export function validaIdade(idade:string): boolean{
    const regex_idade = /^(1[89]|[2-9]\d|100)$/
    const match:boolean = regex_idade.test(idade)

    if(!match){
        alert('Idade invalido')
    }
    return match
}
export function validaCnpj(cnpj: string): boolean{
    const regex_cnpj = /^\d{2}\.?\d{3}\.?\d{3}\/?\d{4}-?\d{2}$/g
    const match:boolean = regex_cnpj.test(cnpj)

    if(!match){
        alert('CNPJ invalido')
    }
    return match
}

