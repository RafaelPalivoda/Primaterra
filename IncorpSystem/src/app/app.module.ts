import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { PaginaLoginComponent } from './pagina-login/pagina-login/pagina-login.component';
import { PainelUsuarioComponent } from './painel-usuario/painel-usuario/painel-usuario.component';
import { CadastrarEntidadeComponent } from './painel-usuario/cadastrar/cadastrar-entidade/cadastrar-entidade.component';
import { PlanoDeContasComponent } from './painel-usuario/financeiro/plano-de-contas/plano-de-contas.component';
import { MinhasAreasComponent } from './painel-usuario/areas/minhas-areas/minhas-areas.component';

@NgModule({
  declarations: [
    AppComponent,
    PaginaLoginComponent,
    PainelUsuarioComponent,
    CadastrarEntidadeComponent,
    PlanoDeContasComponent,
    MinhasAreasComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
