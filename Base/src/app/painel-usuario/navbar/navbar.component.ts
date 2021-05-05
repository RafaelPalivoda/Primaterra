import { CadastrarEntidadeComponent } from './../cadastrar-entidade/cadastrar-entidade.component';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {

  public show: boolean = false;
  public buttonName: string = 'Show';

  toggle() {
    this.show = !this.show;

    if (this.show)
      this.buttonName = "Hide";
    else
      this.buttonName = "Show";
  }

  constructor() { }

  ngOnInit(): void {
  }

}
