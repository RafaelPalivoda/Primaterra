import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pagina-login',
  templateUrl: './pagina-login.component.html',
  styleUrls: ['./pagina-login.component.css']
})
export class PaginaLoginComponent implements OnInit {

  constructor(private router: Router) { }

  btnChange() {
    this.router.navigateByUrl('/painel-usuario');
  }

  ngOnInit(): void {
  }

}
