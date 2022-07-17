export class proyecto {
    id?: number;
    nombre: String;
    descripcion: String;
    img: String;
 

    constructor(nombre: String, descripcion: String, img: String){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img = img;
       
    }
}