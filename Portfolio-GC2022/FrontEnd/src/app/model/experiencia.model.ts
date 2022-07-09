export class experiencia {
    id?: number;
    empresa: String;
    fecha_inicio: String;
    fecha_fin: String;
    cargo: String;
    descripcion:String;

    constructor(empresa: String, fecha_inicio: String, fecha_fin: String, cargo: String, descripcion: String){
        this.empresa = empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.cargo = cargo;
        this.descripcion = descripcion;
    }
}