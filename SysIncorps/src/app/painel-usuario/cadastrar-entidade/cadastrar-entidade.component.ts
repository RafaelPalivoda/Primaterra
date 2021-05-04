import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'cadastrar-entidade',
  templateUrl: './cadastrar-entidade.component.html',
  styleUrls: ['./cadastrar-entidade.component.scss']
})
export class CadastrarEntidadeComponent implements OnInit {

  cadastrarMegaMenu: string[] = [
    'Entidades',
    'Tipos de projetos',
    'Etapas dos projetos',
    'Tipo de negociação',
    'Cadastrar receita',
    'Cadastrar despesa',
    'Centro de custo'
  ];


  constructor() { }

  ngOnInit(): void {
  }

}
