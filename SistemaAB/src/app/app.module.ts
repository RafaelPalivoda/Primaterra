import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { PaginaLoginComponent } from './pagina-login/pagina-login.component';
import { PainelUsuarioComponent } from './painel-usuario/painel-usuario.component';
import { NotFoundComponent } from './not-found/not-found.component';

@NgModule({
  declarations: [
    AppComponent,
    PaginaLoginComponent,
    PainelUsuarioComponent,
    NotFoundComponent,

  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {
        path: '',
        component: PaginaLoginComponent
      },
      {
        path: 'painel-usuario',
        component: PainelUsuarioComponent
      },
      {
        path: '**',
        component: NotFoundComponent
      }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
