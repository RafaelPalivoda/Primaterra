import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PaginaInicialComponent } from './pagina-inicial/pagina-inicial.component';
import { PainelUsuarioComponent } from './painel-usuario/painel-usuario.component';

const routes: Routes = [
  {
    path: 'painel-usuario',
    component: PaginaInicialComponent
  },
  {
    path: '',
    component: PainelUsuarioComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
