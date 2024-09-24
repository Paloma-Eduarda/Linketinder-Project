export class Vaga {
    constructor(private _empresa:string, private _titulo:string, private _formato:string, private _local:string,
                private _descricao:string, private _competencias: Array<string>, private _qualificacoes: string) {
    }

    get empresa(): string {
        return this._empresa;
    }

    set empresa(value: string) {
        this._empresa = value;
    }

    get titulo(): string {
        return this._titulo;
    }

    set titulo(value: string) {
        this._titulo = value;
    }

    get formato(): string {
        return this._formato;
    }

    set formato(value: string) {
        this._formato = value;
    }

    get local(): string {
        return this._local;
    }

    set local(value: string) {
        this._local = value;
    }

    get descricao(): string {
        return this._descricao;
    }

    set descricao(value: string) {
        this._descricao = value;
    }

    get competencias(): Array<string> {
        return this._competencias;
    }

    set competencias(value: Array<string>) {
        this._competencias = value;
    }

    get qualificacoes(): string {
        return this._qualificacoes;
    }

    set qualificacoes(value: string) {
        this._qualificacoes = value;
    }
}