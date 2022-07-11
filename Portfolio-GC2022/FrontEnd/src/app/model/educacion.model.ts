export class educacion {
    id?: number;
    institucion: String;
    titulo: String;
    fecha_inicio: String;
    fecha_fin: String;
    promedio: String;

    constructor(institucion: String, titulo: String, fecha_inicio: String, fecha_fin: String, promedio: String){
        this.institucion = institucion;
        this.titulo = titulo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.promedio = promedio;
    }
}