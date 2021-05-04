import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'minhas-areas',
  templateUrl: './minhas-areas.component.html',
  styleUrls: ['./minhas-areas.component.scss']
})
export class MinhasAreasComponent implements OnInit {
  areaMegaMenu: string[] = [
    'Areas',
    'Empreendimentos',
    'Permutas'
  ];
  constructor() { }

  ngOnInit(): void {
  }

}
