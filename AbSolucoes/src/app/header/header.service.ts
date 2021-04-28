import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HeaderService {

  getMenu(){
    return ["Início", "Sobre", "Sistemas", "Equipamentos", "Infraestrutra em TI", "Suporte", "Contato"];
  }

  constructor() {

  }
}
