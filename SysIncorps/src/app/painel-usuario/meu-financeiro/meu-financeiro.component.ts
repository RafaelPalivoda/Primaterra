import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'meu-financeiro',
  templateUrl: './meu-financeiro.component.html',
  styleUrls: ['./meu-financeiro.component.scss']
})
export class MeuFinanceiroComponent implements OnInit {
  financeiroMegaMenu: string[] = [
    'Plano de contas',
    'Contas a pagar',
    'Aportes',
    'Antecipação de receitas  '
  ];
  constructor() { }

  ngOnInit(): void {
  }

}
