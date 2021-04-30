import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PaginaLoginComponent } from './pagina-login/pagina-login.component';
import { LoginHeaderComponent } from './pagina-login/login-header/login-header.component';
import { LoginFooterComponent } from './pagina-login/login-footer/login-footer.component';
import { LoginAppComponent } from './pagina-login/login-app/login-app.component';
import { PainelUserComponent } from './painel-user/painel-user.component';
import { HeaderPainelComponent } from './painel-user/header-painel/header-painel.component';
import { CadastrarEntidadeComponent } from './painel-user/cadastrar-entidade/cadastrar-entidade.component';

@NgModule({
  declarations: [
    AppComponent,
    PaginaLoginComponent,
    LoginHeaderComponent,
    LoginFooterComponent,
    LoginAppComponent,
    PainelUserComponent,
    HeaderPainelComponent,
    CadastrarEntidadeComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
