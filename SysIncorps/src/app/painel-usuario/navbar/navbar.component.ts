import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {

  items: string[] = ['Cadastrar pessoa física', 'Cadastrar pessoa jurídica'];

  constructor() { }

  ngOnInit(): void {
  }

}
