export class persona {
    id?: number;
    nombre: String;
    apellido: String;
    img: String;
    acercaDe: String;

    constructor(nombre: String, apellido: String, img: String, acercaDe: String){
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.acercaDe = acercaDe;
    }
}